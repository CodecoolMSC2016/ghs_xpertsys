import java.util.ArrayList;

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

    public String[] getTrueValue()
    {
        String[] value = new String[1];
        value[0] = trueValue;
        return value;
    }

    public String[] getFalseValue()
    {
        String[] value = new String[1];
        value[0] =  falseValue;
        return value;
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
