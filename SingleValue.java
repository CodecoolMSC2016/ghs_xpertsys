/**
 * Created by akos on 2017.02.07..
 */
public class SingleValue extends Value {
    private String[] trueValue;
    private String[] falseValue;

    public SingleValue(String param)
    {
        trueValue = param.split(",");
    }

    public String[] getInputPattern() {
        return new String[0];
    }
}
