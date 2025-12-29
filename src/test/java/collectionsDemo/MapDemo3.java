package collectionsDemo;

import java.util.Hashtable;
import java.util.Map;

public class MapDemo3
{
    public static void main(String[] args)
    {
        Map<String,String> map1 = new Hashtable<String,String>();

        map1.put("Name","RBG Technologies");
        map1.put("API Testing","POST man");

        String data = map1.get("API Testing");
        System.out.println("data : "+data);

        map1.put("API Testing","REST Assured");

        data = map1.get("API Testing");
        System.out.println("data : "+data);



    }
}
