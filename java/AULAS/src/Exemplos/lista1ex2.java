import java.util.Scanner;

public class lista1ex2 {
	public static void main (String [] args) {
		Scanner leia = new Scanner (System.in);
		int anos, meses, dias, totdias;
		
		System.out.println("Quantos dias você tem? ");
		totdias = leia.nextInt();
		
		anos = (totdias / 365);
		meses = ((totdias % 365) / 30);
		dias = (((totdias % 365) % 30));
		
		System.out.println("Você está vivo à\n" +anos+" Anos\n");
		System.out.println(+meses+ " Meses\n");
		System.out.println(+dias +" Dias");
		
	}

}
