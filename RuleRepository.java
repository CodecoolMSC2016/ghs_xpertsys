import java.util.*;

public class RuleRepository
{
    LinkedHashMap<String, Question> ruleMap = new LinkedHashMap<>();
    Iterator iterator;

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
        int index;
        public boolean hasNext()
        {
            if(index < ruleMap.size())
            {
                return true;
            }
            return false;
        }

        public Object next()
        {
            if (this.hasNext())
            {
                return ruleMap.values().toArray(new Question[ruleMap.values().size()])[index++];
            }
            return null;
        }
    }
}
