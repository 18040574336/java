import cn.hutool.core.convert.Convert;

/**
 * @Author: liangpeng
 * @Date: 2021/4/24 21:00
 */
public class StringTest {


    public static void main(String[] args) {
        String a = "我是一个小小的可爱的字符串";

//结果为："\\u6211\\u662f\\u4e00\\u4e2a\\u5c0f\\u5c0f\\u7684\\u53ef\\u7231\\u7684\\u5b57\\u7b26\\u4e32"
        String unicode = Convert.strToUnicode(a);
        System.out.println(unicode);

        //结果为："我是一个小小的可爱的字符串"
        String raw = Convert.unicodeToStr(unicode);
        System.out.println(raw);
    }
}
