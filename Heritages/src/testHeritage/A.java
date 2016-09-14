package testHeritage;

public class A {
	private int x;
	public int y;
	protected int z;
	
	public void M1(){
		System.out.println("M1");
	}
	
	// Appel externe impossible de A ou B
	private void M3(){
		System.out.println("M3");
	}
	
	public void affiche(){
		System.out.println("Je suis A");
	}
	
	// to String
	public String toString(){
		return "Passage par A";
	}
}
