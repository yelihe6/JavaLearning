package org.example.chapter27_Socket.Test.Test3;

import java.io.*;
import java.net.Socket;

public class Client3 {

    public static void main(String[] args) throws IOException {


        //BufferedReader br = new BufferedReader(fr);
        Socket socket1 = new Socket("127.0.0.1", 10001);

        File file = new File("src\\chapter27_Socket\\Test\\Test3\\Client\\cover.jpg");

        OutputStream os1 = socket1.getOutputStream();
        OutputStreamWriter osw = new OutputStreamWriter(os1);
        BufferedWriter bw = new BufferedWriter(osw);

        System.out.println(file.getName());
        bw.write(file.getName());
        bw.flush();
        //bw.close();
        //socket.shutdownOutput();
        socket1.shutdownOutput();
        socket1.close();


        Socket socket = new Socket("127.0.0.1", 12345);

        OutputStream os = socket.getOutputStream();
        //OutputStreamWriter osw = new OutputStreamWriter(os);
        //BufferedWriter bw = new BufferedWriter(osw);

        FileInputStream fis = new FileInputStream(file);


        byte[] c = new byte[1024*1024*5];
        int i;
        while ((i = fis.read(c)) != -1) {
            os.write(c,0,i);
        }

        socket.shutdownOutput();

        InputStream is = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);


        int ss;
        while((ss = isr.read()) != -1) {
            System.out.print((char) ss);
        }

        fis.close();
        bw.close();
        //socket1.close();
        socket.close();
        osw.close();
    }


}
