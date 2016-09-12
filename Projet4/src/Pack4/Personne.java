package Pack4;

public class Personne {

	// Instanciation des valeurs
	private String nom;
	private String prenom;
	private int age;
	
	// Setters & Getters
	public void setAge(int age){
		if(age > 0 && age < 120)this.age=age;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setNom(String nom){
		if(!nom.equals("Dupond"))this.nom=nom;
	}
	
	public String getNom(){
		return "Bonjour "+nom;
	}
	
	// Constructeur par défaut sans paramètres
	public Personne()
	{
		this.nom="Dupond";
	}
	
	//Constructeurs d'initialisation, paramètres passés au constructeur
	public Personne(String nom)
	{
		this.nom=nom;
	}
	
	public Personne(String nom, String prenom)
	{
		this.nom=nom;
		this.prenom=prenom;
	}
	
	public Personne(String nom, String prenom, int age)
	{
		// appel d'un constructeur, évite de redéfinir une nouvelle fois
		this(nom,prenom);
//		this.nom=nom;
//		this.prenom=prenom;
		setAge(age);
	}
	
	// Copie Constructeur
	public Personne(Personne x)
	{
		this.nom=x.nom;
		this.prenom=x.prenom;
		this.age=x.age;
	}
	
	// Méthodes
	// Print l element
	public void affiche()
	{
		System.out.println(nom+" "+prenom+" "+age);
	}
	
	public String getHello()
	{
		return "Hello!";
	}
	
	// Créée un objet Personne
	public Personne create(String nom, String prenom)
	{
		return new Personne(nom,prenom);
	}
	
	private Personne create(String nom, String prenom, int age)
	{
		return new Personne(nom,prenom,age);
	}
	
	// Version normalisée pour afficher
	public String toString()
	{
		return nom+" "+prenom+" "+age;
	}
	
}