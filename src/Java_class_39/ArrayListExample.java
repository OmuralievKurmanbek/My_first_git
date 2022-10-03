package Java_class_39;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list0= new ArrayList<>();

        list0.add("Samsung");
        list0.add("Coca Cola");
        list0.add("BMW");
        list0.add("M.c Donalds");
        list0.add("Let's Go");

        //print all data from list
        for (int i=0; i<list0.size(); i++){
            System.out.println(list0.get(i));
        }
        System.out.println();



        System.out.println(list0.size());
        System.out.println(list0.clone());
        System.out.println();
    }
}
