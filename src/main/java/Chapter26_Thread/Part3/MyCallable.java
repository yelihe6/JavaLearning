package Chapter26_Thread.Part3;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int res = 0;
        for (int i = 1; i <= 1000; i++) {
            res += i;
        }
        return res;
    }
}
