package strategyPattern;

public class leadConsultant implements Role{

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return leadConsultant.class.getSimpleName();
	}

	@Override
	public String respon() {
		// TODO Auto-generated method stub
		return "Make decision";
	}

}
