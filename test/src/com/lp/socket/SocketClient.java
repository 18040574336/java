package com.lp.socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class SocketClient {
    public static void main(String[] args) throws IOException {
        while (true){
            Socket socket = new Socket("127.0.0.1", 8080);
            OutputStream outputStream = socket.getOutputStream();
            System.out.println("请输入发送数据");
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            if ("exit".equals(s)){
                break;
            }
            byte[] bytes = s.getBytes();
            outputStream.write(bytes);
            System.out.println("发送客户端");
            outputStream.close();
            socket.close();

        }

    }
}
