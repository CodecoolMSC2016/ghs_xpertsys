import java.util.Map;
import java.util.Scanner;

/**
 * Created by akos on 2017.02.07..
 */
public class ESProvider {
    private RuleRepository ruleRepository;
    private FactRepository factRepository;
    private FactParser factParser;
    private RuleParser ruleParser;

    public ESProvider(FactParser factParser, RuleParser ruleParser)
    {
        ruleRepository = ruleParser.getRuleRepository();
        factRepository = factParser.getFactRepository();
        this.factParser = factParser;
        this.ruleParser = ruleParser;
    }

    public void collectAnswers()
    {
        Question q = new Question();

        for (Map.Entry<String, Question> e : ruleRepository.ruleMap.entrySet())
        {
            while
            {
                System.out.println(e.getValue().getQuestion());
                Scanner scan = new Scanner(System.in);
                String answer = scan.next();

                boolean b;
                for (int i = 0; i < q.getAnswerEvaluator(). ; i++) {

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
