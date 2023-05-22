package output;


class Plant{
	 Plant(){
		 System.out.println("Plant");
	 }
}

class Tree extends Plant{
	Tree(){
		System.out.println("Tree");
		super();// not allow it will be the first statement
	}
}
public class SuperTest {

	public static void main(String arg[]) {
		
		Tree  tree=new Tree();
		
		
	}
}
