import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {

    public static Integer lock = 5;

    public static void main(String[] args) {
        ScheduledExecutorService threadPool = Executors.newScheduledThreadPool(3);

        threadPool.schedule(new Watek(1), 1, TimeUnit.SECONDS);
        threadPool.schedule(new Watek(2), 1, TimeUnit.SECONDS);

        threadPool.shutdown();
    }
}
