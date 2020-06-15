package com.lp.thread.example;
/**
 * 售票，三个窗口，100张票，实现Runnable
 *
 * 说明：会存在线程安全问题
 *
 */
class Window implements  Runnable{
    private  int ticket = 100;
    @Override
    public void run() {
        while(true){
            if (ticket>0){
                System.out.println(Thread.currentThread().getName()+":"+"卖票:"+ticket);
                ticket--;
            } else {
                break;
            }
        }
    }
}


public class TicketTest1 {

    public static void main(String[] args) {
        Window w =new Window();
        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);

        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");

        t1.start();
        t2.start();
        t3.start();

    }
}
