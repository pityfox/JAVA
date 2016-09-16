package projetMagasin;

public class Boisson extends Article{
	public Boisson(String nom, EBoisson b){
		super(nom, b.name(), b.getPrix());
	}
}
