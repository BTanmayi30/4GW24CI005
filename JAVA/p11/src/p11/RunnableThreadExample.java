package p11;

public class RunnableThreadExample {
	
		public static void main(String[] args) { 
		// Create Runnable objects 
		MyThread t1 = new MyThread("Thread-1"); 
		MyThread t2 = new MyThread("Thread-2"); 
		// Create Thread objects with Runnable 
		Thread thread1 = new Thread(t1); 
		Thread thread2 = new Thread(t2); 
		// Start the threads 
		thread1.start(); 
		thread2.start(); 
		} 
		} 

