package Lista2POO;

public class Ex1e2Teste {

	public static void main(String[] args) {
		Cachorro cachorro1 = new Cachorro("Bilu", 2, true, false);
		Cavalo cavalo1 = new Cavalo("Pocot�", 12, false, true);
		Pregui�a preguica1 = new Pregui�a("Barrichelo", 25, false, false);
		
		System.out.println("O nome do cachorro � "+cachorro1.getNome());
		System.out.println("O nome do cavalo � "+cavalo1.getNome());
		System.out.println("O nome da pregui�a � "+preguica1.getNome()+"\n");
	
		cachorro1.som();
		cavalo1.correr();
		preguica1.som();
		
	}
}
