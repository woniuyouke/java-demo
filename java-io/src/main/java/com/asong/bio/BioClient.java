package com.asong.bio;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class BioClient {

    public static  void client(String msg) throws IOException {
        Socket socket = new Socket("127.0.0.1",8080);
        InputStream is = socket.getInputStream();
        OutputStream os = socket.getOutputStream();
        os.write(msg.getBytes());
        os.flush();
        byte[] buffer = new byte[1024];
        int len = 0;
        while ((len = is.read(buffer))>0){
            System.out.println("len:"+len);
            System.out.println(new String(buffer,0,len));
        }
        System.out.println("关闭流");
        os.close();
        is.close();
        socket.close();
    }
}
