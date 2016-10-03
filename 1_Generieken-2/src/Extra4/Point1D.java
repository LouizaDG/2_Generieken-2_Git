package Extra4;

public class Point1D <T extends Number> implements RekenBaar{
	
	protected T x;

	public Point1D(T x) {
		super();
		this.x = x;
	}
	
	public String toString(){
		return "(" + x + ")";
	}

	public T getX() {
		return x;
	}
	
	public String telOp(Point1D<T> point){
		return null;
	}
}
