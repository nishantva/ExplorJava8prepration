package output;


class Demo{
	int a=10;
	public final int b;// final variable must need to be initialize
}
public class Variable3 {
	
	public static void main(String arg[]) {
		Variable3  obj=new Variable3();
		
		System.out.print(obj.a);
		Variable3  obj2= new Demo();
		
		Demo obj3=new Demo();
		System.out.print(obj3.a);
		
	}

}
