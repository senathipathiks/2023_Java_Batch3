package com.day5;

//Declare the Player interface
interface Player {
 // Declare the abstract method "play" that classes implementing this interface must provide
 void play();
}

//Declare the CricketPlayer class, which implements the Player interface
class CricketPlayer implements Player {
 // Implement the "play" method required by the Player interface
 public void play() {
     // Print a message indicating that cricket is being played
     System.out.println("Playing cricket");
     // Additional code to play cricket can be added here
 }
}

//Declare the VolleyBallPlayer class, which implements the Player interface
class VolleyBallPlayer implements Player {
 // Implement the "play" method required by the Player interface
 public void play() {
     // Print a message indicating that volleyball is being played
     System.out.println("Playing volleyball");
     // Additional code to play volleyball can be added here
 }
}

//Declare the FootballPlayer class, which implements the Player interface
class FootballPlayer implements Player {
 // Implement the "play" method required by the Player interface
 public void play() {
     // Print a message indicating that football is being played
     System.out.println("Playing football");
     // Additional code to play football can be added here
 }
}

//Declare the Main class
public class Main {
 public static void main(String[] args) {
     // Create instances of Player objects for cricket, volleyball, and football
     Player cricketPlayer = new CricketPlayer();
     Player volleyBallPlayer = new VolleyBallPlayer();
     Player footballPlayer = new FootballPlayer();

     // Call the "play" method on each Player object to play different sports
     cricketPlayer.play();
     volleyBallPlayer.play();
     footballPlayer.play();
 }
}

