package Chapter25_IO.ThreadPool;

public class MaxCount {

    public static void main(String[] args) {

        int count = Runtime.getRuntime().availableProcessors();
        System.out.println(count);
    }
}
