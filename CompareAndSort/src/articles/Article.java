package articles;

public class Article {
	// Attributs
	private String nom;
	private int prix;
	
	// Setters & Getters
	
	public String getNom(){
		return nom;
	}
	
	// Constructeurs
	public Article(String nom, int prix){
		this.nom = nom;
		this.prix = prix;
	}
	
	
	// Méthodes
	
	// Comparaisons : redefinition de hashCode() et equals() de Object
	// pour le hashCode on appelle celui des int
	@Override
	public int hashCode() {
		return new Integer(this.prix).hashCode();
	}

	// On compare selon le prix
	@Override
	public boolean equals(Object obj) {
		// Test si la ref est la même (donc même contenu)
		if (this == obj)
			return true;
		// Test si l'objet est null
		if (obj == null)
			return false;
		// Test si l'objet 
		if (getClass() != obj.getClass()){
			System.out.println(getClass());
			return false;
		}
		Article other = (Article) obj;
		if (prix != other.prix)
			return false;
		return true;
	}
	
	//toString
	public String toString(){
		return nom + " : " + prix + "€";
	}

	
}
