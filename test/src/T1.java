import java.io.IOException;
import java.net.*;

public class T1 {

    public static void main(String[] args) throws IOException {
        InetAddress byName = InetAddress.getByName("192.168.137.1");
        String hostName = byName.getHostName();
        String hostAddress = byName.getHostAddress();
        System.out.println(hostAddress);
        System.out.println(hostName);

        ServerSocket serverSocket = new ServerSocket(8090);
        Socket accept = serverSocket.accept();
    }
}
