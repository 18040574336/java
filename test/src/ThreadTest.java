import org.junit.Test;

import java.util.concurrent.CountDownLatch;

public class ThreadTest extends Thread{


    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
                Thread.currentThread().interrupt();
            }
            System.out.println(Thread.currentThread().getName());
        }

    }

    public static void main(String[] args) throws InterruptedException {
        ThreadTest t1 = new ThreadTest();
        t1.start();
        Thread.sleep(5000);
       t1.interrupt();
    }

    @Test
    public  void test1(){
        int d =1,b=2,c=4;
        d = b= c;
        System.out.println(d+"_"+"_"+b+"-"+c);
        A a = new A();
        a.setX(10);
        Thread t1 = new Thread(() -> System.out.println(a.getX()));
        a.setX(20);
        t1.start();





    }
    class A {
        int x;

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }
    }
}
