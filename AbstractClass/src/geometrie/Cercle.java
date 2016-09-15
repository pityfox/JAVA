package geometrie;

public class Cercle extends FormeGeometrique {
	private double r;
	
	public Cercle(double r){
		this.r = r;
	}
	
	public double getAire(){
		return Math.PI * Math.pow(this.r,2);
	}
	
	public double getPerimetre(){
		return 2*Math.PI*this.r;
	}
	
	public String toString(){
		return super.toString() + " r: " + r;
	}
}
