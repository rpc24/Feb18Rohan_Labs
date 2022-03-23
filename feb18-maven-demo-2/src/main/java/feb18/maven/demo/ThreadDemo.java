package feb18.maven.demo;

public class ThreadDemo implements Runnable{
	
	
		public void printNums() {
//			Thread.currentThread().setPriority(9);
			System.out.println(Thread.currentThread().getPriority());
			for (int i = 1; i <= 10; i++) {
				System.out.println(i + " - " + Thread.currentThread().getName());
				try {
					Thread.sleep(250);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

		@Override
		public void run() {
			this.printNums();
		}

		public static void main(String[] args) {

			Thread app = new Thread(new ThreadDemo());
			app.setPriority(9);
			app.start();
//			try {
//				app.join();
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
			Thread app2 = new Thread(new ThreadDemo());
			app2.setPriority(3);
			app2.start();
			Thread app3 = new Thread(new ThreadDemo());
			app3.setPriority(6);
			app3.start();

		}
	}

	//// multi-threading with Thread class 
	//
	//public class App extends Thread {
	//
//		public void printNums() {
//			for (int i = 1; i <= 10; i++) {
//				System.out.println(i);
//				try {
//					Thread.sleep(250);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//			}
//		}
	//
//		@Override
//		public void run() {
//			this.printNums();
//		}
	//
//		public static void main(String[] args) {
	//
//			ThreadDemo app = new ThreadDemo();
//			app.start();
//			ThreadDemo app2 = new ThreadDemo();
//			app2.start();
//			ThreadDemo app3 = new ThreadDemo();
//			app3.start();
	//
//		}
	//}

	//// normal single threaded app 
	//
	//public class App {
	//
//		public void printNums() {
	//
//			for (int i = 1; i <= 10; i++) {
//				System.out.println(i);
//				try {
//					Thread.sleep(250);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//			}
//		}
	//
//		public static void main(String[] args) {
	//
//			ThreadDemo app = new ThreadDemo();
//			app.printNums();
//			ThreadDemo app2 = new ThreadDemo();
//			app2.printNums();
//			ThreadDemo app3 = new ThreadDemo();
//			app3.printNums();
	//
//		}
	//}


