package com.lp;

import java.io.IOException;
import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;


public class Test {


    @org.junit.Test
    public void test1() {
        Stu<String> stringStu = new Stu<>("aa");
        System.out.println(stringStu.getT());
        OutClass1 oc = new OutClass1();
        OutClass1 outClass1 = new OutClass1();
        OutClass1.InnerStaticClass1 innerStaticClass1 = outClass1.new InnerStaticClass1();
    }

    @org.junit.Test
    public void test2() {

        Thread.State[] values = Thread.State.values();
        Thread.State value = values[0];
        System.out.println(String.valueOf(value).equals("NEW"));

    }

    @org.junit.Test
    public void test4() throws ExecutionException, InterruptedException {
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            System.out.println(Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(50);
                System.out.println("over");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        System.out.println(future.get());
        System.out.println("11");

    }

    @org.junit.Test
    public void test5() {
        final int value = 0;
        Executors.newSingleThreadExecutor().submit(new Runnable() {
            @Override
            public void run() {
            }
        });


    }

    @org.junit.Test
    public void test6() {

        List<String> list = new ArrayList<>(Arrays.asList("1", "3", "4", "4", "2"));
        list.stream().map(a -> a + 2) .filter(a->a.length()>0).distinct().collect(Collectors.toList());


    }


    public static void main(String[] args) throws IOException {
      List<String> list = new ArrayList<>();
      list.add("111");
      list.add("222");
      list.add("333");
      list.stream().map(p->new HashMap(){{
          this.put(p,p);
          System.out.println(this.getClass());
      }
      }).collect(Collectors.toList());

    }


    public <T> void test1(List<T> list) {
        list.add(null);
    }
}
