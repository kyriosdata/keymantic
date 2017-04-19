import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Reader
{
	public static void main(String[] args ) throws ParserConfigurationException, SAXException, IOException
	{
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse( "C:\\Users\\Erivan\\Desktop\\FamilyHistory.xml");
		NodeList listaDeOntologias = doc.getElementsByTagName( "ontology");
		
		
		Node ontologias = listaDeOntologias.item(0);
		
		if(ontologias.getNodeType() == Node.ELEMENT_NODE )
		{
			Element elementoOntologias = (Element) ontologias;
			NodeList listaDeTermDefinitions = elementoOntologias.getChildNodes();						
			Node noFilho = listaDeTermDefinitions.item(1);
				
			if( noFilho.getNodeType() == Node.ELEMENT_NODE )
			{
				Element elementoFilho = (Element) noFilho;
				String texto = elementoFilho.getTextContent();
				boolean result = texto.contains("Family");
				System.out.println( result);
			}
		}
	}
	
	public String getString(File file) throws SAXException, IOException, ParserConfigurationException
	{
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse( file );
			NodeList listaDeOntologias = doc.getElementsByTagName( "ontology");
			
			
			Node ontologias = listaDeOntologias.item(0);
			
			if(ontologias.getNodeType() == Node.ELEMENT_NODE )
			{
				Element elementoOntologias = (Element) ontologias;
				NodeList listaDeTermDefinitions = elementoOntologias.getChildNodes();						
				Node noFilho = listaDeTermDefinitions.item(1);
					
				if( noFilho.getNodeType() == Node.ELEMENT_NODE )
				{
					Element elementoFilho = (Element) noFilho;
					String texto = elementoFilho.getTextContent();
					boolean result = texto.contains("Family");
					//System.out.println( result);
					
					return texto;
				}
			}
			return null;
	}
	
	public String[] getListOfAchetypeWords()
	{
		return null;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
}
