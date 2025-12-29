package collectionsDemo;

import java.util.HashSet;
import java.util.Set;

public class SetDemo2
{
    public static void main(String[] args)
    {
        Set<String> set1  = new HashSet<String>();
        set1.add("RBG technologies");
        set1.add("Selenium");
        set1.add("Java");

        int setSize =set1.size();
        System.out.println("setSize : "+setSize);

        set1.add("RBG technologies");
        set1.add("Selenium");
        set1.add("Java");
        set1.add("API Testing");

        setSize =set1.size();
        System.out.println("setSize : "+setSize);

        Set<Integer> set2  = new HashSet<Integer>();
        set2.add(10);

        Set<Boolean> set3  = new HashSet<Boolean>();
        set3.add(true);

    }
}
