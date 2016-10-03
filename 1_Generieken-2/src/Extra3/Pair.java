package Extra3;

public class Pair <T,U> {
	protected T linkerwaarde;
	protected U rechterwaarde;

	public Pair(T linkerwaarde, U rechterwaarde) {
		super();
		this.linkerwaarde = linkerwaarde;
		this.rechterwaarde = rechterwaarde;
	}
	
	public void toonJezelf(){
		System.out.println(getLinkerwaarde() + " + " + getRechterwaarde());
	}
	
	public String toString(){
		return "(" + linkerwaarde + "," + rechterwaarde + ")";
	}
	
	public T getLinkerwaarde() {
		return linkerwaarde;
	}

	public U getRechterwaarde() {
		return rechterwaarde;
	}
	
}
