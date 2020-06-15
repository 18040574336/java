package com.lp.thread.example;
/**
 * 售票，三个窗口，100张票，实现Runnable
 *1、问题：买票过程中，出现了重票，错票--》出现了线程安全问题。
 *2、问题出现的原因：当某个线程操作车票的过程中，尚未操作完成时，其他线程也参与进来，也操作车票。
 *3、如何解决：当一个线程a在操作ticket时，其他线程不能参与进来，直到线程a操作完成ticket，其他线程才可以操作ticket。
 *4、java中有同步机制，来解决线程安全问题
 *  一、同步代码块
 *   synchronized(同步监视器){
 *     //需要被同步的代码
 *   }
 *
 *  说明：1、操作共享数据的代码，即需要被同步的代码
 *       2、共享数据：多个线程共同操作的变量：比如：ticket就是共享数据。
 *       3、同步监视器：俗称：锁，任何一个对象都可以充当锁。
 *          要求：多个线程必须共享同一把锁。
 *          可以用this(慎用,必须保证多个线程锁唯一)或者WindowThreadSafe.calss
 *
 *   二 、同步方法
 *
 *   如果操作共享数据的代码完整的声明在一个方法中，我们不妨将此房声明同步的。
 *
 * 5、同步的方式，解决了线程的安全问题-----好处
 *    操作同步代码时，只有一个线程参与,其他线程等待。相当于一个单线程的过程，效率低。----局限性
 *
 */
class WindowThreadSafe implements  Runnable{
    private  int ticket = 100;
    @Override
    public void run() {
      while(true){
          // synchronized (this) ok
          synchronized (WindowThreadSafe.class){
                if (ticket>0){
                    System.out.println(Thread.currentThread().getName()+":"+"卖票:"+ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }

    }
}



class WindowThreadSafe1 implements  Runnable{
    private  int ticket = 100;
    @Override
    public void run() {
        while(true){
            show();
        }
    }
   //同步方法
    private synchronized  void show(){ //默认同步锁this
        if (ticket>0){
            System.out.println(Thread.currentThread().getName()+":"+"卖票:"+ticket);
            ticket--;
        }
    }
}
public class TicketThreadSafe {

    public static void main(String[] args) {
        WindowThreadSafe1 w =new WindowThreadSafe1();
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
