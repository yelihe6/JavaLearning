package chapter27_Socket.Test.Test2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Client2 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        while (true) {

            Socket socket = new Socket("127.0.0.1",12345);
            System.out.println("请输入信息: ");
            String next = sc.next();



            OutputStream os = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);

            ServerSocket ss = new ServerSocket(12346);

            bw.write(next);
            bw.newLine();
            bw.close();


            if ("999".equals(next)) {
                Socket accept = ss.accept();
                InputStream is = accept.getInputStream();
                InputStreamReader isr = new InputStreamReader(is);
                BufferedReader br = new BufferedReader(isr);
                //System.out.println("999".equals(next));
                int bb;
                while ((bb = br.read()) != -1) {
                    System.out.print((char) bb);
                }
                br.close();
            }


            ss.close();







            if ("886".equals(next)){
                socket.close();
                break;
            }
        }

    }
}
