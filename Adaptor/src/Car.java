public class Car implements Vehicle{

	@Override
	public void accelerate() {
     System.out.println("Car starts moving");
		
	}

	@Override
	public void pushBreak() {
		System.out.println("Car stopped");
		
	}

	@Override
	public void horn() {
		System.out.println("Car Beep Beep");
		
	}

}
