package tryw;

public class returns {
    public static void main (String args[]){

        int x = sum(1, 15, 3);
        int y = sum(22, 4, 9);
        System.out.println(x);  // 6
        System.out.println(y);  // 14
    }
    static int sum(int a, int b, int c){

        return a + b + c;
    }
}
