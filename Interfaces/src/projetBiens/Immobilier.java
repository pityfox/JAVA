package projetBiens;

public class Immobilier extends Bien {
	private String adresse;
	
	public Immobilier(String nom, int prix, String adresse){
		super(nom, prix);
		this.adresse = adresse;
	}

	@Override
	public void acheter() {
		System.out.println("J'achète l'Immobilier");
	}

	@Override
	public void vendre() {
		System.out.println("Je vends l'Immobilier");
		
	}

	@Override
	public void finir() {
		System.out.println("Je finis l'Immobilier");

	}

	@Override
	public void nettoyer() {
		System.out.println("Je nettoie l'Immobilier");
		
	}

	@Override
	public void construire() {
		System.out.println("Je construis l'Immobilier");
		
	}

	@Override
	public void detruire() {
		System.out.println("Je lui pète sa gueule l'Immobilier");
		
	}
	
	
}
