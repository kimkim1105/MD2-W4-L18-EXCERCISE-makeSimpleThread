package com.codegym;

public class NumberGenerator implements Runnable{
    @Override
    public void run() {
            try {
                for (int i = 0; i < 10; i++) {
                    System.out.println("running thread name: "+Thread.currentThread().getName());
                    int h = ((Integer) i).hashCode();
                    System.out.println(i+" "+h);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

    }
}
