package com.asong.bio;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class BioServer {
    static int count = 0;
    public static void server(int port) throws IOException, InterruptedException {
        ServerSocket serverSocket = new ServerSocket(port);
        while(true){
            Socket socket  =  serverSocket.accept();
            System.out.println(++count+"次响应请求");
            OutputStream os = socket.getOutputStream();
            InputStream is = socket.getInputStream();
            os.write("hello world".getBytes());
            os.flush();
            byte[] buffer = new byte[1024];
            int len = 0;
            while((len = is.read(buffer)) > 0){
                    System.out.println(new String(buffer,0,len));
            }
             os.close();
            is.close();
            socket.close();
        }

    }
}
