package collectionsDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo3
{
    public static void main(String[] args)
    {
        Set<String> set  = new HashSet<String>();

        set.add("RBG technologies");
        set.add("Selenium");
        set.add("Java");

        Iterator<String> setList = set.iterator();

        String firstData = setList.next();
        System.out.println("firstData : "+firstData);

        String secondData = setList.next();
        System.out.println("secondData : "+secondData);

        String thirdData = setList.next();
        System.out.println("thirdData : "+thirdData);

        String fourthData = setList.next();
        System.out.println("fourthData : "+fourthData);

    }

}
