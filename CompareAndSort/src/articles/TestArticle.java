package articles;

public class TestArticle {

	public static void main(String[] args) {
		Article A1 = new Article("coca", 10);
		Article A2 = new Article("bueno", 10);
		Article A3 = new Article("coca", 20);
		
		compare(A1,A2);
		compare(A1,A3);
		compare(A2,A3);
	}

	static void compare(Article A1, Article A2){
		if(A1.equals(A2))
			System.out.println(A1.getNom() +" même prix que " + A2.getNom());
		else System.out.println(A1.getNom() +" pas le même prix que " + A2.getNom());
	}
}
