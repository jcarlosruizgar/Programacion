package codigo;

public class Principal {

    public static void main(String[] args) {

        PilaArrayList cal = new PilaArrayList();
        for (int i = 0; i < 5; i++) {
            cal.meter(i);
        }

        do{
            System.out.println(cal.sacar());
        }
        while(cal.getPila().size()!=0);

    }

}
