package Java_class_17;

import java.util.Locale;
import java.util.Scanner;

public class methodExample {
    static void printLineEqual(int length) {
        for(int i=1; i<=length; i++){
            System.out.print("=");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printLineEqual(30);
        System.out.println("Please enter the first number:");
        printLineEqual(30);

        Scanner Num =new Scanner (System.in);
        int a = Num.nextInt();

        printLineEqual(30);
        System.out.println("Please enter the second number:");
        printLineEqual(30);

        int b =Num.nextInt();

        printLineEqual(50);
        System.out.println("Please choose operation: add/ div/sub/mul");
        printLineEqual(50);
        String choice = Num.next();

        switch (choice.toLowerCase()){
            case "add":
                System.out.println(a+b);
                break;
            case "sub":
                System.out.println(a-b);
                break;
            case "mul":
                System.out.println(a*b);
                break;
            case "div":
                System.out.println(a/b);
        }




    }
}
