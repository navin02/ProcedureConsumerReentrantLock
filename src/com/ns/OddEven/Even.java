package com.ns.OddEven;

public class Even implements Runnable {
	private OddEvenImpl oddEvenImpl;

	public Even(OddEvenImpl impl) {
		this.oddEvenImpl = impl;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			this.oddEvenImpl.printEven();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
