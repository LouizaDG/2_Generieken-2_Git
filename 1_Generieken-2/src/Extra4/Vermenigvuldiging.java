package Extra4;

public class Vermenigvuldiging <T,U> extends Pair<T, U> {

	public Vermenigvuldiging(T linkerwaarde, U rechterwaarde) {
		super(linkerwaarde, rechterwaarde);
	}
	
	public String verminigvuldig(){
		return "(" + linkerwaarde + " * " + rechterwaarde + ")";
	}
	
}
