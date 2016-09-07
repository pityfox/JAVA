
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();
		m2("Gnocchi");
		System.out.println(m3("tata"));
	}

	static void m1() {
		System.out.println("je suis m1");
	}
	
	static void m2(String str){
		System.out.println("je suis m2"+str);
	}
	
	static String m3(String x){
		System.out.println("je suis m3");
		return "à bientôt "+x;
	}
	
	static int add(int x, int y){
		return x+y;
	}
	
	static int sub(int x, int y){
		return x-y;
	}
	
	static int mult(int x, int y){
		return x*y;
	}
	
	static int div(int x, int y){
		return x/y;
	}
}
