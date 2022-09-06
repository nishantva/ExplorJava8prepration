package lambda;

public class Test2interface implements InterfaceA,InterfaceB {

	@Override
	public void hii() {
		// TODO Auto-generated method stub
		InterfaceB.super.hii();
		InterfaceA.super.hii();
	}

	
		public static void main(String arg[]) {
			Test2interface t=new Test2interface();
			t.hii();
		}
	

	
	
	


}
