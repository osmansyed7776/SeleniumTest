package collectionsDemo;

import java.util.ArrayList;
import java.util.List;

public class ListDemo5
{
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("API Testing");

        Object d1 = list.get(0);

        List<String> list1 = new ArrayList<String>();
        list1.add("RBG Technologies");
        String s1 = list1.get(0);
//        list1.get(0). String Class methods are avalable

        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(10);
        Integer i1 = list2.get(0);

//        list2.get(0). Integer class methods are available

        List<Boolean> list3 = new ArrayList<Boolean>();
        list3.add(true);
//        Boolean b1 = list3.get(0).  Boolean class methods are available

    }
}
