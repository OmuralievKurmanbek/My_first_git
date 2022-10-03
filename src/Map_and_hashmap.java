import java.util.HashMap;
import java.util.Map;

public class Map_and_hashmap {
    public static void main(String[] args) {
        String str = "Sometimes i hate being that jerk as i am, I am very lazy and cant concentrate on one thing, but anyway, I want to be a good programmer to earn lots of money ";

        String[]words =str.split(" ");

        Map<String, Integer> frequency=new HashMap<String, Integer>();

        for (String word : words){
            if (frequency.containsKey(word)){
                int previousFrequency = frequency.get(word);
                frequency.put(word, previousFrequency+1);
            }else {
                frequency.put(word, 1);
            }
        }
        System.out.println(frequency);
    }
}
