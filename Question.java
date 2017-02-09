/**
 * Created by akos on 2017.02.07..
 */
public class Question
{
    private Answer answerEvaluator;
    private String question;
    public Question(String question)
    {
        this.question = question;
    }
    public String getQuestion()
    {
        return null;
    }
    public void setAnswerEvaluator(Answer answer)
    {
        this.answerEvaluator = answer;
    }
    public boolean getEvaluatedAnswer(String input)
    {
        Boolean bool = answerEvaluator.evaluateAnswerByInput(input);

        return false;
    }
}
