package Extra4;

public class Point3D <T extends Number> extends Point2D<T> implements RekenBaar {
	
	protected T z;

	public Point3D(T x, T y, T z) {
		super(x, y);
		this.z = z;
	}
	
	public String toString(){
		return "(" + x + "," + y + "," + z + ")";
	}

	public T getZ() {
		return z;
	}
	
	public String telOp(Point3D<T> point){
		return null;
	}
}
