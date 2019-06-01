package multithreading;

import java.util.Random;
public class Sender implements Runnable {
    private final Data data;
    private final Random rnd = new Random();
    Sender(Data data) {
       this.data = data;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            data.send(rnd.nextInt(10));         
        }
        data.send(-1);
    }
}