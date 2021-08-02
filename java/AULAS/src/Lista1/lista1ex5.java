package Lista1;

import java.util.Scanner;

public class lista1ex5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		double peso2, peso3, peso5, media;
		
		System.out.println("Insira sua primeira nota (Peso 2): ");
		peso2 = leia.nextDouble();
		System.out.println("Insira sua primeira nota (Peso 3): ");
		peso3 = leia.nextDouble();
		System.out.println("Insira sua primeira nota (Peso 5): ");
		peso5 = leia.nextDouble();

		media = (((peso2 * 2) + (peso3 * 3) + (peso5 * 5)) / 10);
		
		System.out.println("Sua média foi " +media);
	}

}
