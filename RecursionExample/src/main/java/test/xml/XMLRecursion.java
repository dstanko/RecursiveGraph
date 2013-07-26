package test.xml;

import java.io.File;
import java.io.FileInputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLRecursion {
	public void parse() throws Exception {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		dbf.setValidating(false);
		DocumentBuilder db = dbf.newDocumentBuilder();
		
		Document doc = db.parse(new FileInputStream(new File("C:/GrailsWorkspace/RecursionExample/src/main/java/test/xml/in.xml")));
		printNodeContent(doc, "title");
	}

	public static void printNodeContent(Node node, String nodeName) 
	{
		NodeList list = node.getChildNodes();
		for (int i = 0; i < list.getLength(); i++) 
		{
			Node childNode = list.item(i);
			if (nodeName.equals(childNode.getNodeName()))
			{
				System.out.println(childNode.getNodeName() + " : " + childNode.getTextContent());
			}
			// visit child node
			printNodeContent(childNode, nodeName);
		}
	}
}
