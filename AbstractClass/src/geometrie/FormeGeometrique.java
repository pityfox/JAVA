package geometrie;

public abstract class FormeGeometrique {
	public abstract double getAire();
	public abstract double getPerimetre();
	
	
	//toString
	public String toString(){
		return getClass().getSimpleName() + " Aire: " + getAire() + " Perimetre: " + getPerimetre();
	}
}
