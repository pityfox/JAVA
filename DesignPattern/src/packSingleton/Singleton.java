package packSingleton;

public class Singleton {
	private static Singleton instance = null;
	
	private Singleton(){
		
	}
	
	// Recupere toujours la m�me instance � chaque appel
	public static Singleton getInstance(){
		if(instance == null)instance = new Singleton();
		return instance;
	}
	
	public void M() {
		System.out.println("Je suis M");
	}
}
