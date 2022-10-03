package Java_class_8;

import java.util.Scanner;

public class type {
    public static void main(String[] args) {
        System.out.println("please, enter user and password");
        Scanner sc = new Scanner (System.in);
        String username = sc.nextLine(), password= sc.nextLine();
        String expUsername = "DevX",expPassword="Glek1337228";


        if(username == expUsername && password == expPassword){
            System.out.println("login successful, welcome!");
        } else if (username!= expUsername && expPassword != expPassword) {
            System.out.println("please, enter your name and password again ");
        } else if (username!=expUsername && password==expPassword){
            System.out.println("invalid username");
        } else if (username==expUsername && password!=expPassword){
            System.out.println("invalid password");
        }

    }
}
