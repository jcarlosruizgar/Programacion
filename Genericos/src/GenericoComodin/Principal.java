package GenericoComodin;

public class Principal {

    public static void main(String[] args) {

        String[] s1 ={"a","b","c","d","e","f"};
        String[] s2 ={"1","2","3","4","5","6"};
        EltoAleatorio<String> e1=new EltoAleatorio<String>(s1);
        EltoAleatorio<String> e2=new EltoAleatorio<String>(s2);
        System.out.println(e1.mismoÍndice(e2));

    }

}
