package Thread;

public class Company {
	
	int n;
	Boolean f=false;
  synchronized	public void produce_item(int n) throws InterruptedException
	
	{
	  if(f) {
		  wait();
	  }
	  
		this.n=n;
		System.out.println("produce" + +this.n);
		f=true;
		notify();
	}

	
  synchronized	public int consumer_item() throws InterruptedException{
	  
	  if(!f) {
		  wait();
	  }
  this.n=n;	
  System.out.println("consumer" + +this.n);
  f=false;
  notify();
   return this.n;
	}
}
