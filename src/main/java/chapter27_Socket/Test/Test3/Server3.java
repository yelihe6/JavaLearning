package chapter27_Socket.Test.Test3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Server3 {

    public static void main(String[] args) throws IOException {

        ThreadPoolExecutor tpe = new ThreadPoolExecutor(
                6,
                20,
                60,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(4),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );



        ServerSocket ss = new ServerSocket(10001);
        ServerSocket ss1 = new ServerSocket(12345);




        while (true) {
            Socket accept1 = ss.accept();
            Socket accept = ss1.accept();
            tpe.submit(new MyRunnable(accept1,accept));
        }
        //ss1.close();


    }
}
