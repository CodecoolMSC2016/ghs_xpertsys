import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.*;

public class Fact
{
    private String id;
    private HashMap<String, Boolean> evalMap;
    private String description;

    public void setId(String id)
    {
        this.id = id;
    }


    public Fact(String description)
    {
        this.description = description;
    }

    public void setFactValueByID(String id, boolean value)
    {
        evalMap.put(id, value);
    }
    
    public Set<String> getIDSet()
    {
        Set<String> idSet = new HashSet<>();
        for (Map.Entry<String, Boolean> e : evalMap.entrySet())
        {
            idSet.add(e.getKey());
        }
        return idSet;
       
    }
    public boolean getValueByID(String evalId)
    {
       return evalMap.get(evalId);
    }
    public String getDescription()
    {
        return description;
    }

}
