
public class Main {

	public static void main(String[] args) {
		Student youssif=new Student("Youssif");
		Student mohamed=new Student("Mohamed");
		
		Course designP=new Course("Design Pattern"); 

		designP.subscribe(youssif);
		designP.subscribe(mohamed);
		
		designP.setAvailbility(true);
	}

}
