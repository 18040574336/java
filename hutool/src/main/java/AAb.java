import cn.hutool.cache.impl.CacheObj;
import cn.hutool.core.util.BooleanUtil;
import cn.hutool.core.util.StrUtil;

import java.lang.ref.SoftReference;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: liangpeng
 * @Date: 2022/4/18 14:04
 */
public class AAb {

    public static  String replaceUsageValue(String content) {
        if (StrUtil.isBlank(content)){
            return  StrUtil.EMPTY;
        }
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

        return content;
    }

    public static void main(String[] args) {
        boolean aFalse = BooleanUtil.isFalse(null);
        System.out.println(aFalse);
        String s = replaceUsageValue("((AAV004|AAV005|AAV007)&AAP003&AAN003&ABY002)&(ABA100)");
        System.out.println(s);

    }
}
