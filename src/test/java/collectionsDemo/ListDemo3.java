package collectionsDemo;

import java.util.ArrayList;
import java.util.List;

public class ListDemo3
{
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<String>();
        list1.add("RBG Technologies");//0
        list1.add("Java");//1
        list1.add("Selenium");//2;

        int listSize = list1.size();
        System.out.println("listSize : "+listSize);

        list1.add("RBG Technologies");//3
        list1.add("Java");//4
        list1.add("Selenium");//5
        list1.add("API Testing");//6

        listSize = list1.size();
        System.out.println("listSize : "+listSize);

    }
}
