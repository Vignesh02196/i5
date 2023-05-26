package i5Program;

public class MyThread29 extends Thread {
	public void run() {
		synchronized (this) {
		System.out.println("c");
			this.notify();
			
		}
	}
	public static void main(String args[])throws InterruptedException {
		MyThread29 d=new MyThread29();
	d.start();
	synchronized (d) {
		System.out.println("A");
		d.wait();
		System.out.println("B");
	}
}

}