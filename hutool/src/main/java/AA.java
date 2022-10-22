import cn.hutool.core.date.DatePattern;
import cn.hutool.core.lang.Assert;
import cn.hutool.core.util.CharsetUtil;
import cn.hutool.core.util.HexUtil;
import cn.hutool.core.util.ReUtil;
import cn.hutool.core.util.StrUtil;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: liangpeng
 * @Date: 2021/5/8 11:14
 */
public class AA {

    public static void main(String[] args) {

       // System.out.println(replaceUsageValue("(AAG005|AAG005)&(AGL003|AGL005)"));


       String st1 =  DatePattern.NORM_DATETIME_PATTERN;
       String str2 = DatePattern.UTC_PATTERN;
       System.out.println(st1);
        if(true)
            System.out.println(1);


        String str = "我是一个&()字符串";
        String str1 = "a&!()b{}";

        String hex = HexUtil.encodeHexStr(str, CharsetUtil.CHARSET_UTF_8);
        String hex1 = HexUtil.encodeHexStr(str1, CharsetUtil.CHARSET_UTF_8);
        System.out.println(hex);
        System.out.println(hex1);

        String join = StrUtil.join("&", Arrays.asList(hex, hex1));
        System.out.println(join);
//hex是：
//e68891e698afe4b880e4b8aae5ad97e7aca6e4b8b2

        String decodedStr = HexUtil.decodeHexStr(hex);
        System.out.println(decodedStr);

    }

    //        System.out.println(replaceUsageValue("(AAG005|AAG005)&(AGL003|AGL005)"));

    @Test
    public  void replaceUsageValue() {

        List<String> list = new ArrayList<>();
        Iterator<String> iterator = list.iterator();


        String content = "!AGK005&(AAG030|AAG032)&((ACV003&(AGL003|AGL005))|AAP003|AAP004)";

        String regEx = "[a-zA-Z0-9]+";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(content);
        Set<String> exists = new HashSet<>();
        while (m.find()) {
            String group = m.group(0);
            if (exists.contains(group)){
                continue;
            }
            String sub = StrUtil.sub(group, 0, 3);
            content = content.replace(group, sub+"='"+group +"'");
            exists.add(group);
        }
        content = content.replaceAll("&", " AND ").replaceAll("\\|", " OR ").replaceAll("!"," NOT ");
        System.out.println(content);
    }



}
