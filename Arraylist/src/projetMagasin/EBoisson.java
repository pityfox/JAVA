package projetMagasin;

public enum EBoisson {
	petit(1),
	moyen(2),
	grand(3);
	
	private int prix;
	
	public int getPrix(){
		return prix;
	}
	
	private EBoisson(int prix){
		this.prix = prix;
	}
}
