import java.util.Scanner;


public class Baseexponente {
	
	public static void main (String args[]) {
		
		Scanner introducir;
		int b;
		int e;
		int i=1;
		int r=1;
		
		System.out.println("Introduce la Base");
		introducir=new Scanner(System.in);
		b=introducir.nextInt();
		
		
		System.out.println("Introduce el exponente");
		introducir=new Scanner(System.in);
		e=introducir.nextInt();
		
		while (i<=e){
			
			r = r*b;
			++i;
			
			
		}
		
		
		
		System.out.print("El resultado"+r);
		
		
	}
}

