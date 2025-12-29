package collectionsDemo;

import java.util.Hashtable;
import java.util.Map;

public class MapDemo1A
{
    public static void main(String[] args)
    {
        Map<String,String> map1 = new Hashtable<String,String>();
        map1.put("Name","RBG Technlogies");

        Map<Integer,String> map2 = new Hashtable<Integer,String>();
        map2.put(1,"Selenium");

        Map<String,Boolean> map3 = new Hashtable<String,Boolean>();
        map3.put("API Testing",true);

    }
}
