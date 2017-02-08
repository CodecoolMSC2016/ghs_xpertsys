import org.w3c.dom.NodeList;

public class RuleParser extends XmlParser
{
    private NodeList nodeList;

    public void loadXmlDocument(String fullPath)
    {
        try
        {

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
        RuleRepository rep = new RuleRepository();
        rep.addQuestion("1", null);
        return rep;
    }
}
