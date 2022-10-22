package lp.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @Author: liangpeng
 * @Date: 2021/6/22 22:45
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
public class User {
    private Integer age ;
    private String  name;

    public static void main(String[] args) {
        User u = new User().setAge(1).setName("a");
        System.out.println(u);
    }
}
