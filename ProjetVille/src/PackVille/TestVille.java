package PackVille;

public class TestVille {

	public static void main(String[] args) {

		Ville v1 = new Ville("Nantes", "France", "Paris", 2);
		System.out.println(v1);
		
		Ville v2 = new Ville("Paris", "France", "Paris", 12);
		System.out.println(v2);
		
		v1.compare(v2);
		v2.compare(v1);
		v2.compare(v2);
	}

}
