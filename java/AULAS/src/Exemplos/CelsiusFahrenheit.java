import java.util.Scanner;

public class CelsiusFahrenheit {
	public static void main(String [] args) {
		int far;
		int cel;
		Scanner leia = new Scanner (System.in);
		//(32 °F − 32) × 5/9 = 0 °C

		System.out.println("Insira a temperatura em Fahrenheit(°F): ");
		far = leia.nextInt();
		cel = ((far - 32)* 5 / 9);
		System.out.println("A temperatura em celsius é de "+cel);
	}
}
