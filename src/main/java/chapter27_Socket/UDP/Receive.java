package chapter27_Socket.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Receive {

    public static void main(String[] args) throws IOException {

        DatagramSocket ds = new DatagramSocket(10086);

        // 接收数据包
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length);
        ds.receive(dp);

        // 处理数据
        byte[] data = dp.getData();
        int len = dp.getLength();
        InetAddress ia = dp.getAddress();
        int port = dp.getPort();

        System.out.println(new String(data,0,len));
        System.out.println(ia);
        System.out.println(port);




    }
}
