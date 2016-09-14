package Constructeurs;

public class Y extends X {
	private int y;
	
	public Y(int x, String s, int y){
		super(x,s);
		this.y = y;
	}
	
	public void m2(){
		System.out.println("Je suis m2");
	}
	
	public String toString(){
		return super.toString()+y;
	}
}
