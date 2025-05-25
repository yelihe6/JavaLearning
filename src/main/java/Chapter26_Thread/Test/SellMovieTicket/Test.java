package Chapter26_Thread.Test.SellMovieTicket;

public class Test {


    public static void main(String[] args) {

        Ticket ticket = new Ticket();

        Thread t1 = new Thread(ticket,"窗口一");
        Thread t2 = new Thread(ticket,"窗口二");
        Thread t3 = new Thread(ticket,"窗口三");

        t1.start();
        t2.start();
        t3.start();
    }
}
