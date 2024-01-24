package com.day24;

import java.util.ArrayList;
import java.util.Random;

class MusicLibrary {
  private ArrayList < Song > songs;

  public MusicLibrary() {
    songs = new ArrayList < Song > ();
  }
  public void addSong(Song song) {
    songs.add(song);
  }
  public void removeSong(Song song) {
    songs.remove(song);
  }
  public ArrayList < Song > getSongs() {
    return songs;
  }
  public void playRandomSong() {
    int size = songs.size();
    if (size == 0) {
      System.out.println("No songs in the library.");
      return;
    }
    Random rand = new Random();
    int index = rand.nextInt(size);
    System.out.println("Now playing: " + songs.get(index).getTitle() + " by " + songs.get(index).getArtist());
  }
}

class Song {
    private String title;
    private String artist;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
}
public class MusicMainClass {

	public static void main(String[] args) {
		MusicLibrary library = new MusicLibrary();
	    library.addSong(new Song("Vaathi Coming", "Anirudh & Gana Bala"));
	    library.addSong(new Song("Bujji", "Santhosh Narayanan & Anirudh"));
	    library.addSong(new Song("Mangalyam", "Silambarasan TR, Roshini JKV, & S. Thaman"));
	    library.addSong(new Song("Enjoy Enjaami", "Dhee, Arivu, and Santhosh Narayanan"));
	    library.addSong(new Song("Master the Blaster", "Anirudh & Bjorn Surrao"));
	    library.addSong(new Song("Chellamma", "Anirudh & Jonita Gandhi"));

	    System.out.println("All songs:");
	    for (Song song: library.getSongs()) {
	      System.out.println(song.getTitle() + " by " + song.getArtist());
	    }
	    System.out.println("\n**Playing Random Song**");
	    library.playRandomSong();
	    System.out.println();
	    library.playRandomSong();
	    System.out.println();
	    library.playRandomSong();
	  }
	}
