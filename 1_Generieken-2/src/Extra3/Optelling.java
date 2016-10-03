package Extra3;

public class Optelling<T,U> extends Pair<T,U> {

	public Optelling(T linkerwaarde, U rechterwaarde) {
		super(linkerwaarde, rechterwaarde);
	}
	
	public String telOp(){
		return "(" + linkerwaarde + " + " + rechterwaarde + ")";
	}
	
}
