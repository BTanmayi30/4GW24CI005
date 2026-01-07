package p11;

// Create a class that implements Runnable 
	class MyThread implements Runnable { 
		String threadName; 
		// Constructor 
		MyThread(String name) { 
		threadName = name; 
		} 
		// The run method contains the code that runs in the thread 
		public void run() { 
		for (int i = 1; i <= 5; i++) { 
		System.out.println(threadName + " - Count: " + i); 
		try { 
		Thread.sleep(500); // Suspend thread for 500 milliseconds 
		} catch (InterruptedException e) { 
		System.out.println(threadName + " interrupted."); 
		} 
		} 
		System.out.println(threadName + " finished."); 
		} 
		} 
		// Main class 
		

	