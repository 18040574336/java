package com.lp.socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(8080);
        while (true){
            Socket accept = serverSocket.accept();
            InputStream inputStream = accept.getInputStream();
            byte[] data = new byte[1024];
            int read = inputStream.read(data);
            System.out.println("收到客户端："+new String(data,0,read));
            inputStream.close();
            accept.close();
        }

    }
}
