package com.service;

import java.util.ArrayList;
import java.util.List;

class Player {}

interface Playable {
    public void play();
    public void setPlayers(List<Player> Players);
}

class Game implements Playable {
    private List<Player> players;
    public List<Player> getPlayers() {return players;}
    public void setPlayers(List<Player> players) {this.players
            = players;}
    public void play() {System.out.println("Played.");}
}

public class OCA218 {
    public static void main(String[] args) {
        Playable p = new Game();
        List<Player> players = new ArrayList<>();
        p.setPlayers(players);
        p.play();
    }
}
