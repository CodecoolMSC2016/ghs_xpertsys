import java.util.*;

public class RuleRepository
{
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
        return null;
    }

    class QuestionIterator implements Iterator
    {
        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Object next() {
            return null;
        }
    }
}
