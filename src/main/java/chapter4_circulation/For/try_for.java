package chapter4_circulation.For;


public class try_for extends Thread{

    public void run() {
        for (int i = 1; i <= 6 ; i++) {
            if (i <= 5){
//                System.out.println("断线重连中");
                try {
                    System.out.println("断线重连中!!~");
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }else {
                try {
                    System.out.println("重连失败");
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

        }

    }




    public static void main(String[] args) throws InterruptedException {
//        for (int i = 1; i <= 9; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j + "*" + i + "=" + i * j + "\t");
//            }
//            System.out.println();
//        }
//        for (int i = 5; i >= 1 ; i--) {
//            System.out.println(i);
//        }
//        Thread thread = new Thread();
        new try_for().start();
    }
}

