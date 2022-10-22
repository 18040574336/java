import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.util.StrUtil;

import javax.annotation.Resource;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author: liangpeng
 * @Date: 2021/5/12 16:08
 */
@Resource
public class TestBeanUtil {


    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        List<? extends Person> list = new ArrayList<>();
        User user = new User();
        personList.add(new Person("张三",12));
        personList.add(new Person("张三1",13));
        personList.add(new Person("张三2",14));
        personList.add(new Person("张三3",15));
        personList.add(new Person("张三4",16));

        List<Person> collect = personList.stream().filter(p -> p.getAge() > 14).collect(Collectors.toList());
        System.out.println(collect.get(0) == personList.get(3));

        personList.forEach(p-> System.out.println(p.getAge()));



//        Map<String,String> map1 = new HashMap<>();
//        Map<String,String> map2 = new HashMap<>();
//        map1.put("a","a");
//        map1.put("b","b");
//        map2.put("c","c");
//        map2.put("d","d");
//        Set<String> sets = new HashSet<>();
//        sets.forEach(p->{
//            System.out.println(1);
//            System.out.println(1);
//
//        });
//        sets.addAll(map1.keySet());
//        sets.addAll(map2.keySet());
//        List<String> strings = Arrays.asList("");
//        boolean notEmpty = CollectionUtil.isNotEmpty(strings);
//        System.out.println(notEmpty);
//
//        boolean b = StrUtil.equalsAny("a", "a", "b");
//        System.out.println(b);

//
//        Person p = new Person("张三",25);
//        Person p1 = new Person();
//        BeanUtil.copyProperties(p,p1);
//        p.setAge(28);
//        System.out.println(p1.getAge());

    }
}
