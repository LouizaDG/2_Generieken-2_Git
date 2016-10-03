package Extra4;

public class Optelling <T extends RekenBaar> extends Pair<T,T>{

	public Optelling(T linkerwaarde, T rechterwaarde) {
		super(linkerwaarde, rechterwaarde);
	}
	
	public String telOp(){
		return linkerwaarde.telOp(rechterwaarde);
	}
	
}
