package org.example.chapter27_Socket.Test.Test2;

import chapter21_Stream.test.Actor;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server2 {

    public static void main(String[] args) throws IOException {

        //服务端对象
        ServerSocket ss = new ServerSocket(12345);



        while (true) {

            //监听数据
            Socket accept = ss.accept();


            InputStream is = accept.getInputStream();


            InputStreamReader isr = new InputStreamReader(is);


            BufferedReader br = new BufferedReader(isr);


            StringBuffer sb = new StringBuffer();
            //StringBuilder SB = new StringBuilder();

            int bb;
            while ((bb = br.read()) != -1) {
                sb.append((char) bb);
                //SB.append((char) bb);
                System.out.print((char) bb);
            }
            String string = sb.toString();
            if ("999".equals(string.strip())) {
                Socket accept1 = new Socket("127.0.0.1",12346);
                OutputStream os = accept1.getOutputStream();
                OutputStreamWriter osw = new OutputStreamWriter(os);
                BufferedWriter bw = new BufferedWriter(osw);
                bw.write("123456");
                bw.newLine();
                bw.close();
                accept1.close();
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
