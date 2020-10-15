import java.util.Scanner;

public class PuntoCuatro {

	public static void main(String[] args) {
		// Ejercicio 4 y 5
Scanner sc = new Scanner(System.in);
		
		
		int count = 0;
		while(count < 5){
		System.out.println(" Nota  1");
		int valor1 = sc.nextInt();
		
		System.out.println(" Nota 2");
		int valor2 = sc.nextInt();
		
		System.out.println("  Nota 3");
		int valor3 = sc.nextInt();
		
		int  promedio =  (valor1 + valor2 + valor3)/3; 
		System.out.println("Tu promedio es\n " + promedio);
		
		if(valor1 >= 4 && valor2 >= 4 && valor3 >= 4 ){
			
			System.out.println("APROBADO");
	
		}
		else{
			System.out.println("DESAPROBADO");
	}
		
		if  ( (promedio  >=  8 || valor3 == 10)){
			System.out.println("Promocion");
		} else { System.out.println("Aprobado sin Promocion");
		}
		}
		
	}
}



	


