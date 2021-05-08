package com.lp.springxml;

import java.util.ArrayList;
import java.util.List;

public class MianTest {

    public static void main(String[] args) {
        Double versionNo =1d;
        versionNo=  versionNo == null ? 1d: versionNo++;
        System.out.println(versionNo);

        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        for (String i  : list){
            if (i.equals("3")){
                list.remove(i);
            }
        }
        System.out.println(list);
//       List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4));
//       for (Integer i  : list ){
//           if (i ==1){
//               list.remove(i);
//           }
//       }

//     List<String> list = new ArrayList<>(Arrays.asList("1","2","3"));
//
//
//        for(String x:list){
//            if(x.equals("2")){
//                list.remove(x);
//            }
//        }
//        System.out.println(list);
    }
}
