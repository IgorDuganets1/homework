package soap;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.junit.Test;
import org.xml.sax.SAXException;

import soap.methods;
import soap.soapMethods;

public class Webservice_test {

	private final String anagram = "testing";
	
	
	@Test
	public void testLetterSolutions() {
		
		methods m = new soapMethods();
		
 		System.out.println("exelReadList :" + m.expectedWords(1,anagram));
		System.out.println("requestValue :" + m.requestLetterSolutionsMin(anagram, 1));

		assertThat(m.requestLetterSolutions(anagram), is(m.expectedWords(1,anagram)));
	}
	
	@Test
	public void testLetterSolutionsMin_3() {
		
		int minLetters = 3;
		methods m = new soapMethods();
	
 		System.out.println("exelReadList " + minLetters + ":" + m.expectedWords(minLetters,anagram));
		System.out.println("requestValue " + minLetters + ":" + m.requestLetterSolutionsMin(anagram, minLetters));

		assertThat(m.requestLetterSolutionsMin(anagram, minLetters), is(m.expectedWords(minLetters,anagram)));
		 
	}
	
	@Test
	public void testLetterSolutionsMin_4() {
		
		int minLetters = 4;
		methods m = new soapMethods();
	
 		System.out.println("exelReadList " + minLetters + ":" + m.expectedWords(minLetters,anagram));
		System.out.println("requestValue " + minLetters + ":" + m.requestLetterSolutionsMin(anagram, minLetters));

		assertThat(m.requestLetterSolutionsMin(anagram, minLetters), is(m.expectedWords(minLetters,anagram)));
		 
	}
	
	@Test
	public void testLetterSolutionsMin_5() {
		
		int minLetters = 5;
		methods m = new soapMethods();
	
 		System.out.println("exelReadList " + minLetters + ":" + m.expectedWords(minLetters,anagram));
		System.out.println("requestValue " + minLetters + ":" + m.requestLetterSolutionsMin(anagram, minLetters));

		assertThat(m.requestLetterSolutionsMin(anagram, minLetters), is(m.expectedWords(minLetters,anagram)));
		 
	}

	@Test
	public void testLetterSolutionsMin_6() {
		
		int minLetters = 6;
		methods m = new soapMethods();
	
 		System.out.println("exelReadList " + minLetters + ":" + m.expectedWords(minLetters,anagram));
		System.out.println("requestValue " + minLetters + ":" + m.requestLetterSolutionsMin(anagram, minLetters));

		assertThat(m.requestLetterSolutionsMin(anagram, minLetters), is(m.expectedWords(minLetters,anagram)));
		 
	}
	
	
	@Test
	public void testLetterSolutionsMin_7() {
		
		int minLetters = 7;
		methods m = new soapMethods();
	
 		System.out.println("exelReadList " + minLetters + ":" + m.expectedWords(minLetters,anagram));
		System.out.println("requestValue " + minLetters + ":" + m.requestLetterSolutionsMin(anagram, minLetters));

		assertThat(m.requestLetterSolutionsMin(anagram, minLetters), is(m.expectedWords(minLetters,anagram)));
		 
	}
	
	
	@Test
	public void testLetterSolutionsMin_8() throws SAXException, IOException, ParserConfigurationException {
		
		int minLetters = 8;
		methods m = new soapMethods();
	
 		System.out.println("exelReadList " + minLetters + ":" + m.expectedWords(minLetters,anagram));
		System.out.println("requestValue " + minLetters + ":" + m.requestLetterSolutionsMinErrorMaxLetters(m.expectedWords(minLetters,anagram)));

		assertThat(m.expectedWords(minLetters,anagram), is(m.expectedWords(minLetters,anagram)));
		 
	}
}
