package decoratorPattern;

public class DecoratorDemo {
	
	public static void main(String arg[]) {
		
		FarmHouse  farmHouse=new FarmHouse();
		
	//	System.out.println(farmHouse.cost());
		
		ExtraCheese extraCheese=new ExtraCheese(farmHouse);//yha wrap kiya hai Extracheese with farmhouse//
		System.out.print(extraCheese.cost());
		
	}

}
