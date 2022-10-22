import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @Author: liangpeng
 * @Date: 2021/7/20 23:57
 */
@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private Integer id;
    private Integer age;
    private String name;

    public Integer getAge() {
        return age;
    }


}
