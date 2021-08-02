package Lista1;

import java.util.Scanner;

public class lista1ex8 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		double cf, pd, imp, cc;
		
		System.out.println("Qual o custo de fábrica? ");
		cf = leia.nextInt();
		
		pd = cf * 0.28;
		imp = cf * 0.45;
		cc = cf + pd + imp;
		
		System.out.println("O custo do consumidor foi de " +cc);
				

	}

}
