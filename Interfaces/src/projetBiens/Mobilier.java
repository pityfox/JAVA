package projetBiens;

public class Mobilier extends Bien {

	public Mobilier(String nom, int prix) {
		super(nom, prix);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void acheter() {
		System.out.println("J'achète le Mobilier");
		
	}

	@Override
	public void vendre() {
		System.out.println("Je brasse le Mobilier");
		
	}

	@Override
	public void finir() {
		System.out.println("J'fini le Mobilier");
		
	}

	@Override
	public void nettoyer() {
		System.out.println("J'polish le Mobilier");
		
	}

	@Override
	public void construire() {
		System.out.println("Je monte le Mobilier IKEA");
		
	}

	@Override
	public void detruire() {
		System.out.println("Je défonce le Mobilier");
		
	}
	
	
}
