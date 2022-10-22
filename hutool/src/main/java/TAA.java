import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;
import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.io.file.FileReader;
import cn.hutool.core.util.BooleanUtil;
import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import org.junit.jupiter.api.Test;

import javax.sql.DataSource;
import java.util.*;
import java.util.concurrent.*;
import java.util.stream.Collectors;

/**
 * @Author: liangpeng
 * @Date: 2021/10/25 21:36
 */
public class TAA {

    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(5);
        scheduledExecutorService.schedule(() -> {

        },3,TimeUnit.MILLISECONDS);

        Semaphore semaphore = new Semaphore(3); // 设置可用资源数 3
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                try {
                    System.out.println(Thread.currentThread().getName()+"===111");
                    semaphore.acquire(); // 抢占资源
                    System.out.println(Thread.currentThread().getName() + " 抢到桌位，开始吃饭");
                    TimeUnit.SECONDS.sleep(new Random().nextInt(5));
                    System.out.println(Thread.currentThread().getName()+"===222");

                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    System.out.println(Thread.currentThread().getName() + " 吃完饭，离开桌位");
                    semaphore.release(); // 释放
                }
            }, "t" + i).start();
        }

    }

    @Test
    public void Test1(){

        boolean aTrue = BooleanUtil.isTrue(null);
        System.out.println(aTrue);
        List<Student> list = new ArrayList<>();
        List<Student> collect = list.stream().filter(p -> p.getAge() > 1).collect(Collectors.toList());
        collect.forEach(p->p.setName(p.getName()+"==="));

        list.forEach(p->{
            System.out.println(p.getAge()+"=="+p.getName());
        });

    }


    @Test
    public  void Test2(){
      List<Bom> list = new ArrayList<>();
      list.add(new Bom(1,"A001","001","E001","1","MWO001"));
      list.add(new Bom(2,"A001","001","E001","2","MWO001"));
      list.add(new Bom(3,"A001","002","E002","1","MWO002"));
      list.add(new Bom(4,"A001","002","E002","2","MWO002"));
      list.add(new Bom(5,"A001","002","E002","1","MWO003"));
      list.add(new Bom(6,"A001","002","E002","2","MWO003"));

        // 查询父子零件，最新的结构
//        Map<String, List<Bom>> inteSapBomDbMaps = list.stream().collect(Collectors.groupingBy(p->p.getMsNum()+"_"+p.getSuNum(), (Collectors.collectingAndThen(Collectors.toCollection(
//                () -> new TreeSet<>(Comparator.comparing(Bom::getId))), ArrayList::new))));
//

        Map<String, Bom> inteSapBomDbMaps = list.stream().collect(Collectors.groupingBy(p -> p.getMsNum() + "_" + p.getSuNum(), Collectors.collectingAndThen(Collectors.reducing((c1, c2) -> c1.getId() > c2.getId() ? c1 : c2), Optional::get)));

        Map<String, List<Bom>> collect = list.stream().collect(Collectors.groupingBy(p -> p.getLineNum() + "_" + p.getMwo()));

        List<Bom> dbBom = new ArrayList<>();
        inteSapBomDbMaps.forEach((k,v)->{
            List<Bom> list1 = collect.get(v.getLineNum() + "_" + v.getMwo());
            if (CollectionUtil.isNotEmpty(list1)){
                dbBom.addAll(list1);
            }

        });

        dbBom.forEach(p-> System.out.println(p));
//
//        inteSapBomDbMaps.forEach((k,v)->{
//            System.out.println(k);
//            System.out.println(v);
//        });


    }

    @Test
    public void test1(){
       Semaphore semaphore = new Semaphore(3); // 设置可用资源数 3
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                try {
                    System.out.println(Thread.currentThread().getName()+"===111");
                    semaphore.acquire(); // 抢占资源
                    System.out.println(Thread.currentThread().getName() + " 抢到桌位，开始吃饭");
                    TimeUnit.SECONDS.sleep(new Random().nextInt(5));
                    System.out.println(Thread.currentThread().getName()+"===222");

                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    System.out.println(Thread.currentThread().getName() + " 吃完饭，离开桌位");
                    semaphore.release(); // 释放
                }
            }, "t" + i).start();
        }

    }
}
