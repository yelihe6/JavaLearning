package org.example.chapter27_Socket.Test.Test1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client1 {
    public static void main(String[] args) throws IOException, InterruptedException {

        Socket socket = new Socket("127.0.0.1",12345);

        Scanner sc = new Scanner(System.in);

        OutputStream os = socket.getOutputStream();

        OutputStreamWriter osw = new OutputStreamWriter(os);

        BufferedWriter bw = new BufferedWriter(osw);

        while (true) {



            String next = sc.next();

            bw.write(next);
            bw.newLine();

            bw.close();

            if ("886".equals(next)){
                socket.close();
                break;
            }
        }



    }
}
