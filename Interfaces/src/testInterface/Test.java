package testInterface;

public class Test {

	public static void main(String[] args) {
		new A().M1();
		new A().M2();
		new A().M3();
		new A().M();
		
		I1 monI = new A();
		monI.M1();
		
		A monA = new A();
		I1 monI2 = monA;
		monI2.M1();
		
		I3 monI3 = (I3) new D();
		monI3.Impl();
		new D().Impl();
	}

}
