package Java_class_7;

import java.util.Scanner;

public class If_else_lesson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the number from 0 to 9");
        int num= sc.nextInt();

if (num==0) {
    System.out.println("zero");
}
else if (num==1) {
    System.out.println("one");
}
else if (num==2) {
    System.out.println("two");
}
else if (num==3){
        System.out.println("three");
}
else if (num==4) {
    System.out.println("four");
}
        else if (num==5) {
    System.out.println("five");
}
else if (num==6) {
            System.out.println("six");
        }
else if (num==7) {
    System.out.println("seven");
}
else if (num==8){
        System.out.println("eight");
}
else if (num==9) {
            System.out.println("nine");
        }
else if (num>9){
    System.out.println("are you dumb?");
}
else if (num<0){
    System.out.println("idiot");
}
        }
    }

