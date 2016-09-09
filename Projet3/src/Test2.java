
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//m1();
		//m2("Gnocchi");
		//System.out.println(m3("tata"));
//		int a = 2;
//		int b = 5;
//		System.out.println(a + " " + b);
//		swap(a,b);
//		System.out.println(a + " " + b);
		affiche();
		affiche("Bobby");
		affiche(1,4);
		affiche("lol",2);
		affiche(2, "lol");
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
	
	static void swap(int a, int b){
		int tmp = a;
		a = b;
		b = tmp;
	}
	
	static void affiche(){
		System.out.println("Rien");
	}
	
	static void affiche(String str){
		System.out.println(str);
	}
	
	static void affiche(int a, int b){
		System.out.println(a + " " + b);
	}
	
	static void affiche(String a, int b){
		System.out.println(a + " " + b);
	}
	static void affiche(int a, String b){
		System.out.println(a + " " + b);
	}
}
