package outputQ;

public class Test1 {
	
	
	
		public static void main(String[] args)
		{
			A a = new B();
			B b = new B();
			
			System.out.println(a.c);
		}
	}
//in a.get B class have the 

	class A
	{
		protected char c = 'P';
		char getValue()
		{
			return c;
		}
	}

	class B extends A
	{
		protected char c = 'B';
		char getValue()
		{
			return c;
		}
		
	}



