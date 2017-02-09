/**
 * Created by akos on 2017.02.07..
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class FactRepository {



    public Iterator getIterator()
    {
        return new FactIterator();
    }

    public void addFact(Fact fact)
    {


    }

    class FactIterator implements Iterator
    {
        int index;
        @Override
        public boolean hasNext()
        {
            if(index< tokomfaszomgolyoja.size())
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
                return tokomfaszomgolyoja.get(index++);
            }

            return null;
        }
    }

}
