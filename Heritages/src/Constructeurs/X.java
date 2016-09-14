package Constructeurs;

public class X {
	private int x;
	private String s;
	
	public X(int x, String s){
		this.x = x;
		this.s = s;
	}
	
	public void m1(){
		System.out.println("Je suis m1");
	}
	
	public String toString(){
		return x+" "+s+" ";
	}
}
