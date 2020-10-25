import java.util.Scanner;

public class PuntoSeis {

	public static void main(String[] args) {
		// Mes cantidad de dias

Scanner sc = new Scanner(System.in);
		
		short mes;
		System.out.println("Ingrese mes");
		  mes =(short) sc.nextInt();
		  
		  
		  switch(mes)
		  {
		  
		  case 1:
		  case 3:
		  case 5:
		  case 7:
		  case 8:
		  case 10:
		  case 12:
		  System.out.println("El mes tiene 31 dias");
		  break;
		
		  
		  case 4:
		  case 6:
		  case 9:
		  case 11:
		  System.out.println("El mes tiene 30 dias");
		  break;
		  
		  case 2:
		  System.out.println("El mes tiene 28 dias");
		 break;
		  
		 default:
	
			  System.out.println("Ingrese un mes valido ");
		  }
		  }
		  
		  

	}



	}

}
