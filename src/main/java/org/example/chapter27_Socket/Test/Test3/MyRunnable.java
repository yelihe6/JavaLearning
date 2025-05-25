package org.example.chapter27_Socket.Test.Test3;

import java.io.*;
import java.net.Socket;

public class MyRunnable implements Runnable{

    Socket accept1;
    Socket accept;


    public MyRunnable (Socket accept1, Socket accept){
        this.accept1 = accept1;
        this.accept = accept;
    }

    @Override
    public void run() {
        try {



            InputStream is1 = accept1.getInputStream();

            InputStreamReader isr1 = new InputStreamReader(is1);

            StringBuilder sb = new StringBuilder();

            int kk;

            while ((kk = isr1.read()) != -1) {
                sb.append((char) kk);
                System.out.print((char) kk);
            }
            isr1.close();
            //ss.close();

            String name = sb.toString().strip();



            InputStream is = accept.getInputStream();
            //InputStreamReader isr = new InputStreamReader(is);
            //BufferedReader br = new BufferedReader(isr);

            FileOutputStream fos = new FileOutputStream("src\\chapter27_Socket\\Test\\Test3\\Server\\"+name);
            //BufferedWriter bw = new BufferedWriter(fw);

            byte[] bb = new byte[1024 * 1024 * 5];
            int i;
            while((i = is.read(bb)) != -1) {
                fos.write(bb,0,i);
            }

            OutputStream os = accept.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os);
            osw.write("上传成功!");


            osw.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
