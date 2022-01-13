package J8ava;

import java.lang.annotation.Annotation;

public class FunctionalClass {

	public static void main (String arg[]) {
		MyFuctionalInterface();
		
			
    }

	private static void MyFuctionalInterface() {
		// TODO Auto-generated method stub
		MyFuctionalInterface method=()->{
			System.out.println("hiii");
		};
		
		method.demo();
	}

	
	
	
  }
	
