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
        return question;
    }

    public Answer getAnswerEvaluator()
    {
        return answerEvaluator;
    }

    public void setAnswerEvaluator(Answer answer)
    {
        this.answerEvaluator = answer;
    }
    public boolean getEvaluatedAnswer(String input)
    {
        return false;
    }
}
