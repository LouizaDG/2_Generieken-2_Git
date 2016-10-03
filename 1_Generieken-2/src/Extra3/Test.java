package Extra3;

public class Test {
	
	public static void main(String[] args){
		
		Point3D point1 = new Point3D(20,20,0);
		Point3D point2 = new Point3D(2,-1,1);
		Optelling<Point3D,Point3D> optelling1 = new Optelling<Point3D,Point3D>(point1,point2);
		Optelling<Integer, Integer> optelling2 = new Optelling<Integer,Integer>(3,2);
		Vermenigvuldiging<String,String> vermenigvuldiging = new Vermenigvuldiging<String,String>(optelling1.telOp(),optelling2.telOp());
		
		System.out.println(vermenigvuldiging.verminigvuldig());
		
	}
	
}
