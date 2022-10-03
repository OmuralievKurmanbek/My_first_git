package Java_class_17;

import java.util.Scanner;

public class Hw1 {
    public static void main (String[] args){
        System.out.println("Please enter the number");
        Scanner sc =new Scanner(System.in);
        int num =sc.nextInt();
        int count = 0;

        for (int i=1; i<=num; i++){
            if(num % i ==0){
                count++;
            }

        }
        if (count==2){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }

        }
    }

