package generic;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.date.DatePattern;
import cn.hutool.core.util.BooleanUtil;
import cn.hutool.core.util.NumberUtil;
import cn.hutool.core.util.ReUtil;
import cn.hutool.core.util.StrUtil;

/**
 * @Author: liangpeng
 * @Date: 2021/11/15 22:54
 */

public class GenericTest {

    public static void main(String[] args) {
        String s = DatePattern.PURE_DATE_PATTERN;
        final String dateRegx = "([0-9]{4})(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])";
        boolean match = ReUtil.isMatch(dateRegx, "10131212");
        System.out.println(match);

        Double aDouble = Convert.toDouble("a123a");
        System.out.println(aDouble);
        double mul = NumberUtil.mul(1.2, 1.2);
        System.out.println(mul);
        System.out.println(1.2d*1.2d);
        PorductGetter<String> get = new PorductGetter<>();
        String arr[]  = {"一等奖","二等奖","三等奖","重在参与"};
        for (int i = 0; i < arr.length; i++) {
            get.add(arr[i]);
        }
        get.getPrdouct();
    }

}
