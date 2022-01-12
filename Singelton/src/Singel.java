import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Singel {

	
	private Integer[] numbers= {1,2,3,4,5,6};
	private List<Integer> list=Arrays.asList(numbers);
	private static Singel instance;
	
	
	private Singel() {
		System.out.println("Object created");
		Collections.shuffle(list);
	}
	
	public static Singel getInstance() {
		if(instance==null) {
			instance=new Singel();
		}
		return instance;
	}
	
	public void print() {
		for(Integer i: list) {
			System.out.print(i.toString());
		}
		System.out.println();
	}
}

