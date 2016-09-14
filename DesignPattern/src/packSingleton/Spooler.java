package packSingleton;

public class Spooler {
	// Attributs
	private static Spooler instance = null;
	private Imprimante[] imprimantes = new Imprimante[2];
	private boolean b = false;
	
	// Getters & Setters
	public void setImprimantes(Imprimante[] imprimantes) {
		this.imprimantes = imprimantes;
	}
	
	public void setImprimantes(Imprimante imprimante) {
		for(int i=0;i<this.imprimantes.length;i++)
			if(this.imprimantes[i] == null)
				this.imprimantes[i] = imprimante;
	}
	
	// Constructeurs
	private Spooler(){
		this.imprimantes[0] = new Imprimante("Imp1");
		this.imprimantes[1] = new Imprimante("Imp2");
	}
	
	// Méthodes
	// Recup la même instance à chaque appel
	public static Spooler getInstance(){
		if(instance == null)instance = new Spooler();
		return instance;
	}
	
	// Imprime sur une impr puis l'autre
	public void print(String msg){
		if(b)this.imprimantes[0].print(msg);
		else this.imprimantes[1].print(msg);
		b = !b;
	}
		
}
