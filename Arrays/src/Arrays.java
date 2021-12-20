public class Arrays {
    public static int busquedaBinaria(int  vector[], int dato){
        double notas[] = {6.0, 8.5, 7.0};
        double valorBuscado = 7.0;
        int n = vector.length;
        int centro,inf=0,sup=n-1;
        while(inf<=sup){
            centro=(sup+inf)/2; //limite iniciales
            if(vector[centro]==dato)
                return centro;
            else if(dato < vector [centro] ){
                sup=centro-1;
            }
            else {
                inf=centro+1;
            }
        }
        return -1;
    }

						/*
		  int[]vector ={1,4,7,8,9,14,23,47,56,60,61,63,65,66,68,69,70,73,76,77,79,80,82};
		  int valorBuscado = 70;
		  System.out.println(busquedaBinaria(vector,valorBuscado));*/
}
