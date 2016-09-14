package Constructeurs;

public class Test {
	public static void main(String[] args) {
		// Construct0rs appels
		X monX = new X(10,"ahah");
		Y monY = new Y(40,"lol",20);
		
		System.out.println(monX);
		System.out.println(monY);
		
		// Appel méthodes
		monX.m1();
		monY.m1();
		monY.m2();
		
	}
}
