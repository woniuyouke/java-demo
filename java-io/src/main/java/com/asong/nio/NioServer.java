package com.asong.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

public class NioServer {
    private static SocketAddress socketAddress;
    private static Selector selector;
    private static ByteBuffer buffer = ByteBuffer.allocate(1024);

    public static void Server(int port) throws IOException {
        socketAddress = new InetSocketAddress(port);
        //多路复用的channel
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.bind(socketAddress);
        //设置channel为非阻塞的
        serverSocketChannel.configureBlocking(false);
        //生成选择器
        selector = Selector.open();
        //绑定channel和selector，接受请求
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);

        //使用selector 进行循坏

        while (true) {
            int count = selector.select();
            if (count == 0) {
                continue;
            } else {
                Set<SelectionKey> keys = selector.selectedKeys();
                Iterator<SelectionKey> iterator = keys.iterator();
                while (iterator.hasNext()) {
                    process(iterator.next());
                }
                iterator.remove();
            }

        }
    }

    private static void process(SelectionKey key) throws IOException {
        if (key.isAcceptable()) {
            ServerSocketChannel server = (ServerSocketChannel) key.channel();
            SocketChannel socketChannel = server.accept();
            socketChannel.configureBlocking(false);
            socketChannel.register(selector,SelectionKey.OP_READ);
        }else if(key.isReadable()){
            SocketChannel socketChannel = (SocketChannel) key.channel();
            //读取客户端传输过来的数据
            //读取到哪里去，读到缓冲区中
            int len=socketChannel.read(buffer);
            if(len>0){
                buffer.flip();   //锁定
                //从缓冲区中取出数据
                String content=new String(buffer.array(),0,len);
                //打印出结果
                System.out.println(content);
            }
            //此时告诉大管家，可以进行写操作了
            socketChannel.register(selector,SelectionKey.OP_WRITE);
            buffer.clear();
        }else if(key.isWritable()){
            SocketChannel client = (SocketChannel)key.channel();
            client.write(buffer.wrap("Hello GuPao!".getBytes()));
            client.close();
        }
    }
}
