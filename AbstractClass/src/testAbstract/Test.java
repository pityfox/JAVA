package testAbstract;

public class Test {

	public static void main(String[] args) {
		B monB = new B();
		
		monB.m1();
		monB.m2();
		monB.m3();
		monB.m4();
		
		A[] Tab = new A[2];
		Tab[0] = new B();
		Tab[1] = new C();
		
		for(A a:Tab){
			a.m3();
			a.m4();
		}
	}

}
