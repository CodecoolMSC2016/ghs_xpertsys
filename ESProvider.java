import java.util.*;

public class ESProvider {

    private HashMap<String, Boolean> evaluatedAnswerMap = new HashMap<>();
    private RuleRepository ruleRepository;
    private FactRepository factRepository;
    private FactParser factParser;
    private RuleParser ruleParser;

    public HashMap<String, Boolean> getEvaluatedAnswerMap() {
        for(Map.Entry<String, Boolean> entry : evaluatedAnswerMap.entrySet())
        {
            System.out.println("Question ID:\t" + entry.getKey() + "\tEvaluation:\t" + entry.getValue());
        }
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
       return evaluatedAnswerMap.get(QuestionID);
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
    public boolean deBug(String[]args)
    {
        boolean debugStatus = false;
        if (args[0].equals("debug")){
            debugStatus = true;
            return debugStatus;
        }
        return false;
    }
    public void iteratorTest()
    {

        Iterator iterator = ruleRepository.iterator;
        while(iterator.hasNext())
        {
            System.out.println(ruleRepository.ruleMap.size());
            Object question = iterator.next();
            System.out.println(((Question) question).getQuestion());
        }
    }
    public void debugFunctions()
    {
        System.out.print("Welcome to the debug menu, please enter the instruction:\t");
        Scanner userIn = new Scanner(System.in);
        String order = userIn.nextLine();
        boolean whileBreaker = false;
        while (!whileBreaker)
        {
            switch (order)
            {
                case "getquestion":
                    System.out.print("ID you want to see:\t");
                    System.out.println(getAnswerByQuestion(userIn.nextLine()));
                    System.out.print("please enter the instruction:\t");
                    order = userIn.nextLine();
                    break;
                case "print":
                    getEvaluatedAnswerMap();
                    System.out.print("please enter the instruction:\t");
                    order = userIn.nextLine();
                    break;
                case "seteval":
                    System.out.print("ID you want to change:\t");
                    String id = userIn.nextLine();
                    System.out.print("\nvalue you want to change:\t");
                    boolean value = userIn.nextBoolean();
                    setEvaluatedAnswerMap(id,value);
                    System.out.print("please enter the instruction:\t");
                    order = userIn.nextLine();
                    break;
                case "exit":
                    whileBreaker = !whileBreaker;
                    break;
                default:
                    System.out.print("please enter the instruction:\t");
                    order = userIn.nextLine();
                    break;
            }
        }
    }

}
