package Pack4;

public class Personne {

	// Instanciation des valeurs
	String nom="abc";
	String prenom;
	int age;
	
	// Constructeur par d�faut sans param�tres
	Personne()
	{
		this.nom="Dupond";
	}
	
	//Constructeurs d'initialisation, param�tres pass�s au constructeur
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
		// appel d'un constructeur, �vite de red�finir une nouvelle fois
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
	
	// M�thodes
	// Print l element
	void affiche()
	{
		System.out.println(nom+" "+prenom+" "+age);
	}
	
	// Cr��e un objet Personne
	Personne create(String nom, String prenom)
	{
		return new Personne(nom,prenom);
	}
	
	Personne create(String nom, String prenom, int age)
	{
		return new Personne(nom,prenom,age);
	}
	// Version normalis�e pour afficher
	public String toString()
	{
		return nom+" "+prenom+" "+age;
	}
	
}