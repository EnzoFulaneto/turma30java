package Lista1;

import java.util.Scanner;

public class lista1ex6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int x1, x2, y1, y2;
		double d;
		
		System.out.println("Insira x1: ");
		x1 = leia.nextInt();
		System.out.println("Insira x2: ");
		x2 = leia.nextInt();
		System.out.println("Insira y1: ");
		y1 = leia.nextInt();
		System.out.println("Insira y2: ");
		y2 = leia.nextInt();
		
		d = Math.sqrt((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1));
		
		System.out.println("A distãncia d é "+d);
				
				
	}
	

}
