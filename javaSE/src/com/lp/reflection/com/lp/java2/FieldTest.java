package com.lp.reflection.com.lp.java2;

import com.lp.reflection.com.lp.java.Person;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Objects;

/**
 * 获取当前运行时类的属性结构
 *
 * @author shkstart
 * @create 2019 下午 3:23
 */
public class FieldTest {


    public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException, ClassNotFoundException {

        Class<?> aClass = Class.forName("java.util.HashMap$Node");
        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor(int.class, Object.class, Object.class, aClass);
        declaredConstructor.setAccessible(true);
        System.out.println(declaredConstructor.newInstance(1,2,3,null));

     //   Constructor<?> declaredConstructor = aClass.getDeclaredConstructor(int.class, Object.class,Object.class,Object.class);
     //   System.out.println(aClass.getName());
//        for (Class cls : innerClazz) {
//            System.out.println(cls);
//
//        }
        // 获取匿名内部类实例
//        Field field = clazz.getDeclaredField("r");
//        field.setAccessible(true);
//        Runnable r = (Runnable) field.get(container);
//        r.run();
    }

    @Test
    public void test1(){

        Class clazz = Person.class;

        //获取属性结构
        //getFields():获取当前运行时类及其父类中声明为public访问权限的属性
        Field[] fields = clazz.getFields();
        for(Field f : fields){
            System.out.println(f);
        }
        System.out.println();

        //getDeclaredFields():获取当前运行时类中声明的所有属性。（不包含父类中声明的属性）
        Field[] declaredFields = clazz.getDeclaredFields();
        for(Field f : declaredFields){
            System.out.println(f);
        }
    }

    //权限修饰符  数据类型 变量名
    @Test
    public void test2(){
        Class clazz = Person.class;
        Field[] declaredFields = clazz.getDeclaredFields();
        for(Field f : declaredFields){
            //1.权限修饰符
            int modifier = f.getModifiers();
            System.out.print(Modifier.toString(modifier) + "\t");

            //2.数据类型
            Class type = f.getType();
            System.out.print(type.getName() + "\t");

            //3.变量名
            String fName = f.getName();
            System.out.print(fName);

            System.out.println();
        }


    }


}
