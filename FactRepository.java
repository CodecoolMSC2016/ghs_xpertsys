import java.util.ArrayList;
import java.util.Iterator;

public class FactRepository {

    ArrayList<Fact> facts = new ArrayList<>();

    public Iterator getIterator()
    {
        return new FactIterator();
    }

    public void addFact(Fact fact)
    {
        facts.add(fact);
    }

    class FactIterator implements Iterator
    {
        int index;
        @Override
        public boolean hasNext()
        {
            if(index< facts.size())
            {
                return true;
            }

            return false;
        }

        @Override
        public Object next()
        {
            if(this.hasNext())
            {
                return facts.get(index++);
            }

            return null;
        }
    }

}
