import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Test {
	public static void main(String[] args ) throws ParserConfigurationException, SAXException, IOException
	{
		Reader reader = new Reader();
		String result = reader.getString( new File("C:\\Users\\Erivan\\Desktop\\FamilyHistory.xml"));
		
		System.out.println( result);
	}

}