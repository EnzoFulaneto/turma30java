package Lista1POO;

public class Lista1Ex2Aviao {
	public static void main(String[] args) {
		Aviao aviao1 = new Aviao("Grande", 140, "Boeing");
		Aviao aviao2 = new Aviao("Medio", 300, "Fly Emirates");
		
		System.out.println("O avião 1 é "+aviao1.getTamanho());
		System.out.println("O avião 2 é da "+aviao2.getMarca());
		
		
	}
}
