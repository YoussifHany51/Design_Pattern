
public class BikeAdaptor implements Vehicle{
	private Bike bike;
	
	public BikeAdaptor(Bike bike) {
		this.bike=bike;
	}
	
	@Override
	public void accelerate() {
    this.bike.pedal();
		
	}

	@Override
	public void pushBreak() {
		this.bike.stop();
		
	}

	@Override
	public void horn() {
	this.bike.bell();
		
	}
}
