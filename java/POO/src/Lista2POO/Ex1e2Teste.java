package Lista2POO;

public class Ex1e2Teste {

	public static void main(String[] args) {
		Cachorro cachorro1 = new Cachorro("Bilu", 2, true, false);
		Cavalo cavalo1 = new Cavalo("Pocotó", 12, false, true);
		Preguiça preguica1 = new Preguiça("Barrichelo", 25, false, false);
		
		System.out.println("O nome do cachorro é "+cachorro1.getNome());
		System.out.println("O nome do cavalo é "+cavalo1.getNome());
		System.out.println("O nome da preguiça é "+preguica1.getNome()+"\n");
	
		cachorro1.som();
		cavalo1.correr();
		preguica1.som();
		
	}
}
