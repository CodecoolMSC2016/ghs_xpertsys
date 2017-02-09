import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;
import java.io.File;
import java.io.FileInputStream;


public class FactParser extends XmlParser
{
    public FactRepository getFactRepository()
    {
        return null;
    }

    @Override
    public void loadXmlDocument(String fullPath)
    {
        fullPath = "Home/Java/xpertSystem/Facts.xml";

        try
        {
            FileInputStream file = new FileInputStream(new File(fullPath));
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dbFactory.newDocumentBuilder();
            Document xmlDocument = builder.parse(file);

            xmlDocument.getDocumentElement().normalize();

        }
        catch (Exception e)
        {
            System.out.println("An error occurred during object initialization.");
        }
    }

    public void parseXml(String fileName)
    {
        Document doc = loadXmlDocument(fileName);
    }
}

