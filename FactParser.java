import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;
import java.io.File;
import java.io.FileInputStream;


public class FactParser extends XmlParser
{
    String fileName = "Facts.xml";
    private NodeList nodeList;

    public FactRepository getFactRepository()
    {
        FactRepository factRepo = new FactRepository();

        String description = "";
        loadXmlDocument(fileName);


        for(int i = 0; i < nodeList.getLength(); i++)
        {

            Node node = nodeList.item(i);
            Node tempNode = ((Element) node).getElementsByTagName("description").item(0);
            description = ((Element)tempNode).getAttribute("value");

            String factId = ((Element)node).getAttribute("id");

            Fact fact = new Fact(description);
            fact.setId(factId);
            parseEvals(node, fact);

            factRepo.addFact(fact);
        }
        return factRepo;
    }

    public void parseEvals(Node node, Fact fact)
    {
        NodeList evalList = ((Element)((Element)node).getElementsByTagName("Evals").item(0))
                .getElementsByTagName("Eval");
        for (int i = 0; i < evalList.getLength(); i++)
        {
            Node evalNode = evalList.item(i);
            String evalId = ((Element) evalNode).getAttribute("id");
            Boolean evalValue = Boolean.parseBoolean(evalNode.getTextContent());

            fact.setFactValueByID(evalId, evalValue);
        }
    }

    @Override
    public void loadXmlDocument(String fullPath)
    {

        try
        {
            FileInputStream file = new FileInputStream(new File(fullPath));
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dbFactory.newDocumentBuilder();
            Document xmlDocument = builder.parse(file);

            xmlDocument.getDocumentElement().normalize();

            NodeList nodeList = xmlDocument.getElementsByTagName("Fact");

        }
        catch (Exception e)
        {
            System.out.println("An error occurred during object initialization.");
        }
    }


}

