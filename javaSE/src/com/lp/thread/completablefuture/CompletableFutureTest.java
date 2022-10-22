package com.lp.thread.completablefuture;

import java.util.ArrayList;
import java.util.concurrent.*;

/**
 * @Author: liangpeng
 * @Date: 2021/12/14 16:45
 */
public class CompletableFutureTest {

    public static void main(String[] args) {

    }


    public  void test(){
        // 开个线程池，取任务执行
// /*       ExecutorService executor = new ThreadPoolExecutor(
//                8, 100, 5,
//                TimeUnit.MINUTES,
//                new ArrayBlockingQueue<>(10000)
//        );
//        // 任务列表
//        List<CompletableFuture<Asset>> fList = new ArrayList<>();
//        for (int id : assetIds) {
//            // 创建任务
//            CompletableFuture<Asset> f = CompletableFuture.supplyAsync(
//                    () -> {
//                        Asset asset = getDetail();
//                        asset.xx = getXX();
//                        asset.yy = getYY();
//                        asset.zz = getZZ();
//                        return asset;
//                    },
//                    executor
//            );
//            fList.add(f);
//        }
//// 阻塞，等待所有任务执行完成
//        List<Asset> CompletableFuture
//  .allOf(fList.toArray(new CompletableFuture[0]))
//                .get();*/


    }



}
