package p12;
class MyThread1 extends Thread { 
MyThread1() { 
super("ChildThread"); // Call Thread class constructor to set thread name 
start(); // Start the thread 
} 
public void run() { 
for (int i = 1; i <= 5; i++) { 
System.out.println(getName() + ": " + i); 
try { 
Thread.sleep(500); // Pause for 500 milliseconds 
} catch (Exception e) { 
System.out.println(e); 
} 
} 
} 
}


