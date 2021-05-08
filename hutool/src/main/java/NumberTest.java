import cn.hutool.core.util.NumberUtil;
import cn.hutool.core.util.StrUtil;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author: liangpeng
 * @Date: 2021/4/27 10:46
 */
public class NumberTest {

    public static void main(String[] args) {
        String str = "3819067;AB;Ng5_Released;2018-07-17 07:43:05| 3819067;AA;Ng5_Released;2017-03-08 05:45:00| ";
        String[] split = StrUtil.split(str, "|");
        StringBuffer stra = new StringBuffer();
        StringBuffer strb = new StringBuffer();
        StringBuffer strc = new StringBuffer();
        StringBuffer strd = new StringBuffer();

        for (String o : split) {
            String[] split1 = o.split(";");
            stra.append(split1.length>1 ? split1[0]:StrUtil.EMPTY);
            strb.append(split1.length>2 ? split1[1]:StrUtil.EMPTY);
            strc.append(split1.length>3 ? split1[2]:StrUtil.EMPTY);
            strd.append(split1.length>=4 ? split1[3]:StrUtil.EMPTY);
        }
    }


}
