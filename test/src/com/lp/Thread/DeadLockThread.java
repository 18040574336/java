package com.lp.Thread;


public class DeadLockThread implements Runnable {


    private String  code;
    private String  lock = "lock";

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    public DeadLockThread() {
    }
    public DeadLockThread(String code) {
        this.code = code;
    }

    @Override
    public void run() {
        if ("1".equals(code)){
            synchronized (lock){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                a ();
            }

        } else {
            synchronized (DeadLockThread.class){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                b ();

            }

        }




    }

    private void a (){
        synchronized (DeadLockThread.class){
            System.out.println("test deadlock!!!");
        }
    }
    private void b (){
        synchronized (lock){
            System.out.println("test deadlock!!!");
        }
    }

    public static void main(String[] args) {
        DeadLockThread deadLockThread = new DeadLockThread("1");
        DeadLockThread deadLockThread1 = new DeadLockThread("2");
        new Thread(deadLockThread).start();
        new Thread(deadLockThread1).start();
    }
}
