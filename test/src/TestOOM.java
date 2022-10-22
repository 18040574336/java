import java.util.ArrayList;
import java.util.List;

/**
 * @Author: liangpeng
 * @Date: 2022/10/1 21:20
 * @Description:
 */

public class TestOOM  {
    public static void main(String[] args) {
        System.out.println(Math.round(-11.5));
    }




}
class Person{
    public static void say(){
        System.out.println(111);
    }
}