
class ThreadExample1 extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread Name: "+Thread.currentThread().getName() + "::"+i);
		}
	}
}

public class ThreadExample {

	public static void main(String[] args) {

		ThreadExample1 threadExample1 = new ThreadExample1();
		threadExample1.start();
		try {
			threadExample1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		ThreadExample1 threadExample2 = new ThreadExample1();
		threadExample2.start();

	}

}
