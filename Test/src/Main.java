import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);
        System.out.println(list.get(1));
        list.remove(1);
        System.out.println(list);
    }
}