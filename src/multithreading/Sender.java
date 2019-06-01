/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

import java.util.Random;

public class Sender implements Runnable {
    private Data data;
    private Random rnd = new Random();
    Sender(Data data) {
       this.data = data;
    }
  
    // standard constructors
  
    public void run() {
        for (int i = 0; i < 10; i++) {
            data.send(rnd.nextInt(10));           
        }
    }
}