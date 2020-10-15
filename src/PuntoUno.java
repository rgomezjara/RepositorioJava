import java.util.Scanner;

public class PuntoUno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// ejercicio uno  calculadora
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese numero entero");
		int valor1 = sc.nextInt();
		
		System.out.println("Ingrese otro entero");
		int valor2 = sc.nextInt();
		
		int suma = valor1 + valor2;
		System.out.println("El resultado de la suma es:" + suma);
		
		int resta = valor1 - valor2;
		System.out.println("El resultado de la resta es:" + resta);
		
		int multiplicacion = valor1 * valor2;
		System.out.println("El resultado de la multiplicacion es:" + multiplicacion);

		int division = valor1 / valor2;
		System.out.println("El resultado es:" + division);
	}
		
		
	}


