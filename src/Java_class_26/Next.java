package Java_class_26;

public class Next {
    public static void main(String[] args){
        int[] data = {20,10,12,60,40};

        int min = Integer.MAX_VALUE;

        for (int num : data){
            if (num<min){
                min=num;
            }
        }
        System.out.println(min);
    }
}
