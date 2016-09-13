package packFood;

public class Commande {
	// Attributs
	private String client;
	private Plat p;
	private Boisson b;
	private Dessert d;
	private int prix;

	// Constructeurs
	public Commande(){
		this.client = Methods.saisirString("Votre nom");
		this.p = choixPlat();
		this.b = choixBoisson();
		this.d = choixDessert();
		this.prix = calculerPrix();
	}
	
	public Commande(String client){
		this.client = client;
	}
	
	public Commande(String client, Plat p, Boisson b, Dessert d, int prix) {
		super();
		this.client = client;
		this.p = p;
		this.b = b;
		this.d = d;
		this.prix = prix;
	}

	// Methodes
	private int calculerPrix(){
		return this.p.getPrix() + this.b.getPrix() + this.d.getPrix();
	}
	
	private Plat choixPlat(){
		System.out.println("Liste des Plats : ");
		for(Plat plat:Plat.values())System.out.println(plat);
		return Plat.valueOf(Methods.saisirString("Votre choix :"));
	}
	
	private Boisson choixBoisson(){
		System.out.println("Liste des Boissons : ");
		for(Boisson boisson:Boisson.values())System.out.println(boisson);
		return Boisson.valueOf(Methods.saisirString("Votre choix :")); 
	}
	
	private Dessert choixDessert(){
		System.out.println("Liste des Desserts : ");
		for(Dessert dessert:Dessert.values())System.out.println(dessert);
		return Dessert.valueOf(Methods.saisirString("Votre choix :"));
	}
	
	//toString
	public String toString() {
		return "Commande [client=" + client + ", p=" + p + ", b=" + b + ", d=" + d + ", prix=" + prix + "€]";
	}
	
	
	
}
