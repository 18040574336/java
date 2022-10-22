import cn.hutool.core.convert.Convert;
import cn.hutool.core.util.BooleanUtil;
import cn.hutool.core.util.EscapeUtil;
import cn.hutool.core.util.StrUtil;

import java.lang.reflect.Field;
import java.util.*;

/**
 * @Author: liangpeng
 * @Date: 2021/4/24 21:00
 */
public class StringTestData {

    public static void main(String[] args) throws NoSuchFieldException {

        Map<String,Object> map = new HashMap<>();
        User user = new User();
        user.setSex(true);
        Class<? extends User> aClass = user.getClass();
        Field sex = aClass.getDeclaredField("sex");
        Class<User> userClass = User.class;

        for (int i=0;i<10;i++){

           System.out.println("i==="+i);
            for (int j= 0;j<10;j++){
               System.out.println("j==="+j);
               if (j==5){
                   continue  ;
               }
           }

       }


   /*   Student stu = new Student(12,"张三");
      Student stu1 = new Student(13,"李四");
      Student stu2 = new Student(17,"李四");
      Student stu3 = new Student(9,"李四");
      Student stu4 = new Student(8,"李四");
      List<Student> list  = new ArrayList<>();
      list.add(stu);
      list.add(stu1);
      list.add(stu2);
      list.add(stu3);

      list.sort(Comparator.comparing(Student::getAge,Comparator.reverseOrder()));
      list.forEach(p-> System.out.println(p.getAge()));
*/
//      new Thread(()->{
//        while (true){
//          System.out.println(111);
//        }
//      },"test").start();


//      for (;;) {
//          String[] arr = new String[100];
//      }
    }
}

