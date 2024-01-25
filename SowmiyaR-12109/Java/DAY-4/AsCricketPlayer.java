package Day4;

//CrickerPlayer,Batsman,Bowler


class CricketPlayer{
  void noofmatch() {
      System.out.println("five match");
  }
}
class Batsman extends CricketPlayer{
  void noofbating() {
      System.out.println("play until out");
  }
}
class Bowler extends CricketPlayer{
  void noofbowling() {
      System.out.println("6 balls for an one over");
  }
}
public class AsCricketPlayer {

  public static void main(String[] args) {
      CricketPlayer obj1=new CricketPlayer();
      obj1.noofmatch();
      
      Batsman obj2=new Batsman();
      obj2.noofbating();
      
      Bowler obj3=new Bowler();
      obj3.noofbowling();

  }

}
