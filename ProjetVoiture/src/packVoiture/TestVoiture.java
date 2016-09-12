package packVoiture;

public class TestVoiture {

	public static void main(String[] args) {
		Chassis c1 = new Chassis ("ABC");
		Roues r1 = new Roues(5);
		
		Chassis c2 = new Chassis("XYZ");
		Roues r2 = new Roues(6);
		
		Voiture v1 = new Voiture("FG12","BMW",r1,c1);
		v1.setVitesse(200);
		v1.setVitesse(305);
		
		Voiture v2 = new Voiture("FR13","BMW",r2,c2);
		v2.setVitesse(400);
		
		String reponse = Voiture.comparer(v1,v2);
		System.out.println(v1.toString());
		System.out.println(v2);
		
		Parking p = new Parking("XX");
		p.add(v1);
		p.add(v2);
		
		int x = p.getCountByMarque("BMW");
		System.out.println(x);
		System.out.println(p);
		System.out.println(Voiture.getCount());

	}

}
