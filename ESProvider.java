import java.util.*;

/**
 * Created by akos on 2017.02.07..
 */
public class ESProvider {

    private HashMap<String, Boolean> evaluatedAnswerMap = new HashMap<>();
    private RuleRepository ruleRepository;
    private FactRepository factRepository;
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
        ruleRepository = ruleParser.getRuleRepository();
        factRepository = factParser.getFactRepository();
        this.factParser = factParser;
        this.ruleParser = ruleParser;
    }

    public void collectAnswers()
    {


        for (Map.Entry<String, Question> e : ruleRepository.ruleMap.entrySet())
        {   boolean b = false;
            Question question = e.getValue();
            while(!b)
            {
                System.out.println(question.getQuestion());
                Scanner scan = new Scanner(System.in);
                String answer = scan.next();


                ArrayList<String> inputPattern = new ArrayList<>
                        (Arrays.asList(question.getInputPattern()));
                if(inputPattern.contains(answer))
                {
                    evaluatedAnswerMap.put(e.getKey(), question.getEvaluatedAnswer(answer));
                    b = true;

                }

            }
        }
    }

    public boolean getAnswerByQuestion(String QuestionID)
    {
        return false;
    }
    public String evaluate()
    {
        for (Fact fact:factRepository.facts)
        {


            if(evaluatedAnswerMap.equals(fact.evalMap))
            {
                return fact.getDescription();
            }
        }
        return null;
    }

    void debugPrintStats()
    {
        for (Map.Entry<String, Question> e : ruleRepository.ruleMap.entrySet())
        {
            System.out.println(e.getKey());
            System.out.println(e.getValue().getQuestion());

        }
        for(Fact fact:factRepository.facts){
            System.out.println(fact.getDescription());
            System.out.println(fact.getIDSet());

            for (Map.Entry<String, Boolean> e : fact.evalMap.entrySet())
            {
                System.out.println(e.getValue() + "\t" + e.getKey());
            }
        }
    }
}
