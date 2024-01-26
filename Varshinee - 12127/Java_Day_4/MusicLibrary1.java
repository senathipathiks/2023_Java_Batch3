package Java_Day_4;



//Write a Java program to create a class called "MusicLibrary" with a collection of songs and methods to add and remove songs, and to play a random song.


import java.util.ArrayList;

class MusicLibrary{
	ArrayList<String> song;
	
	MusicLibrary(){
		this.song=new ArrayList<String>();
	}
	
	void addMusic() {
		System.out.println("The Songs is Added to the Platlist: ");
		song.add("Rahman");
		song.add("Harris Jayaraj");
		song.add("Imman");
		song.add("VidhyaSagar");
		song.add("Ilaiyaraja");
		System.out.println(song);
	}
	void removeMusic() {
		System.out.println("The Song is removed from the Playlist: ");
		song.remove(2);
		song.remove(1);
		System.out.println(song);
	}
	void randomMusic() {
		System.out.println("The Random song is playing: ");
		System.out.println(song.get(1));
		
	}
}

public class MusicLibrary1 {

	public static void main(String[] args) {
		MusicLibrary obj = new MusicLibrary();
		obj.addMusic();
		obj.removeMusic();
		obj.randomMusic();

	}

}

