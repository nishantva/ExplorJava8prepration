package output;

class Aa{
	public void f1() {
		System.out.print("f1");
	}
}

class Bb  extends Aa{
public void f2() {
	System.out.print("f2");
	}
}
public class EarlyBinding {
	
	public static void main(String arg[]) {
		Aa obj=new Bb();
		obj.f1();// valid
		obj.f2();//invalid kuki overide nahi horha hai jo reference derha
		//uss k method call hoge early binng hai hai yhe
	}

}
