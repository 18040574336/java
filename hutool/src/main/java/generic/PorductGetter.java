package generic;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Author: liangpeng
 * @Date: 2021/11/15 22:51
 */
public class PorductGetter<T> {


    private List<T> list  = new ArrayList<>();

    public void add(T product){

        list.add(product);
    }

    public void getPrdouct(){
        Random random = new Random();

        T t = list.get(random.nextInt(list.size()));
        System.out.println("您抽中了"+t);
    }
}
