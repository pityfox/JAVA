package packObserver;

public class testObserver {

	public static void main(String[] args) {
		Prof p = new Prof("Jean-Richard-Dugenou");
		
		Eleve e1 = new Eleve("Machin",p);
		Eleve e2 = new Eleve("Truc",p);
		Eleve e3 = new Eleve("Bidule",p);
		
		p.addEleve(e1);
		p.addEleve(e2);
		p.addEleve(e3);
		
		System.out.println(p);
		System.out.println(e1);
		
		p.setNote(12);
		
		System.out.println(p);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);

	}

}
