package com.ns.OddEven;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class OddEvenImpl {
	private final Lock aLock = new ReentrantLock();

	private final Condition oddCondition = aLock.newCondition();

	private final Condition evenCondition = aLock.newCondition();

	private int counter = 1;

	public void printOdd() throws InterruptedException {
		while (counter <= 10) {
			try {
				aLock.lock();
				System.out.println(counter++);
				evenCondition.signalAll();

				if (counter < 10)
					oddCondition.await();
			} finally {
				aLock.unlock();
			}
		}
	}

	public void printEven() throws InterruptedException {
		while (counter <= 10) {
			try {
				aLock.lock();
				System.out.println(counter++);
				oddCondition.signalAll();
				if (counter < 10)
					evenCondition.await();
			} finally {
				aLock.unlock();
			}
		}
	}
}
