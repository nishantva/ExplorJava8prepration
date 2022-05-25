package singeltonPattern;

//Lazy initialization with Double check locking:In this mechanism,we overcome 
//the overhead problem of synchronized code.In this method,getInstance is not synchronized
//but the block which creates instance is synchronized so that minimum number of threads have to wait and 
//that’s only for first time.

public class SingletonThreadsafe {

	private volatile static SingletonThreadsafe instance;// use volatile to make it thread safe//

	private SingletonThreadsafe() {

	}

	public static SingletonThreadsafe getInstance() {
		// synchronized block to remove overhead

		if (instance == null) {
			synchronized (SingletonThreadsafe.class) {
				if (instance == null) {

					instance = new SingletonThreadsafe();
				}
			}

		}
		return instance;
	}
}
