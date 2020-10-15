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
		 System.out.println("Ingrese año");
		int  año1 =  sc.nextInt();
		
		System.out.println("La fecha ingresada es  n\t" + dia1  + mes1 + año1);    
		
		System.out.println("Ingrese otra fecha dd/mm/año");
		System.out.println("Ingrese dia");
		int  dia2 = sc.nextInt();
		System.out.println("Ingrese mes");
		 int  mes2  =  sc.nextInt();
		 System.out.println("Ingrese año");
		int  año2 =  sc.nextInt();
		
		System.out.println("La fecha ingresada es  n\t" + dia2  + mes2 + año2);
		
		
		if (año2>año1 || año2 > año1 && mes2 >  mes1){
			System.out.println("La fecha mas reciente es" + dia2 + mes2 + año2);
		} else{ System.out.println("La fecha mas reciente es" + dia1 + mes1 + año1);}
		
		
		
	}



	}


