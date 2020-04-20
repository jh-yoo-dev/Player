package com;

import com.model.Player;
import com.service.Communicate;

/**
 * Hello world!
 */
public class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        run();
    }

    public static void run(){
        Communicate communicate = new Communicate();
        Player palyer1 = new Player("Initiator");
        Player player2 = new Player("Player2");      
        communicate.registPlayer(palyer1);
        communicate.registPlayer(player2);

        palyer1.sendMessage("hello");

    }
}
