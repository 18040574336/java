import cn.hutool.core.util.StrUtil;

/**
 * @Author: liangpeng
 * @Date: 2021/11/12 9:43
 */
public enum TestEnum {

    A("test"),B("test1"),C("test2");
    private  String value;

    TestEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}



 class Testaa{

     public static void main(String[] args) {
         String str = null;
         String str1 = null;
         System.out.println(StrUtil.equals(str, str1));

     }



}