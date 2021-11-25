package codigo;

public class Prueba {
	
	private static double notas[] = {7, 8, 7, 8, 8, 7, 8, 10, 2, 6};

	public static void main(String[] args) {
		
		if (busquedaSecuencial(Double.parseDouble(args[0])) != -1){
			System.out.println("El elemento se encuentra");
		}
		
		ordenacionSeleccion();
		System.out.println(busquedaBinaria(6));
		
	}

	public static double busquedaSecuencial(double a) {//devuelve la posicion de un numero
		int posicion = -1;//suponemos que no existe
		for(int i=0; i<notas.length; i++) {
			if (notas[i] == a) {
				posicion = i;
				i = notas.length;//para evitar mas lecturas del array
			}
		}
		return posicion;
	}
	
	public static double busquedaBinaria(double a) {//hacerla
		int n = notas.length;
		int centro, inf=0, sup=n-1;
		while(inf<=sup) {
			centro=(inf+sup)/2;
			if(notas[centro] == a) {
				return centro;
			}
			else if(a<notas[centro]) {
				sup = centro-1;
			}
			else {
				inf = centro+1;
			}
		}
		return -1;
	}
	
	public static void ordenacionSeleccion() {
		for(int i= 0;i<notas.length;i++) {
			for(int j=0;j<notas.length;j++) {
				if(notas[j]>notas[i]) {
					double aux = notas[j];
					notas[j] = notas[i];
					notas[i] = aux;
				}
			}
		}
	}
}
