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
				System.out.println("Introduzca 1 para suma, 2 para resta, 3 para producto o 4 para divisi�n:");
				operacion = Integer.parseInt(consola.nextLine());
			}
			while(operacion < 1 || operacion > 4);//fin bucle para elegir operacion
			System.out.println("Introduzca el 1� operando de la operaci�n:");
			float operando1 = Float.parseFloat(consola.nextLine());//lee por consola un float
			System.out.println("Introduzca el 2� operando de la operaci�n:");
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
					System.out.println("Un n�mero no puede ser dividido por 0");
				}
						else {
							resultado = operando1 / operando2;//si divide
						}
				break;
			}//cierra switch
			System.out.println("El resultado de la operaci�n es: " + resultado);
			System.out.println("�Quiere hacer otra operaci�n? Escriba true para volver a elegir operaci�n o false para salir.X");
			salir = Boolean.parseBoolean(consola.nextLine());//lee por consola un booleano
		}
		while(salir == true);//fin bucle para repetir la operacion
		consola.close();//cierra consola
	}	
}