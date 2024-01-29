package Java_Day_5;



abstract class Player {
    int pno;
    String pname;
    String gname;

    void read_play(int pno, String pname, String gname) {
        this.pno = pno;
        this.pname = pname;
        this.gname = gname;
    }

    void display() {
        System.out.println("Player no:" + pno + "Player name: " + pname + "Game name: " + gname);
    }

    abstract void no_of_players();
}

class CricketPlayer extends Player {
    void read_Cplay(int pno, String pname, String gname) {
        super.read_play(pno, pname, gname);
    }

    @Override
    void no_of_players() {
        System.out.println("12 Players");

    }

}

class VolleyBallPlayer extends Player {
    void read_Vplay(int pno, String pname, String gname) {
        super.read_play(pno, pname, gname);
    }

    @Override
    void no_of_players() {
        System.out.println("6 Players");

    }

}

class FootBallPlayer extends Player {
    void read_Fplay(int pno, String pname, String gname) {
        super.read_play(pno, pname, gname);
    }

    @Override
    void no_of_players() {
        System.out.println("8 Players");

    }

}

public class PlayerCric {

    public static void main(String[] args) {
        CricketPlayer obj1 = new CricketPlayer();
        // obj1.;
        obj1.read_Cplay(11, "Dhoni", "Cricket");
        obj1.no_of_players();

        VolleyBallPlayer obj2 = new VolleyBallPlayer();
        obj2.read_Vplay(22, "Rahul", "VollyBall");
        obj2.no_of_players();

        FootBallPlayer obj3 = new FootBallPlayer();
        obj3.read_Fplay(33, "Arun", "FootBall");
        obj3.no_of_players();

    }

}



