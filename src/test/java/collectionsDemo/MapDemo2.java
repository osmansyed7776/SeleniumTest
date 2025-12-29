package collectionsDemo;

import java.util.Hashtable;
import java.util.Map;

public class MapDemo2
{
    public static void main(String[] args)
    {
        Map<String,String> map1 = new Hashtable<String,String>();

        map1.put("Name","RBG Technologies");
        map1.put("Lang","Java");
        map1.put("Automation Testing","Selenium");
        map1.put("API Testing","POST man");

        int mapSize = map1.size();
        System.out.println("mapSize : "+mapSize);

        map1.put("Name","RBG Technologies");
        map1.put("Lang","Java");
        map1.put("Automation Testing","Selenium");
        map1.put("API Testing","REST Assured");
        map1.put("DB testing","MY Sql");

        mapSize = map1.size();
        System.out.println("mapSize : "+mapSize);
    }
}
