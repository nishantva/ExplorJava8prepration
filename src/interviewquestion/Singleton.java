package interviewquestion;


class Demo{
	
	 static void eat(String s) {
		System.out.println("hiiime");
	}
	 void eat() {
		System.out.println("hiiime");
	}
}

class Ex extends  Demo {
	/*
	 * void eat() { System.out.println("hii this"); //super.eat(); }
	 */
}

public class Singleton {
	
	public static void main(String arg[]) {
		 
		Ex obj = new Ex();
		Demo obj2=new Ex();
		obj2.eat();
		
	}
	
}
