
package multithreading;
public class Multithreading {

    public static void main(String[] args) {
        Data generatedNumber = new Data();
        Thread sender = new Thread(new Sender(generatedNumber));
        Thread receiver = new Thread(new Reciever(generatedNumber, sender));
        sender.start();
        receiver.start();
    }
}
    

