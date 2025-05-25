package org.example.chapter27_Socket.UDP;

import java.io.IOException;
import java.net.*;

public class Send {

    public static void main(String[] args) throws IOException {

        DatagramSocket ds = new DatagramSocket();

        //2. 打包数据
        String str = "你好呀!!!";
        byte[] bytes = str.getBytes();
        InetAddress address = InetAddress.getByName("127.0.0.1");
        int port = 10086;

        DatagramPacket dp = new DatagramPacket(bytes,bytes.length,address,port);

        //3. 发送数据
        ds.send(dp);

        //4. 释放资源
        ds.close();


    }
}
