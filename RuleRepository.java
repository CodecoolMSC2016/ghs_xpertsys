/**
 * Created by akos on 2017.02.07..
 */

public class RuleRepository {

    Map<String, Question> questionMap = new HashMap<>();

    public Iterator getIterator()
    {
        return null;
    }

    public Question addQuestion(String id, Question question)
    {
        questionMap.put(id, question);
        return question;
    }

    class QuestionIterator implements Iterator
    {
        @Override
        public boolean hasnext() {
            return false;
        }

        @Override
        public Object next() {
            return null;
        }
    }
}
