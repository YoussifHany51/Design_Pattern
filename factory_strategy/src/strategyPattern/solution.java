package strategyPattern;

public class solution {

	public static void main(String[] args) {
		Employee jo=new Employee("Jo",new consultant());
		Employee nns=new Employee("nns",new consultant());
		
		jo.doWork();
		nns.doWork();
		
		jo.promote(new leadConsultant());
		nns.promote(new seniorConsultant());
		
		jo.doWork();
		nns.doWork();

	}

}
