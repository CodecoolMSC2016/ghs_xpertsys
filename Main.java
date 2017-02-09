public class Main {
    public static void main(String[] args)
    {
        ESProvider provider = new ESProvider(new FactParser(), new RuleParser());
        if(args.length > 0)
        {
            if(provider.deBug(args)) provider.debugPrintStats();
        }
        provider.collectAnswers();
        System.out.println(provider.evaluate());
    }


}
