package strategyPattern;

public class consultant implements Role{

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return consultant.class.getSimpleName();
	}

	@Override
	public String respon() {
		// TODO Auto-generated method stub
		return "Write Code";
	}
	
	

}
