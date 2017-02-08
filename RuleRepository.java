/**
 * Created by akos on 2017.02.07..
 */
import java.util.*;
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
        int index;
        @Override
        public boolean hasnext() {
            if (index< questionMap.size())
            {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasnext())
            {
                return questionMap[];
            }
            return null;
        }
    }
}
