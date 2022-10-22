import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.*;
import cn.hutool.http.HttpUtil;

import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.sql.Struct;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author: liangpeng
 * @Date: 2021/4/27 10:46
 */
public class NumberTest {

    public static void main(String[] args) {
        WeakReference<Object> o = new WeakReference<>(new Object());
        Double str1111 = 0.000646d;
        System.out.println(String.valueOf(str1111));
        System.out.println(new BigDecimal(str1111.toString()).toString());
        List<Long> list1 = new ArrayList<>();
        List<Long> list2 = new ArrayList<>();
        list1.add(1L);
        list1.add(2L);
        list1.add(3L);
        list2.add(1L);
        list2.add(2L);

        list1.removeAll(list2);

        list1.forEach(p->{
            System.out.println(p);
        });

        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        String format22 = DateUtil.format(cal.getTime(), DatePattern.NORM_DATETIME_PATTERN);
        System.out.println(format22);

        String format = DateUtil.format(new Date(), DatePattern.NORM_TIME_PATTERN);
        String format1 = DateUtil.format(new Date(), DatePattern.NORM_DATE_PATTERN);
        System.out.println(format);
        System.out.println(format1);
        Date date = DateUtil.parse(format1 + StrUtil.SPACE + format).toJdkDate();
        String format2 = DateUtil.format(date, DatePattern.NORM_DATETIME_PATTERN);
        System.out.println(format2);
        String str = "12345";
        String sub = StrUtil.sub(str, 1, 3);
        System.out.println(sub);
        String str1 = "3819067;AB;Ng5_Released;2018-07-17 07:43:05| 3819067;AA;Ng5_Released;2017-03-08 05:45:00| ";
        String[] split = StrUtil.split(str, "|");
        StringBuffer stra = new StringBuffer();
        StringBuffer strb = new StringBuffer();
        StringBuffer strc = new StringBuffer();
        StringBuffer strd = new StringBuffer();


    }


}
