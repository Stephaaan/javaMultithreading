/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

/**
 *
 * @author stefan.rothmajer
 */
public class Reciever implements Runnable {
    private Data load;
    private Thread sender;
    Reciever(Data data, Thread sender) {
        this.load = data;
        this.sender = sender;
    }
  
    // standard constructors
  
    public void run() {
        /*for(String receivedMessage = load.receive();
          !"End".equals(receivedMessage);
          receivedMessage = load.receive()) {
          */
         while(sender.isAlive())
            System.out.println(load.receive());
 
            // ...
         
        
    }
}
