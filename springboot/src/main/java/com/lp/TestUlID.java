package com.lp;

import com.github.f4b6a3.ulid.Ulid;
import com.github.f4b6a3.ulid.UlidCreator;

/**
 * @Author: liangpeng
 * @Date: 2022/10/19 17:59
 * @Description:
 */

public class TestUlID {
    public static void main(String[] args) {
        Ulid ulid = UlidCreator.getUlid();
        System.out.println(ulid.toString());
    }
}
