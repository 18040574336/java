package com.lp.Thread;

import java.io.Serializable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Thread03 implements Serializable {
    public static void main(String[] args) {
        Thread04 thread04 = new Thread04();
        System.out.println(thread04);
        thread04.test01();

    }


}

class  Thread04{

    public void  test01(){
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1,5,100, TimeUnit.SECONDS,null);
        Thread thread = new Thread(()->{
            System.out.println("内部===="+this);
        });
        thread.start();
        System.out.println(this);



    }
}