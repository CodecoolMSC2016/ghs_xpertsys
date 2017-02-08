
public class RuleParser extends XmlParser
{
    public RuleRepository getRuleRepository()
    {
        String filename = "";
        loadXmlDocument(filename);
        RuleRepository rep = new RuleRepository();
        rep.addQuestion("1", null);
        return rep;
    }
}
