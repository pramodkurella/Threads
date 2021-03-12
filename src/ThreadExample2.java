
class ThreadExample3 extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread Name: " + Thread.currentThread().getName() + "::" + i);
		}
	}
}

public class ThreadExample2 {

	public static void main(String[] args) {

		ThreadExample3 t1 = new ThreadExample3();
		t1.start();

		t1.yield();

		ThreadExample3 t2 = new ThreadExample3();
		t2.start();

	}
}
