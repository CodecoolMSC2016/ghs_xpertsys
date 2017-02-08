import java.util.Set;

/**
 * Created by akos on 2017.02.07..
 */
public class Fact {
    public Fact(String description)
    {

    }
    public void setFactValueByID(String id, boolean value)
    {
        /* Display content using Iterator*/
        Set set = factMap.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
            System.out.println(mentry.getValue());
    }
    public Set<String> getIDSet()
    {
        return null;
    }
    public boolean getValueByID()
    {
        return false;
    }
    public String getDescription()
    {
        return null;
    }
}
