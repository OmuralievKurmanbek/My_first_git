package Java_class_37;

public class ExeptionWithFinally extends Throwable {
    public static void main(String[] args) {
        int num[]= {32,54,21,62,34};

        try {
            System.out.println(num[5]);
        }catch (ArithmeticException e){
            System.out.println("Exception handled");
        }

        System.out.println("browser close");
    }
}
