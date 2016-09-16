package personne;

public class Personne{
	private String nom;
	private String prenom;
	private int age;
	
	public String getPrenom(){
		return prenom;
	}
	
	public Personne(String nom, String prenom, int age){
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	
//	public int compareTo(Personne p2){
//		return nom.compareTo(p2.nom);
//	}
	
	public String toString(){
		return nom + " " + prenom + " " + age;
	}
}
