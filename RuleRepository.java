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
    }

    class QuestionIterator implements Iterator
    {
        int index;
        @Override
        public boolean hasNext()
        {
            if(index < ruleMap.size())
            {
                return true;
            }
            return false;
        }

        @Override
        public Object next()
        {
            if (this.hasNext())
            {
                return ruleMap.get(index++);
            }
            return null;
        }
    }
}
