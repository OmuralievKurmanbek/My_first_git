package Java_class_25;

import java.util.Scanner;

public class MethodExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int num = sc.nextInt();

        System.out.println("Please enter number: ");
        int num1= sc.nextInt();

        System.out.println("Please enter number");
        int num2= sc.nextInt();
    }
    static int GetNumberFromUser(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int num = sc.nextInt();
        return num;
    }
}
