package testInterface;

public class A extends B implements I1, I2 {
	public void M1(){
		System.out.println("M1 de A");
	}
	
	public void M2(){
		System.out.println("M2 de A");
	}
	
	public void M3(){
		System.out.println("M3 de A");
	}
	
	public void M(){
		System.out.println("M de A");
	}
	
	public void F(int x){
		
	}
	
	public int F(){
		return 0;
	}
	
}
