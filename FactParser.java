import org.w3c.dom.Document;
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
    public void loadXmlDocument(String fullPath) {
        String filename = "Home/Java/xpertSystem/Rules.xml";

        try {
            FileInputStream file = new FileInputStream(new File(filename));

            DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();

            DocumentBuilder builder = builderFactory.newDocumentBuilder();

            Document xmlDocument = builder.parse(file);

            XPath xPath = XPathFactory.newInstance().newXPath();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

