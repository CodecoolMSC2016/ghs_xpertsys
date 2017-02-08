import java.util.*;

public class RuleRepository {


    private HashMap<String, Question> ruleMap = new HashMap<>();
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
