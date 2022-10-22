package com.lp.charset;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: liangpeng
 * @Date: 2021/12/9 22:51
 */
public class CharSetTest {

    public static void main(String[] args) throws UnsupportedEncodingException {




        String str = "你好";
        byte[] bytes = str.getBytes("gbk");
        for (byte aByte : bytes) {
            System.out.println(aByte);
        }

        String s1 = new String(bytes, "ISO-8859-1");
        System.out.println(s1);

        byte[] bytes1 = s1.getBytes("ISO-8859-1");

        String s2 = new String(bytes1, "gbk");
        System.out.println(s2);


//        String[] charsets = new String[]{
//                 "windows-1252", "GB18030", "Big5", "UTF-8", "GBK", "GB2312", "UTF-16", "UTF-32"};
//
//        for (String charset :charsets){
//            String s = new String(bytes, charset);
//            byte[] bytes1 = s.getBytes(charset);
//            System.out.println("========");
//            for (byte b : bytes1) {
//                System.out.println(b);
//            }
//            //String s1 = new String(bytes1, "utf-8");
//           // System.out.println(s1);
//        }


//        String[] charsets = new String[]{
//                    "windows-1252", "GB18030", "Big5", "UTF-8", "GBK", "GB2312", "UTF-16", "UTF-32"};
//            for (int i = 0; i < charsets.length; i++) {
//                for (int j = 0; j < charsets.length; j++) {
//                    if (i != j) {
//                        String s = new String(bytes, charsets[j]);
//                        System.out.println("---- 原来的编码假设为: "
//                                + charsets[j] + ", 被错误解读为: " + charsets[i]);
//                        System.out.println(s);
//                    }
//                }
//            }
//        }
  }

      @Test
      public void test1(){


      }

}
