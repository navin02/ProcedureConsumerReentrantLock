package com.ns.OddEven;

public class Odd implements Runnable {
	private OddEvenImpl oddEvenImpl;

	public Odd(OddEvenImpl impl) {
		this.oddEvenImpl = impl;
	}

	@Override
	public void run() {
		try {
			this.oddEvenImpl.printOdd();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
