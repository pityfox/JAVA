package Pack4;

public class Personne {

	// Instanciation des valeurs
	String nom="abc";
	String prenom;
	int age;
	
	// Constructeur par défaut sans paramètres
	Personne()
	{
		this.nom="Dupond";
	}
	
	//Constructeurs d'initialisation, paramètres passés au constructeur
	Personne(String nom)
	{
		this.nom=nom;
	}
	
	Personne(String nom, String prenom)
	{
		this.nom=nom;
		this.prenom=prenom;
	}
	
	Personne(String nom, String prenom, int age)
	{
		// appel d'un constructeur, évite de redéfinir une nouvelle fois
		this(nom,prenom);
//		this.nom=nom;
//		this.prenom=prenom;
		this.age=age;
	}
	
	// Copie Constructeur
	Personne(Personne x)
	{
		this.nom=x.nom;
		this.prenom=x.prenom;
		this.age=x.age;
	}
	
	// Méthodes
	// Print l element
	void affiche()
	{
		System.out.println(nom+" "+prenom+" "+age);
	}
	
	// Créée un objet Personne
	Personne create(String nom, String prenom)
	{
		return new Personne(nom,prenom);
	}
	
	Personne create(String nom, String prenom, int age)
	{
		return new Personne(nom,prenom,age);
	}
	// Version normalisée pour afficher
	public String toString()
	{
		return nom+" "+prenom+" "+age;
	}
	
}