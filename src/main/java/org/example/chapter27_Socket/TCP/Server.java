package org.example.chapter27_Socket.TCP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    //TCP协议服务端 , 接收数据
    public static void main(String[] args) throws IOException {

        //服务端对象
        ServerSocket ss = new ServerSocket(10000);



        while (true) {
            //监听数据
            Socket accept = ss.accept();

            InputStream is = accept.getInputStream();

            InputStreamReader isr = new InputStreamReader(is);

            BufferedReader br = new BufferedReader(isr);

            StringBuffer sb = new StringBuffer();

            int bb;
            while ((bb = br.read()) != -1) {
                sb.append((char) bb);
                System.out.print((char) bb);
            }


            if ("886".equals(sb.toString())){
                br.close();
                accept.close();
                ss.close();
                break;
            }
        }
    }
}
