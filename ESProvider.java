/**
 * Created by akos on 2017.02.07..
 */
public class ESProvider {
    private RuleRepository ruleRepository;
    private FactParser factParser;
    private RuleParser ruleParser;

    public ESProvider(FactParser factParser, RuleParser ruleParser)
    {
        RuleRepository ruleRepository = ruleParser.getRuleRepository();
        this.factParser = factParser;
        this.ruleParser = ruleParser;
    }

    public void collectAnswers()
    {

    }

    public boolean getAnswerByQuestion(String QuestionID)
    {
        return false;
    }
    public String evaluate()
    {
        return null;
    }

}
