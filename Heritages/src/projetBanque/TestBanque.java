package projetBanque;

public class TestBanque {

	public static void main(String[] args) {
		CompteSimple c1 = new CompteSimple("A",123);
		System.out.println(c1);
		c1.crediter(100);
		System.out.println(c1);
		
		CompteCb c2 = new CompteCb("B",456,100,CB.MC);
		System.out.println(c2);
		c2.debiter(50);
		System.out.println(c2);
		
		boolean b = c1.virement(100, c2);		
		String reponse = "virement " + ((b)?"OK":"NON!");
		System.out.println(reponse);
		System.out.println(c1);
		System.out.println(c2);
		
		CompteSimple[] Tab = new CompteSimple[3];
		Tab[0] = new CompteSimple("A",123,1000);
		Tab[1] = new CompteVip("B",456,2000);
		Tab[2] = new CompteCb("C",789,3000, CB.amex);
		
		for(CompteSimple cs:Tab)
			System.out.println(cs);
	}

}
