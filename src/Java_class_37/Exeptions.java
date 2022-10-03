package Java_class_37;

import java.util.Scanner;

public class Exeptions {
    public static void main(String[] args) {
        Scanner cs=new Scanner(System.in);

        try {
            System.out.println("enter first num to divide");
            int a= cs.nextInt();
            System.out.println("enter second num");
            int b = cs.nextInt();
            System.out.println(a/b);

        }catch (ArithmeticException c){
            System.out.println("no no no");
        }
    }
}
