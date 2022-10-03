package Java_class_7;

import java.util.Scanner;

public class swichstatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the number from 0 to 5");
        int num= sc.nextInt();
        switch (num){
            case 0:
                System.out.println("zero");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            default:
                System.out.println("Please enter proper number");
                System.out.println("Good morning my friend");

        }
    }

}

