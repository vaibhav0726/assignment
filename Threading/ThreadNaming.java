class ThreadName extends Thread

{

	ThreadName(String threadName)	{

		super(threadName);

	}

	public void run()

	{

		System.out.println("The current thread name is: " + Thread.currentThread().getName());

	}

}

class ThreadNaming

{

	public static void main(String args[])

	{

		ThreadName th1 = new ThreadName("Scooby");

		ThreadName th2 = new ThreadName("Shaggy");

		th1.start();

		th2.start();

	}

}
