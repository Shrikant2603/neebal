package com.gurukul.day10;

public class Thread1 {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Thread t = new Thread(new Runnable() {

	    @Override
	    public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
		    System.out.print('*');
		    try {
			Thread.sleep(100);
		    } catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		    }
		}
	    }
	});
	t.start();
	for (int i = 0; i < 5; i++) {
	    System.out.print('/');
	    try {
		Thread.sleep(100);
	    } catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }
	}
    }

}
