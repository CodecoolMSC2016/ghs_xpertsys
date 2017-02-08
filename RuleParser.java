import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

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
            String questionmsg = ((Element) node).getAttribute("question");
            Question question = new Question(questionmsg);
            repo.addQuestion(id, question);
        }
        return repo;
    }
}
