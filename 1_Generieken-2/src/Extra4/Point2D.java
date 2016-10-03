package Extra4;

public class Point2D <T extends Number>  extends Point1D<T> implements RekenBaar{
	
	protected T y;
	
	public Point2D(T x, T y) {
		super(x);
		this.y = y;
	}
	
	public String toString(){
		return "(" + x + "," + y + ")";
	}

	public T getY() {
		return y;
	}
	
	public String telOp(Point2D<T> point){
		return null;
	}
	
}
