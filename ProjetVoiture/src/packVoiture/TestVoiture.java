package packVoiture;

public class TestVoiture {

	public static void main(String[] args) {
		// Roues = lien faible donc on creer avant
		Roues r1 = new Roues(5);
		Roues r2 = new Roues(6);
		
		// Chassis = lien fort donc on passe la ref dans le construct voiture
		// qui appellera le constructeur chassis
		Voiture v1 = new Voiture("FG12","BMW",r1,"ABC");
		v1.setVitesse(200);
		v1.setVitesse(305);
		
		Voiture v2 = new Voiture("FR13","BMW",r2,"XYZ");
		v2.setVitesse(400);
		
		String reponse = Voiture.comparer(v1,v2);
		System.out.println(v1.toString());
		System.out.println(v2);
		System.out.println(reponse);
		
		Parking p = new Parking("XX");
		p.add(v1);
		p.add(v2);
		
		int x = p.getCountByMarque("BMW");
		System.out.println(p);
		System.out.println("Nombre de BMW : " + x);
		System.out.println("Nombre de voitures créées : "+Voiture.getCount());

	}

}
