package projetBiens;

public class Developpement implements Monnayable{
	private String nom;
	
	public Developpement(String nom) {
		this.nom = nom;
	}
	
	@Override
	public void acheter() {
		System.out.println("J'achète le jet-pro");
		
	}

	@Override
	public void vendre() {
		System.out.println("Je brade le jet-pro");
		
	}
	
	
}
