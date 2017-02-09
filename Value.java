/**
 * Created by akos on 2017.02.07..
 */
public abstract class Value {
    public String[] inputPattern;
    public abstract String[] getInputPattern();
    public abstract String[] getFalseValue();
    public abstract String[] getTrueValue();
}
