package projetMagasin;

public class Boisson extends Article{
	
	private EBoisson b;
	
	public Boisson(String nom, EBoisson b){
		super(nom);
		this.b = b;
		prix = b.getPrix();
	}
	
	public String toString(){
		return super.toString() + " " + b.toString();
	}
	
}