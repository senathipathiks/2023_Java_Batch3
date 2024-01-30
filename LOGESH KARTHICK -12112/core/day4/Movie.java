package core.day4;

class Movie1{ 
    private String title, director, actors;
    private double reviews;
    void adding(String t,String d,String a,double e) {
        title=t;
        director=d;
        actors=a;
        reviews=e;
    }
    void  retrievingreviews() {
        System.out.println("Movie Title: "+title);
        System.out.println("Movie Director: "+director);
        System.out.println("Movie Actors: "+actors);
        System.out.println("Movie Reviews: "+reviews);
    }}
public class Movie {
    public static void main(String[] args) {
        Movie1 m = new Movie1();
        m.adding("RRR", "SS.RAJAMOULI", "RAMCHARAN , JRNTR ,ALIABHAT", 8.5);
        m.retrievingreviews();

    }

}


