
public class Main {

	public static void main(String[] args) {
		
		 Vehicle v1=new Car();
	     
	     useVehicle(v1);
	     
	     Vehicle v2=new BikeAdaptor(new Bike());
	     
	     useVehicle(v2);

	}
	
	private static void useVehicle(Vehicle v) {

		v.accelerate();
		v.pushBreak();
		v.horn();
		System.out.println();
	}


}
