package Java_class_40;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class maps_lists {
    public static void main(String[] args) {
        Set<String> listOfItems = new HashSet<>();

        listOfItems.add("Kuka");
        listOfItems.add("Sada");
        listOfItems.add("Asia");
        listOfItems.add("Taalay");
        listOfItems.add("Kai");
        listOfItems.add("Kai");

        System.out.println(listOfItems);
        System.out.println(listOfItems.add(("Kuka")));
        System.out.println("==================================");

        Set<Integer> listOfIntegers = new HashSet<>();
        listOfIntegers.add(1);
        listOfIntegers.add(2);
        listOfIntegers.add(3);
        listOfIntegers.add(4);
        listOfIntegers.add(5);
        listOfIntegers.add(6);
        listOfIntegers.add(6);


    }
}


