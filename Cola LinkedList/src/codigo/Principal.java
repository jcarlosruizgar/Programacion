package codigo;

public class Principal {

    private static ColaLinkedList cll = new ColaLinkedList();

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            cll.meter(i);
        }

        do{
            System.out.println(cll.sacar());
        }
        while(cll.getCola().size()!=0);

    }

}
