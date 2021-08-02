package Lista1;

import java.util.Scanner;

public class lista1ex7 {

	public static void main(String[] args) {
	Scanner leia = new Scanner (System.in);
	int a, b, c, d, E, f;
	double x1, x2, xtot, y1, y2, ytot;
	
	System.out.println("Insira o valor de A: ");
	a = leia.nextInt();
	System.out.println("Insira o valor de B: ");
	b = leia.nextInt();
	System.out.println("Insira o valor de C: ");
	c = leia.nextInt();
	System.out.println("Insira o valor de D: ");
	d = leia.nextInt();
	System.out.println("Insira o valor de E: ");
	E = leia.nextInt();
	System.out.println("Insira o valor de F: ");
	f = leia.nextInt();

	
	x1 = (c * E) - (b * f);
	x2 = (a * E) - (b * d);
	xtot = x1 / x2;
	y1 = (a * f) - (c * d);
	y2 = (a * E) - (b * d);
	ytot = y1 / y2;
	
	System.out.println("O valor de x é " +xtot);
	System.out.println("\nO valor de y é " +ytot);
	}

}
