package geometrie;

public class Test {

	public static void main(String[] args) {
		FormeGeometrique[] Tab = new FormeGeometrique[3];
		Tab[0] = new Rectangle (10,5);
		Tab[1] = new Cercle(4);
		Tab[2] = new Carre(2);
		
		for(FormeGeometrique FG:Tab){
			System.out.println(FG);
		}
	}

}
