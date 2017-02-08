/**
 * Created by akos on 2017.02.07..
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

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
