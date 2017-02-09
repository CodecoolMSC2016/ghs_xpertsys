import java.util.*;

public class RuleRepository
{
    LinkedHashMap<String, Question> ruleMap = new LinkedHashMap<>();
    public Iterator iterator;

    public RuleRepository()
    {
        iterator = getIterator();
    }

    public Iterator getIterator()
    {
         return new QuestionIterator();
    }

    public Question addQuestion(String id, Question question)
    {
        ruleMap.put(id, question);
        return null;
    }

    class QuestionIterator implements Iterator
    {
        int index = 0;
        public boolean hasNext()
        {
            if(index < ruleMap.size()-1)
            {
                System.out.println("Index while inside hasNext(): " + index);
                return true;
            }
            return false;
        }

        public Question next()
        {
            if (this.hasNext())
            {
                Question question = ruleMap.values().toArray(new Question[ruleMap.values().size()])[index++];
                System.out.println("Question inside next(): " + question.getQuestion());
                System.out.println("Index while inside next(): " + index);
                return question;

            }
            return null;
        }
    }
}
