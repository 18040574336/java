package com.lp;

import com.sun.deploy.util.StringUtils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.function.DoubleToLongFunction;

public class TT {

    public static void main(String args[]) throws ParseException {


        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date minDate = dateFormat.parse("1999-12-31 00:00:00");
        System.out.println(minDate);

        Class<?> cls[] = new Class[3];
        cls[0] = String.class;
        cls[1] = Integer.class;
        cls[2] = Map.class;
        for (int i = 0; i < cls.length; i++) {
            System.out.println(cls[i]);
        }


        double d = -1.3d;
        System.out.println(d<0d);

        List<String> strList = new ArrayList<>();
        strList.add("111");
        strList.add("222");
        String join = StringUtils.join(strList, ",");
        System.out.println(join);
        String fileName = "aaaa.xlsx";
        System.out.println(fileName.substring(0, fileName.length()-1));

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(5);
        list.add(5);
        list.add(8);
        list.add(5);
        list.add(10);

        for (int j = 0; j < list.size(); j++) {
            if (list.get(j) == 5) {
                list.remove(j);
            }
        }

        outputList(list);
    }

    private static void outputList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+"    ");
        }
    }


    class Operation{

        private double _numberA;
        private double _numberB;


    }
}
