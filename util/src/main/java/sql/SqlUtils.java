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
     * <b>function:</b> ����oracle sql ���in�Ӿ��У�where id in (1, 2, ..., 1000, 1001)����
     * ����Ӿ��г���1000��ͻᱨ��
     * ����Ҫ��oracle�������������������ơ�
     * ���Ҫ��������⣬������ where id (1, 2, ..., 1000) or id (1001, ...)
     *
     * @param ids   in����еļ��϶���
     * @param count in����г��ֵ���������
     * @param field in����Ӧ�����ݿ��ѯ�ֶ�
     * @param ororand or ���� and
     * @param isNot �Ƿ� not in
     * @return ���� field in (...) or field in (...) �ַ���
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
