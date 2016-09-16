package personne;

public class Personne implements Comparable<Personne>{
	// Attributs
	private String nom;
	private String prenom;
	private int age;
	
	// Getters & Setters
	public String getPrenom(){
		return prenom;
	}
	
	// Constructeurs
	public Personne(String nom, String prenom, int age){
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	
	
	
	//Méthodes

	// On implemente compareTo de l'interface Comparable
	// pour pouvoir trier avec Arrays.sort()
	public int compareTo(Personne p2){
		return nom.compareTo(p2.nom);
	}
	
	public String toString(){
		return nom + " " + prenom + " " + age;
	}
}
