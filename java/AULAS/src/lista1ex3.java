import java.util.Scanner;

public class lista1ex3 {

	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		int evento, hora, minuto, segundo;
		
		System.out.println("Quanto tempo durará esse evento (em segundos): ");
		evento = leia.nextInt();
		
		hora = (evento / 3600);
		minuto = ((evento % 3600) / 60);
		segundo = ((evento % 3600) % 60);
		
		System.out.println("O evento durará\n");
		System.out.println(hora+ " hora(s);\n");
		System.out.println(minuto+ " minutos;\n");
		System.out.println(segundo+ " segundos.");
	}
}
