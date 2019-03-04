import java.util.*;

public class LinkedList2 {
    public static void main(String args[]){
        LinkedList<Integer> obj= new LinkedList<>();
        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);
        System.out.println(obj);
        obj.removeFirst();
        System.out.println(obj);
        obj.addFirst(0);
        System.out.println(obj);

    }
}
