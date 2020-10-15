
import java.util.Scanner;

public class Puntodos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese numero entero");
		
		int valor1 = sc.nextInt();
		
		System.out.println("Ingrese otro entero");
		int valor2 = sc.nextInt();
		
		if(valor1 < valor2){
			System.out.println("El numero menor es:" + valor1);
		}
		else if (valor1 > valor2) {
			System.out.println("El numero menor es:" + valor2);
			
		}
		if (valor1 == valor2){
			System.out.println("Son numeros iguales " );
		}
	}

}
