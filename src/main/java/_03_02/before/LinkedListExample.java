package _03_02.before;
import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("apples");
        list.add("oranges");
        list.add("peaches");

        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        //removes & returns the first item in the list
        System.out.println(list.poll());
        System.out.println(list);

        //removes & returns the first item in the list
        System.out.println(list.pop());
        System.out.println(list);

        list.add("melons");
        list.add("bananas");

        System.out.println(list.peek());
        System.out.println(list);




    }






}
