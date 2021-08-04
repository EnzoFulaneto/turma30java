package lista3_LaçoDeRepeticao;

public class Lista3JavaEx1 {
//Informar todos os números de 1000 a 1999 divididos por 11 obtemos resto = 5. (FOR)
	public static void main(String[] args) {
	
	for (int x = 1000; x < 2000; x++) {
		if (x % 11 == 5) {
			System.out.println(x);
		}
	}
	
	}

}
