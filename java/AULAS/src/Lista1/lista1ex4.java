package Lista1;

import java.util.Scanner;

public class lista1ex4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int a, b, c, r, s;
		double d;
		
		System.out.println("Insira um valor inteiro e positivo: ");
		a = leia.nextInt();
		System.out.println("Insira um valor inteiro e positivo: ");
		b = leia.nextInt();
		System.out.println("Insira um valor inteiro e positivo: ");
		c = leia.nextInt();
		
		r = ((a + b) * (a + b));
		s = ((b + c) * (b + c));
		d = ((r + s) / 2);
		
		System.out.println("A expressão resultou em "+d);
	}

}
