public class Main {
    public static void main(String[] args) {
        ESProvider provider = new ESProvider(new FactParser(), new RuleParser());
        provider.debugPrintStats();
    }


}
