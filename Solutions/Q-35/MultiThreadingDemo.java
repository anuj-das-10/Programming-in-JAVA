class MultiThreading implements Runnable {
	
	public void run() {
		try {
			// Displaying the thread that is running
			System.out.println("Thread "+Thread.currentThread().getId()+" is running");
		}
		catch (Exception e) {
			System.out.println("Running Thread Interrupted due to some error!");
		}
	}
}

class MultiThreadingDemo {
	public static void main(String[] args) {
		
		int n = 8; 			// Number of threads
		
		for(int i=0; i < n; i++) {
			Thread object = new Thread(new MultiThreading());
			object.start();
		}
	}
}
