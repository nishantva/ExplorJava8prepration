
//use three thread to print the 3 different string !  in a sequence

public class PrintTenTimes {

    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 10; i++) {

            Thread t1 = new Thread(() -> System.out.print("welcome "));
            Thread t2 = new Thread(() -> System.out.print("to "));
            Thread t3 = new Thread(() -> System.out.println("freecharge"));

            t1.start();
            t1.join();   // wait for t1

            t2.start();
            t2.join();   // wait for t2

            t3.start();
            t3.join();   // wait for t3
        }
    }
}
