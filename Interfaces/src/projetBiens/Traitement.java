package projetBiens;

public class Traitement {
	public static void MMonnayable(Monnayable[] T){
		for(Monnayable M:T){
			M.acheter();
			M.vendre();
		}
	}
	
	public static void MGeneric(Monnayable X){
		X.acheter();
		X.vendre();
	}

}
