package org.example.chapter27_Socket.TCP;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    //TCP协议  , 客户端 ,  发送数据
    public static void main(String[] args) throws IOException {


        Scanner sc = new Scanner(System.in);
        String next = sc.next();

        Socket socket = new Socket("127.0.0.1",10000);

        //利用通道中的输出流
        OutputStream os = socket.getOutputStream();

        OutputStreamWriter osw = new OutputStreamWriter(os);

        BufferedWriter bw = new BufferedWriter(osw);

        bw.write(next);

        bw.close();
        socket.close();


    }
}
