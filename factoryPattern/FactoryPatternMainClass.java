package factoryPattern;

public class FactoryPatternMainClass {
	
	
	public static void main(String arg[]) {
		ProfessionFactory professionFactory= new  ProfessionFactory();
		
		Profession obj =professionFactory.getProfession("Doctor");
		
		obj.print();
		
		
	}

}
