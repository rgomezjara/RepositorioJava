import java.util.Scanner;

public class PuntoTres {

	public static void main(String[] args) {
		// Ejercicio 3; fecha mas reciente

		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese una fecha dd/mm/aa");
		System.out.println("Ingrese dia");
		int  dia1 = sc.nextInt();
		System.out.println("Ingrese mes");
		 int  mes1  =  sc.nextInt();
		 System.out.println("Ingrese a�o");
		int  a�o1 =  sc.nextInt();
		
		System.out.println("La fecha ingresada es  n\t" + dia1  + mes1 + a�o1);    
		
		System.out.println("Ingrese otra fecha dd/mm/a�o");
		System.out.println("Ingrese dia");
		int  dia2 = sc.nextInt();
		System.out.println("Ingrese mes");
		 int  mes2  =  sc.nextInt();
		 System.out.println("Ingrese a�o");
		int  a�o2 =  sc.nextInt();
		
		System.out.println("La fecha ingresada es  n\t" + dia2  + mes2 + a�o2);
		
		
		if (a�o2>a�o1 || a�o2 > a�o1 && mes2 >  mes1){
			System.out.println("La fecha mas reciente es" + dia2 + mes2 + a�o2);
		} else{ System.out.println("La fecha mas reciente es" + dia1 + mes1 + a�o1);}
		
		
		
	}



	}


