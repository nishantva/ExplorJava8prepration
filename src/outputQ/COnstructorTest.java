package output;

public class COnstructorTest {
	
	    // constructor
	COnstructorTest()
	    {
	        System.out.println("Geeksforgeeks");
	    }
	      
	    static COnstructorTest a = new COnstructorTest(); //line 8
	  
	    public static void main(String args[])
	    {
	    	COnstructorTest b; //line 12
	        b = new COnstructorTest();
	    }
	}


