package projetMagasin;

public class Gateau extends Article{
	
	private EGateau g;
	
	public Gateau(String nom, EGateau g){
		super(nom);
		this.g=g;
		this.prix = g.getPrix();
	}
	
	public String toString(){
		return super.toString() + " " + g.toString();
	}
	
	
}
