package output;


class A1{
	public void f1() {
		System.out.print("a-f1");
	}
}

class B1  extends A1{
	public void f1() {
		System.out.print("b-f1");
	}
}
public class LateBinding {
	public static void main(String arg[]) {
	
	A1 obj=new B1();//"b-f1"
	//System.out.println(obj.f1());
	//overide k time pe late binding hoti hai//
	//"b-f1"
	}
	
}
