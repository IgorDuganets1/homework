package soap;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.xml.sax.SAXException;

import com.aonaware.services.webservices.ArrayOfString;
import com.aonaware.services.webservices.CountCheatService;
import com.aonaware.services.webservices.CountCheatServiceSoap;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class soapMethods implements methods{

	@Override
	public List<String> requestLetterSolutions(String anagram) {
		CountCheatService countcheatservice = new CountCheatService ();
		CountCheatServiceSoap getcountcheatservicesoap = countcheatservice.getCountCheatServiceSoap();
		ArrayOfString value = getcountcheatservicesoap.letterSolutions(anagram);
		return value.getString();
	}
	
	@Override
	public List<String> requestLetterSolutionsMin(String anagram, int minLetters) {
		CountCheatService countcheatservice = new CountCheatService ();
		CountCheatServiceSoap getcountcheatservicesoap = countcheatservice.getCountCheatServiceSoap();
		
		ArrayOfString value = getcountcheatservicesoap.letterSolutionsMin(anagram, minLetters);
		return value.getString();
	}

	
	
	@Override
	public List<String> expectedWords(int row, String anagram) {
		
		Workbook workbook = null;
		try {
			workbook = Workbook.getWorkbook(new File("list.xls"));
		} catch (BiffException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
 		
		Sheet sheet = workbook.getSheet(0);
 		ArrayList<String> expectedWords = new ArrayList<String>();
 		
 		if (anagram.length() < row) 
 		{
 		//	Cell cell1 = sheet.getCell(2, 0);
 	 		expectedWords.add( sheet.getCell(2, 0).getContents());
 	 		expectedWords.add( sheet.getCell(2, 1).getContents());
 	 		
 	 		workbook.close(); 
			return expectedWords;
 			
 		}
 		
 		for (int i=0; i<sheet.getRows();i++)
 		{
 		Cell cell1 = sheet.getCell(0, i);
 		String value = cell1.getContents();
 			if ((value.isEmpty())|(value.length() < row))   
 				{workbook.close(); 
 				return expectedWords;}
 			else  
 				
 				expectedWords.add( value);
 		}
 		
 		workbook.close(); 
 		return expectedWords;
	}

	
	@Override
	public List<String> requestLetterSolutionsMinErrorMaxLetters (List<String> expectedWords) throws SAXException, IOException, ParserConfigurationException {
		
		ArrayList<String> errorRequest = new ArrayList<String>();
		String search1 = expectedWords.get(0);
		String search2 = expectedWords.get(1);
		
		try {
		     
	         //Сначала создаем соединение
	         SOAPConnectionFactory soapConnFactory = SOAPConnectionFactory.newInstance();
	         SOAPConnection connection = soapConnFactory.createConnection();
	         
	         //Затем создаем сообщение
	         MessageFactory messageFactory = MessageFactory.newInstance();
	         SOAPMessage message = messageFactory.createMessage();
	         
	         //Создаем объекты, представляющие различные компоненты сообщения        
	         SOAPPart soapPart = message.getSOAPPart();
	           
	         //Формирование сообщения
	         StreamSource preppedMsgSrc = new StreamSource(  new FileInputStream("request8letters.txt"));
	         soapPart.setContent(preppedMsgSrc);

	          //Сохранение сообщения
	          message.saveChanges();
	          
	        //Отправка сообщения и получение ответа
	          
	          //Установка адресата
	          String destination = 
	              "http://services.aonaware.com/CountCheatService/CountCheatService.asmx";
	          //Отправка
	          SOAPMessage reply = connection.call(message, destination);
	   	          //Создание XSLT-процессора
	          TransformerFactory transformerFactory = 
	                             TransformerFactory.newInstance();
	          Transformer transformer = 
	                          transformerFactory.newTransformer();
	          //Получение содержимого ответа
	          Source sourceContent = reply.getSOAPPart().getContent();
	           
	           
	         //create a StringWriter for the output
	           StringWriter outWriter = new StringWriter();
	         //Задание выходного потока для результата преобразования
	           StreamResult result = new StreamResult( outWriter );

	           transformer.transform( sourceContent, result );  
	           StringBuffer sb = outWriter.getBuffer(); 
	           String finalstring = sb.toString();
	     
	           if ((finalstring.toLowerCase().indexOf(search1.toLowerCase()) != -1 )|(finalstring.toLowerCase().indexOf(search2.toLowerCase()) != -1 )) {

	        	   errorRequest.add( search1);
	        	   errorRequest.add( search2);
	       
	           } else {
	        	   errorRequest.add( "Expected error message not found");
	         	           }
	          	    
	        //Закрываем соединение
	         connection.close();
	    //     return errorRequest;
	        } catch(Exception e) {
	            System.out.println(e.getMessage());
	        }
		return errorRequest;
		
	}

	  


}
