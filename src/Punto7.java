import java.util.Scanner;

public class Punto7 {
	
	private static final int LIMITE = 200, N = 4; // ETIQUETAS: VALORES FIJOS QUE NO PUEDEN SER CAMBIADOS EN EL CODIGO
	public static void main(String[] args) {
		
		//Ejercicio 7 & 8
				Scanner sc = new Scanner(System.in);
				
				int i ; 
				int contador = 0  ;
				for (i = 0; i <LIMITE; i =i+2)
				{
					
					System.out.print("\n"+ i);
					if (i % N == 0){
						contador ++;
						//M = multiplo
						System.out.print("\tM");
				}
				
				
			}
				System.out.println("\n\tMultiplos de 4 :  " + contador);
	}
}


