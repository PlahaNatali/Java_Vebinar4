import java.util.Collections;
import java.util.LinkedList;

public class Task1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("а");
        list.add("б");
        list.add("в");
        list.add("г");
        list.add("д");
        System.out.println(list);  
        LinkedList<String> reversedList = reverseLinkedList(list);
        System.out.println(reversedList);
    }

    public static LinkedList reverseLinkedList(LinkedList list) {
        Collections.reverse(list);
        return list;
    }
}