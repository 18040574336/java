/*
package sql;


import com.sun.deploy.util.StringUtils;

import java.util.List;

*//*


import com.sun.deploy.util.StringUtils;

import java.util.List;

*/
/**
 * @author lenovo
 *//*


public class SqlUtils {


*/
/**
     * <b>function:</b> 处理oracle sql 语句in子句中（where id in (1, 2, ..., 1000, 1001)），
     * 如果子句中超过1000项就会报错。
     * 这主要是oracle考虑性能问题做的限制。
     * 如果要解决次问题，可以用 where id (1, 2, ..., 1000) or id (1001, ...)
     *
     * @param ids   in语句中的集合对象
     * @param count in语句中出现的条件个数
     * @param field in语句对应的数据库查询字段
     * @param ororand or 或者 and
     * @param isNot 是否 not in
     * @return 返回 field in (...) or field in (...) 字符串
     *//*


    public static String getOracleSQLIn(List<?> ids, int count, String field, String ororand, String isNot) {
        count = Math.min(count, 1000);
        int len = ids.size();
        int size = len % count;
        if (size == 0) {
            size = len / count;
        } else {
            size = (len / count) + 1;
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            int fromIndex = i * count;
            int toIndex = Math.min(fromIndex + count, len);
            String productId = StringUtils.defaultIfEmpty(StringUtils.join(ids.subList(fromIndex, toIndex), "','"), "");
            if (i != 0) {
                builder.append(" ").append(ororand).append(" ");
            }
            builder.append(field).append(" "+ isNot).append( " in ('").append(productId).append("')");
        }

        return StringUtils.defaultIfEmpty(builder.toString(), field +" "+ isNot + " in ('')");
    }
}

*/
