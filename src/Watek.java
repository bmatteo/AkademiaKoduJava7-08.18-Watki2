public class Watek implements Runnable{
    private int number;

    public Watek(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Watek " + this.number + " - i:" + i);
        }

        synchronized (Main.lock) {
            try {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Watek " + this.number + " - petlaWewnetrzna1: " + i);
                }

                Thread.sleep(1000);

                for (int i = 0; i < 10; i++) {
                    System.out.println("Watek " + this.number + " - petlaWewnetrzna2: " + i);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
