package packSingleton;

public class TestSpooler {

	public static void main(String[] args) {
		
		
		Poste p1 = new Poste("post1");
		Poste p2 = new Poste("post2");
		Poste p3 = new Poste("post3");

		p1.print("Hello World!");
		p2.print("Bonjour");
		p3.print("A bientôt");
	}

}
