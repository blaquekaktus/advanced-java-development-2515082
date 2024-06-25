package _03_03.before;
import java.util.HashMap;

public class HashmapExample {

    public static void main(String[] args) {
        HashMap<String, Integer>basket= new HashMap<>();
        basket.put("Apples", 2);
        basket.put("Oranges", 4);

        System.out.println(basket.get("Apples"));

        basket.put("Apples", 4);
        System.out.println(basket.get("Apples"));
        System.out.println(basket.containsKey("Apples"));
        System.out.println(basket);

        //To update the values in the HashMap
        basket.merge("Oranges", 5, Integer::sum);
        System.out.println(basket);
    }




}
