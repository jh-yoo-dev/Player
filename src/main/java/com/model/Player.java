package com.model;

import com.service.Communicate;

/**
 * @author jhyoo
 */
public class Player {
    private Communicate communicate;
    private final String name;
    private int sentCount = 0;
    private int receivedCount = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getReceivedCount() {
        return receivedCount;
    }

    public void setReceivedCount(int receivedCount) {
        this.receivedCount = receivedCount;
    }

    public int getSentCount() {
        return sentCount;
    }

    public void setSentCount(int sentCount) {
        this.sentCount = sentCount;
    }

    public void sendMessage(String message) {
        System.out.println(name + " send message :: " + message);
        this.setSentCount(this.getSentCount() + 1);
        communicate.send(name, message);
    }

    public void receiveMessage(String message) {
        System.out.println(name + " received message :: " + message);
        this.setReceivedCount(this.getReceivedCount()+1);
        message = message + " " + this.sentCount;
        if(sentCount!=10 && receivedCount!=10){
            sendMessage(message);        
        }else {
            communicate.exit();
        }
    }

    public void initialize(Communicate communicate){
        this.communicate = communicate;
    }


}