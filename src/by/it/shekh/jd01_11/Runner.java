package by.it.shekh.jd01_11;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<String> arrayList=new ArrayList<>();
        List<String> myList=new ListA<>();
        arrayList.add("Word_1"); myList.add("Word_1");
        arrayList.add("Word_2"); myList.add("Word_2");
        arrayList.add("Word_3"); myList.add("Word_3");
        arrayList.add("Word_4"); myList.add("Word_4");
        arrayList.add("Word_5"); myList.add("Word_5");
        System.out.println(arrayList);
        System.out.println(myList);
        arrayList.remove(1); myList.remove(1);
        arrayList.remove(3); myList.remove(3);
        System.out.println(arrayList);
        System.out.println(myList);
    }
}
