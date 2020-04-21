package com.service;

import java.util.ArrayList;
import java.util.List;

import com.model.Player;

public class Communicate {
    private final List<Player> list = new ArrayList<>();

    public void registPlayer(Player player) {
        System.out.println("Registered Player :: " + player.getName());
        player.initialize(this);
        list.add(player);
    }

    private Player sendMessage(Player player, String message){
        player.receiveMessage(message);
        return player;
    }

    public void send(String name, String message) {
        try {
            list.stream()
            .filter(player -> isSendPlayer(player, name))
            .findFirst()
            .map(player -> sendMessage(player, message));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void exit(){
        System.out.println("Communicating is Finished");
        System.exit(0);
    }
      
    private boolean isSendPlayer(Player player, String name) {
        if(name.equals(player.getName())){
            return false;
        }else {
            return true;
        }
    }
}