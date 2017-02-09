/**
 * Created by akos on 2017.02.07..
 */
public class SingleValue extends Value {
    private String trueValue;
    private String falseValue;

    public SingleValue(String param)
    {
        trueValue = param;
    }
    void setFalseValue(String param)
    {
        falseValue= param;
    }
    public String[] getInputPattern()
    {

        String[] pattern = new String[2];
        pattern[0] = trueValue;
        pattern[1] = falseValue;
        this.inputPattern = pattern;
        return pattern;
    }
}
