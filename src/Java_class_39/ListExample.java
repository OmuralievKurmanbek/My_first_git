package Java_class_39;

import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {
        ArrayList <Integer> list1= new ArrayList<>();
        ArrayList <String> list2= new ArrayList<String>();


        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);
        list1.add(60);
        list1.add(70);



        list2.add("Potato");
        list2.add("Cake");
        list2.add("Banana");
        list2.add("Milk");
        list2.add("Sauce");

        list2.remove("Sauce");
        list2.remove(1);



        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list2.isEmpty());
    }
}
