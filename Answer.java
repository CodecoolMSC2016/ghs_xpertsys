/**
 * Created by akos on 2017.02.07..
 */
public class Answer
{
    private Value value;

    public boolean evaluateAnswerByInput(String input)
    {
        for (int i = 0; i < value.getTrueValue().length ; i++) {
            if(value.getTrueValue()[i].equals(input))
            {
                return true;
            }
        }
        return false;
    }

    public void addValue(Value value)
    {
        this.value = value;
    }
    public String[] getInputPattern()
    {
        return value.getInputPattern();

    }
}
