
class RunnableExample1 implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 5; i++) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out
					.println(Thread.currentThread().getName() + "::" + i + "::" + Thread.currentThread().getPriority());
		}
	}
}

public class RunnableExample {

	public static void main(String[] args) {
		RunnableExample1 runnableExample1 = new RunnableExample1();

		Thread thread = new Thread(runnableExample1);
		Thread thread1 = new Thread(runnableExample1);

		thread.setPriority(1);
		thread1.setPriority(3);

		thread.start();
		thread1.start();

	}
}
