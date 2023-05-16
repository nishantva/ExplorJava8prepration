import java.util.Date;
import java.util.function.Supplier;

public class SupplyerInterface {
	
	public static void main(String arg[]) {
		
		//SupplyerInterface  obj=new SupplyerInterface();
		//obj.currentDate();
		
		
		Supplier<Date> currentDate =() -> new Date();
		
		System.out.print(currentDate.get());
		
	}

	
	
//	private Date currentDate() {
	//	return new Date();
		
		
//	}

}
 