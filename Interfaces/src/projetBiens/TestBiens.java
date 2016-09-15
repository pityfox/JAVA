package projetBiens;

public class TestBiens {
	public static void main(String[] args) {
		Bien[] Tab1 = new Bien[2];
		Tab1[0] = new Immobilier("A", 10, "ABC");
		Tab1[1] = new Mobilier("B",20);
		for(Bien b:Tab1)
			if(b!=null)
				System.out.println(b);

		Traitement.MMonnayable(Tab1);

		Developpement[] Tab2 = new Developpement[3];
		Tab2[0] = new Developpement("PRojet1");
		Tab2[1] = new Developpement("PRojet2");
		Tab2[2] = new Developpement("PRojet3");

		Traitement.MMonnayable(Tab2);

		Traitement.MGeneric(Tab1[0]);
		Traitement.MGeneric(Tab2[0]);


	}
}
