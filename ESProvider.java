import java.util.HashMap;
import java.util.Map;

/**
 * Created by akos on 2017.02.07..
 */
public class ESProvider {

    private HashMap<String, Boolean> evaluatedAnswerMap = new HashMap<>();
    private RuleRepository ruleRepository;
    private FactParser factParser;
    private RuleParser ruleParser;

    public HashMap<String, Boolean> getEvaluatedAnswerMap() {
        return evaluatedAnswerMap;
    }

    public void setEvaluatedAnswerMap(String id, Boolean value) {
        evaluatedAnswerMap.put(id, value);
    }

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
        for (Map.Entry<String, Question> e : ruleRepository.ruleMap.entrySet())
        {
            e.getValue().getEvaluatedAnswer()

        }

        return null;
    }

}
