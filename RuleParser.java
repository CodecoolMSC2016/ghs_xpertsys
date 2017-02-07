/**
 * Created by akos on 2017.02.07..
 */
public class RuleParser extends XmlParser
{
    public RuleRepository getRuleRepository()
    {
        RuleRepository rep = new RuleRepository();
        rep.addQuestion("1", null);
        return rep;
    }
}
