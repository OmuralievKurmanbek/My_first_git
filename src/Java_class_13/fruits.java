package Java_class_13;

import java.util.Scanner;

public class fruits {
    public static void main(String[] args){
        Scanner cher = new Scanner (System.in);

        String apple = "Fruit";
        String mango = "Fruit";
        String cherry = cher.nextLine();

        if(apple==mango){
            System.out.println("true");
    }else {
            System.out.println("false");
        }
        if (mango==apple){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
        if (mango==cherry){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
        if (apple.equals(cher)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
}


}
