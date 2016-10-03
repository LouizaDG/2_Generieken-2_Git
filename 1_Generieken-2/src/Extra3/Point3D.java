package Extra3;

public class Point3D extends Point2D {
	
	private int z;

	public Point3D(int linkerwaarde, int rechterwaarde, int z) {
		super(linkerwaarde, rechterwaarde);
		this.z = z;
	}
	
	public String toString(){
		return "(" + linkerwaarde + "," + rechterwaarde + "," + z + ")";
	}
	
}
