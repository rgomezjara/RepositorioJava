import java.util.Scanner;

public class Punto9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresar varios numeros enteros, para finalizar ingresar un numero negativo");
		long acumulador = 0;
		int  numA;
		int max;
		int min;
		 numA = sc. nextInt();
		 max =  numA;
		 min =  numA;
		while ( numA >= 0)
		{ 
			acumulador = acumulador + numA;
			if ( numA > max)
			{
			max =  numA;
			}
			if (numA < min){
				min =  numA;
			}
			numA = sc.nextInt();
			}
			
	
		System.out.println("La suma es:" + acumulador);
		System.out.println("El numero mayor es:" + max);
		System.out.println("El numero menor es:" + min );
}

	}


