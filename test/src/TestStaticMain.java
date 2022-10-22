import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author: liangpeng
 * @Date: 2022/10/7 10:59
 * @Description:
 */

public class TestStaticMain {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket accept = serverSocket.accept();
        System.out.println("124");

    }
}
