package multithreading;

public class Data {
    private int number;
    private boolean transfer = true;
  
    public synchronized void send(int number) {
        while (!transfer) {
            try { 
                this.wait();
            } catch (InterruptedException ex)  {
            }
        }
        transfer = false;
        this.number = number;
        this.notifyAll();
    }
  
    public synchronized int receive() {
        while (transfer) {
            try {
                this.wait();
            } catch (InterruptedException ex) {
            }
        }
        transfer = true;
        this.notifyAll();
        return number;
    }
}