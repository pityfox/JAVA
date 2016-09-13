package packSingleton;

public class Spooler {
	private static Spooler instance = null;
	private Imprimante[] imprimantes = new Imprimante[2];
	private boolean b = false;
	
	public void setImprimantes(Imprimante[] imprimantes) {
		this.imprimantes = imprimantes;
	}
	
	public void addImprimante(Imprimante imprimante) {
		for(int i=0;i<this.imprimantes.length;i++)
			if(this.imprimantes[i] == null)
				this.imprimantes[i] = imprimante;
	}
	
	private Spooler(){
		this.imprimantes[0] = new Imprimante("Imp1");
		this.imprimantes[1] = new Imprimante("Imp2");
	}
	
	public static Spooler getInstance(){
		if(instance == null)instance = new Spooler();
		return instance;
	}
	
	public void print(String msg){
		if(b)this.imprimantes[0].print(msg);
		else this.imprimantes[1].print(msg);
		b = !b;
	}
		
}
