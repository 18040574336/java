package com.lp;

import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.omg.CORBA.SetOverrideType;

import javax.swing.table.TableRowSorter;
import javax.xml.bind.SchemaOutputResolver;
import java.util.*;

public class TestUtile {

    public static void main(String[] args) {
        String test = test();
        System.out.println(test);
    }


    public static String test(){
        String str =  "aa";
        try {
            System.out.println("=====try===" );
            System.out.println(str+="bb");
            return str;
        }
        finally {
            System.out.println("=====finally===" );
            System.out.println(str+="cc");
            return  str+="cc";
        }

    }
}
