package multithreading;

public class Reciever implements Runnable {
    private final Data load;
    private final Thread sender;
    Reciever(Data data, Thread sender) {
        this.load = data;
        this.sender = sender;
    }
    @Override
    public void run() {
         int sent;
         while((sent = load.receive()) != -1)
             System.out.println(sent);
    }
}
