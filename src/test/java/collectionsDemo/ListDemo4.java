package collectionsDemo;

import java.util.ArrayList;
import java.util.List;

public class ListDemo4
{
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<String>();
        list1.add("RBG Technologies");//0
        list1.add("Java");//1
        list1.add("Selenium");//2;
        list1.add("RBG Technologies");//3
        list1.add("API Testing");//4

        System.out.println(list1.get(0));
        System.out.println(list1.get(3));
        System.out.println(list1.get(4));


    }
}
