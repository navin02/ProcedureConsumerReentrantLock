package com.ns.OddEven;

public class TestOddEven {
	public static void main(String[] args) {
		OddEvenImpl impl = new OddEvenImpl();
		Odd oddRunnable = new Odd(impl);
		Thread oddWorkerThread = new Thread(oddRunnable);
		Even evenRunnable = new Even(impl);
		Thread evenWorkerThread = new Thread(evenRunnable);
		oddWorkerThread.start();
		evenWorkerThread.start();
	}
}
