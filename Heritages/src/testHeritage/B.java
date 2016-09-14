package testHeritage;

public class B extends A{
	private int w;
	
	public void M2(){
		System.out.println("M2");
	}
	
	public void M4(){
		// Appel direct de M1 venant de la classe A
		M1();
	}
	
	public void M5(){
		// Changement de l'attr z hérité de A (protected)
		z=15;
		System.out.println(z);
	}
	
	// Redefinition de affiche héritée de A
	public void affiche(int i){
		System.out.println("Je suis B");
	}
	
	// Redefinition de affiche avec ajout
	public void affiche2(){
		super.M1();
	}
	
	//toString
	public String toString(){
		return super.toString()+" et par B";
	}
}
