package strategyPattern;

public class seniorConsultant implements Role{

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return seniorConsultant.class.getSimpleName();
	}

	@Override
	public String respon() {
		// TODO Auto-generated method stub
		return "Review Code";
	}

}
