package output;

import java.io.IOException;

class Derived 
	{
	    public void getDetails() throws IOException //line 23
	    {
	        System.out.println("Derived class");
	    }
	}
	  
	public class OverrideTest extends Derived
	{
	    public void getDetails() throws Exception //line 24  error ya new exception do ya small kro ek dum de partent nahi de sukte
	    {
	        System.out.println("Test class");
	    }
	    public static void main(String[] args) throws IOException //line 25
	    {
	        Derived obj = new OverrideTest();
	        obj.getDetails();
	    }
	}

