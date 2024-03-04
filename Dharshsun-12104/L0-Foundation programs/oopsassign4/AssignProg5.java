package com.oopsassign4;

class Sports {
    public void play() {
        System.out.println("Parent sport class\n");
    }
}


// Subclass Football
class Football extends Sports {
    @Override
    public void play() {
        System.out.println("Play football");
    }
}

// Subclass Basketball
class Basketball extends Sports {
    @Override
    public void play() {
        System.out.println("Play basketball");
    }
}

//subclass rugby
class Rugby extends Sports {
    @Override
    public void play() {
        System.out.println("Play rugby");
    }
}

public class AssignProg5 {
    public static void main(String[] args) {
        Sports sports = new Sports();
        Football football = new Football();
        Basketball basketball = new Basketball();
        Rugby rugby = new Rugby();

        sports.play();
        football.play();
        basketball.play();
        rugby.play();
    }
}
