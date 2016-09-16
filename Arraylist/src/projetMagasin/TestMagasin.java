package projetMagasin;

public class TestMagasin {

	public static void main(String[] args) {
		Facture F1 = new Facture("toto");
		
		Boisson b1 = new Boisson("coca", EBoisson.moyen);
		Gateau g1 = new Gateau("LU", EGateau.vanille);
		
		Ligne L1 = new Ligne(2, b1);
		Ligne L2 = new Ligne(3, g1);
		
		F1.add(L1);
		F1.add(L2);
		
		System.out.println(F1);
	}

}
