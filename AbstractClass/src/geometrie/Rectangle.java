package geometrie;

public class Rectangle extends FormeGeometrique {
	private double l;
	private double L;

	public Rectangle(double l, double L){
		this.l = l;
		this.L=L;
	}
	
	public double getAire(){
		return this.l*this.L;
	}
	
	public double getPerimetre(){
		return 2*(this.l+this.L);
	}
	
	public String toString(){
		return super.toString() + " l: " + l + " L: " + L;
	}
}
