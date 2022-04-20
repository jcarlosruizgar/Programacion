package codigo;

import java.util.HashMap;

public class Paises {

    public static void main(String[] args) {

        HashMap<String,String> paisCapital = new HashMap<>();
        paisCapital.put("Espana","Madrid");
        paisCapital.put("Porgugal","Lisboa");
        paisCapital.put("Alemania","Berlin");
        paisCapital.put("Francia","Paris");

        System.out.println(paisCapital);

    }

}
