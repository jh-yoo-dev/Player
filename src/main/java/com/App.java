package com;

import com.model.Player;
import com.service.Communicate;

/**
 * Hello world!
 * @author jhyoo
 */
public class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     * @throws Exception
     */
    public static void main(String[] args){
        run();
    }

    public static void run() {
        Communicate communicate = new Communicate();
        Player player1 = new Player("Initiator");
        Player player2 = new Player("Player2");      
        communicate.registPlayer(player1);
        communicate.registPlayer(player2);
        player1.sendMessage("message");
    }
}
