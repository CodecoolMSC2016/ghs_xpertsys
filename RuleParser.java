import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.FileInputStream;

public class RuleParser extends XmlParser
{
    private NodeList nodeList;

    public void loadXmlDocument(String fullPath)
    {

        try
        {
            FileInputStream file = new FileInputStream(new File(fullPath));
            DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = builderFactory.newDocumentBuilder();
            Document xmlDocument = builder.parse(file);
            xmlDocument.getDocumentElement().normalize();
            NodeList nodeList = xmlDocument.getElementsByTagName("Rule");

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public RuleRepository getRuleRepository()
    {
        String filename = "";
        loadXmlDocument(filename);
        RuleRepository repo = new RuleRepository();
        for(int i = 0; i<nodeList.getLength(); i++)
        {
            Node node = nodeList.item(i);

            String id = ((Element)node).getAttribute("id");
            String questionmsg = ((Element) node).getElementsByTagName("Question").item(0).getTextContent();
            Question question = new Question(questionmsg);
            Value value = generateValue(node);
            repo.addQuestion(id, question);
        }
        return repo;
    }
    public Value generateValue(Node node)
    {
        Element e = (Element) ((Element)node).getElementsByTagName("Answer");
        e.getAttribute()
        Value value;
        return value;
    }
}
