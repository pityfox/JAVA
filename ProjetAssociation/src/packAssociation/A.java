package packAssociation;

public class A {
	// Attributs
	private static String x="A";
	private String y;
	private int compteur1;
	private static int compteur2;

	// Getters & Setters
	public static int getCompteur2(){
		return compteur2;
	}
		
	// Constructeurs
	public A(String y){
		this.y = y;
		compteur2++;
	}
	
	// Méthodes
	public void m(){
		System.out.println(x+y);
	}
	
	// Static Block
	static {
		x="B";
	}

}
