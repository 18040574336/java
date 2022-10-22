import cn.hutool.core.collection.CollectionUtil;

import cn.hutool.core.util.StrUtil;
import org.junit.jupiter.api.Test;
import org.openjdk.jol.info.ClassLayout;
import org.openjdk.jol.vm.VM;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ThreadLocalRandom;


/**
 * @Author: liangpeng
 * @Date: 2021/11/25 19:39
 */
public class TTT {
    public static void main(String[] args){
        CompletableFuture<Object> objectCompletableFuture = CompletableFuture.supplyAsync(() -> {
            return null;
        });
        CompletableFuture<Void> voidCompletableFuture = CompletableFuture.allOf(objectCompletableFuture);
        Student s = new Student();
        String str = null;
        System.out.println("abc" + str);

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("c");
        list.add("d");
        List<List<String>> lists = CollectionUtil.splitList(list, 1);
        System.out.println(lists.size());


//
//        String aa="T000000000";
//        String substring = aa.substring(0, aa.length() - 1);
//        System.out.println(substring);
//
//        Integer a = null;
//
//        Object o = Proxy.newProxyInstance(TTT.class.getClassLoader(), null, new InvocationHandler() {
//            @Override
//            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                return null;
//            }
//        });
//        Long tempId =-10L;
//        System.out.println(++tempId);
//       List<Student> list = new ArrayList<>();
//       list.add(new Student(1,12,"张三"));
//       list.add(new Student(2,13,"李四"));
//       list.add(new Student(3,14,"王五"));
//       list.forEach(p-> System.out.println(p));
//        System.out.println("--------------");
//       Student del = new Student(1,11,"AA");
//       List<Student> list1 = new ArrayList<>();
//       list1.add(del);
//       list.removeAll(list1);
//        list.forEach(p-> System.out.println(p));


//        boolean aFalse = BooleanUtil.isTrue(null);
//        System.out.println(aFalse);
//        List<Person> users = new ArrayList<>();
//        User p = new User();
//        User p1 = new User();
//        users.add(p);
//        users.add(p1);
//        List<Person> collect = users.stream().collect(Collectors.toList());
//        System.out.println(collect.getClass());
    }

    private static boolean test() {
        System.out.println(111);
        return true;
    }

    /**
     * 将对象直接转换成String类型的 XML输出
     *
     * @param obj 需要转化的对象
     * @return xml报文
     */
//    public static String convertToXml(Object obj) {
//        // 创建输出流
//        StringWriter sw = new StringWriter();
//        try {
//            JAXBContext context = JAXBContext.newInstance(obj.getClass());
//            Marshaller marshaller = context.createMarshaller();
//            // 格式化xml输出的格式
//            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,
//                    Boolean.TRUE);
//            // 将对象转换成输出流形式的xml
//            marshaller.marshal(obj, sw);
//        } catch (JAXBException e) {
//            e.printStackTrace();
//        }
//        return sw.toString();
//    }


    @Test
    public  void Test(){
       String str =  "6105/6201/6205/6206/6207/11591/";
        System.out.println(StrUtil.subPre(str, StrUtil.ordinalIndexOf(str, "/", 4)+1));

    }

    @Test
    public  void Test1(){
        Object o  = new Object();
        System.out.println(ClassLayout.parseInstance(o).toPrintable());

    }

    @Test
    public  void Test2(){
        String format = String.format("(!%s|%s)=>%s", "a", "b", "c");
        System.out.println(format);

    }
    @Test
    public  void Test3(){
       int a = 5;
       int b =2;
        System.out.println(a /b);

    }
}
