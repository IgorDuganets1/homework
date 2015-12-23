package soap;

import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

public interface methods {

	public List<String> requestLetterSolutions (String anagram);
	public List<String> requestLetterSolutionsMin (String anagram, int minLetters );
	public List<String> expectedWords (int row, String anagram);
	public List<String> requestLetterSolutionsMinErrorMaxLetters(List<String> expectedWords)
			throws SAXException, IOException, ParserConfigurationException;
	
}
