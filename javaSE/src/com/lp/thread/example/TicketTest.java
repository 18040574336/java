package com.lp.thread.example;


/**
 * 售票，三个窗口，100张票
 *
 * 说明：会存在线程安全问题，待解决
 *
 */

class TitcekWindow extends Thread{
    private static int ticket = 100;
    @Override
    public void run() {
         while(true){
            if (ticket>0){
                System.out.println(getName()+":"+"卖票:"+ticket);
                ticket--;
            } else {
                break;
            }
        }
    }
}


public class TicketTest {
    public static void main(String[] args) {
        TitcekWindow window1 = new TitcekWindow();
        TitcekWindow window2 = new TitcekWindow();
        TitcekWindow window3 = new TitcekWindow();

        window1.setName("窗口1");
        window2.setName("窗口2");
        window3.setName("窗口3");
        window1.start();
        window2.start();
        window3.start();
    }

}
