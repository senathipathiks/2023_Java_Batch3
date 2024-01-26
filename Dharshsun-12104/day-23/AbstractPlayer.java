package com.javacoreday5;

abstract class Player {
    String name;

    Player(String name) {
        this.name = name;
    }

    abstract void play();
}

class CricketPlayer extends Player {
    CricketPlayer(String name) {
        super(name);
    }

    @Override
    void play() {
        System.out.println(name + " is cricket player.");
        System.out.println("Cricket team consists of 11 players");
    }
}

class VolleyBallPlayer extends Player {
    VolleyBallPlayer(String name) {
        super(name);
    }

    @Override
    void play() {
        System.out.println(name + " is volleyball player.");
        System.out.println("Volleyball team consists of 8 players");
    }
}

class FootBallPlayer extends Player {
    FootBallPlayer(String name) {
        super(name);
    }

    @Override
    void play() {
        System.out.println(name + " is football player.");
        System.out.println("Football team consists of 14 players");
    }
}

public class AbstractPlayer {
    public static void main(String[] args) {
        Player cricketPlayer = new CricketPlayer("Sachin");
        Player volleyBallPlayer = new VolleyBallPlayer("Karch");
        Player footBallPlayer = new FootBallPlayer("Messi");

        cricketPlayer.play();
        volleyBallPlayer.play();
        footBallPlayer.play();
    }
}
