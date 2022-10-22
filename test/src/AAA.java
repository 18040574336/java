import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AAA extends AbstractTest {

    public AAA(String name) {
        super(name);
    }


    private static ThreadLocal<SimpleDateFormat> sdf = ThreadLocal.withInitial(()->new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));

    public static Date parse(String strDate) throws ParseException {

        return sdf.get().parse(strDate);
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(20);
        for (int i = 0; i < 20; i++) {
            executorService.execute(() -> {
                try {
                    System.out.println(parse("2022-12-12 13:23:13"));
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            });
        }


    }
}
