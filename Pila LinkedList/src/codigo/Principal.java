package codigo;

import java.util.LinkedList;

public class Principal {

    //private static PilaLinkedList cll = new PilaLinkedList();

    public static void main(String[] args) {
        /*
        for (int i = 0; i < 10; i++) {
            cll.push(i);
        }

        System.out.println( cll.top());

        do{
            System.out.println(cll.pop());
        }
        while(cll.getPila().size()!=0);
         */

        LinkedList<String> ll = new LinkedList<String>();
        ll.add("A");
        ll.add("B");
        ll.add("C");
        ll.add("D");
        System.out.println(ll);
        ll.add(0,"A");
        ll.add(5,"A");
        System.out.println(ll);
        ll.remove("A");
        System.out.println(ll);
        ll.remove(0);
        System.out.println(ll);

    }

}
