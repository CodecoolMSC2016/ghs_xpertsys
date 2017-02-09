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
            nodeList = xmlDocument.getElementsByTagName("Rule");

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public RuleRepository getRuleRepository()
    {
        String filename = "Rules.xml";
        loadXmlDocument(filename);
        RuleRepository repo = new RuleRepository();
        for(int i = 0; i<nodeList.getLength(); i++)
        {
            Node node = nodeList.item(i);

            String id = ((Element)node).getAttribute("id");
            String questionMsg = ((Element) node).getElementsByTagName("Question").item(0).getTextContent();
            Question question = new Question(questionMsg);
            Value value = generateValue(node);
            Answer answer = new Answer();
            answer.addValue(value);
            question.setAnswerEvaluator(answer);
            repo.addQuestion(id, question);
        }
        return repo;
    }
    public Value generateValue(Node node)
    {
        Value value;
        Node answerNode = ((Element)node).getElementsByTagName("Answer").item(0);
        NodeList selections = ((Element)answerNode).getElementsByTagName("Selection");
        Node trueSel = selections.item(0), falseSel = selections.item(1);
        for(int i=0;i<trueSel.getChildNodes().getLength();i++)
        {
            if(trueSel.getChildNodes().item(i).getNodeName() == "SingleValue")
            {
                value = new SingleValue(trueSel.getTextContent().trim());
                ((SingleValue) value).setFalseValue(falseSel.getTextContent().trim());
                return value;
            }
            else if(trueSel.getChildNodes().item(i).getNodeName() == "MultipleValue")
            {
                value = new MultipleValue(trueSel.getTextContent().trim());
                ((MultipleValue) value).setFalseValues(falseSel.getTextContent().trim());
                return value;
            }
        }
        return null;
    }
}
