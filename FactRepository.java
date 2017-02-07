/**
 * Created by akos on 2017.02.07..
 */
public class FactRepository {
    public Iterator getIterator()
    {
        return null;
    }

    public void addFact(Fact fact)
    {

    }

    class FactIterator implements Iterator
    {
        @Override
        public boolean hasnext()
        {
            return false;
        }

        @Override
        public Object next() {
            return null;
        }
    }
}
