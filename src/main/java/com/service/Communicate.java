package com.service;

import java.util.ArrayList;
import java.util.List;

import com.model.Player;

public class Communicate {
    private final List<Player> list = new ArrayList<>();

    public void registPlayer(Player player){
        System.out.println("Intialize Player :: " + player.getname());
        player.initialize(this);
        list.add(player);
    }
    
    public void send(String player, String message){
    }

    private Player sendMessage(Player player, String message){
        player.receiveMessage(message);
        return player;
    }

    public void exit(){
        System.out.println("Communicating is Finished");
        System.exit(0);
    }
}