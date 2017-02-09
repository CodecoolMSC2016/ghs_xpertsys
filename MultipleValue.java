import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

/**
 * Created by akos on 2017.02.07..
 */
public class MultipleValue extends Value{
    String[] trueValues;
    String[] falseValues;

    public MultipleValue(String param)
    {
        trueValues = param.split(",");
    }
    public void setFalseValues(String param)
    {
        falseValues = param.split(",");
    }
    public String[] getInputPattern()
    {
        String[] pattern;
        List<String>patternList = new ArrayList<>(Arrays.asList(trueValues));
        for(int i = 0; i<falseValues.length; i++)
        {
            patternList.add(falseValues[i]);
        }
        pattern = patternList.toArray(new String[0]);
        return pattern;
    }
}
