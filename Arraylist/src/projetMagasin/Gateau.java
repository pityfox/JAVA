package projetMagasin;

public class Gateau extends Article{
	public Gateau(String nom, EGateau g){
		super(nom, g.name(), g.getPrix());
	}
	
}
