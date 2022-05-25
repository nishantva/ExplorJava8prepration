package Thread;

public class PrintoddandEvenUsingthread {

	int counter = 1;

	static int n;

	public void printEvenNumber() {

		synchronized (this) {
			while (counter < n) {

				while (counter % 2 == 1) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

				}
				// Print the number
				System.out.print(counter + " ");

				// Increment counter
				counter++;

				// Notify to 2nd thread
				notify();
			}

		}
	}
	public void printOddNumber() {

		synchronized (this) {
			while (counter < n) {

				while (counter % 2 != 1) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

				}
				// Print the number
				System.out.print(counter + " ");

				// Increment counter
				counter++;

				// Notify to 2nd thread
				notify();
			}

		}
	}

	public static void main(String arg[]) {
		
		 n=10;
		 
		 PrintoddandEvenUsingthread mt =new PrintoddandEvenUsingthread();
		 
		 
		 Thread t1 =new Thread( new Runnable() {
			public void run() {
			
			mt.printEvenNumber();
			}
		});
		
		 Thread t2 =new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				mt.printOddNumber();
				
			}
		});
		 
		 t1.start();
	        t2.start();
	}

}
