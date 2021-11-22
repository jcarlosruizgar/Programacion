import java.util.Scanner;

public class Calculadora {
	public int resultado;
	public static void main(String[] args) {
		int operacion = 0;
		boolean salir = false;
		float resultado = 0;
		Scanner consola = new Scanner(System.in);
		do {//inicio bucle para repetir la operacion
			do {//inicio bucle para elegir la operacion
				System.out.println("Introduzca 1 para suma, 2 para resta, 3 para producto o 4 para división:");
				operacion = Integer.parseInt(consola.nextLine());
			}
			while(operacion < 1 || operacion > 4);//fin bucle para elegir operacion
			System.out.println("Introduzca el 1º operando de la operación:");
			float operando1 = Float.parseFloat(consola.nextLine());//lee por consola un float
			System.out.println("Introduzca el 2º operando de la operación:");
			float operando2 = Float.parseFloat(consola.nextLine());//lee por consola otro float
			resultado = 0;//declara resultado a 0 como float
			switch (operacion) {//abre switch
				case 1: resultado = operando1 + operando2;//si suma
				break;
				case 2: resultado = operando1 - operando2;//si resta
				break;
				case 3: resultado = operando1 * operando2;//si multiplica
				break;
				case 4: if (operando2 == 0){
					System.out.println("Un número no puede ser dividido por 0");
				}
						else {
							resultado = operando1 / operando2;//si divide
						}
				break;
			}//cierra switch
			System.out.println("El resultado de la operación es: " + resultado);
			System.out.println("¿Quiere hacer otra operación? Escriba true para volver a elegir operación o false para salir.X");
			salir = Boolean.parseBoolean(consola.nextLine());//lee por consola un booleano
		}
		while(salir == true);//fin bucle para repetir la operacion
		consola.close();//cierra consola
	}	
}