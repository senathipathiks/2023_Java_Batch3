package com.javacoreday4;

import java.util.ArrayList;
import java.util.Random;

 class MusicLibrary {
    private ArrayList<String> songs;
    private Random random;

    public MusicLibrary() {
        songs = new ArrayList<>();
        random = new Random();
    }

    public void addSong(String song) {
        songs.add(song);
    }

    public void removeSong(String song) {
        songs.remove(song);
    }

    public String playRandomSong() {
        if (songs.size() == 0) {
            return "No songs in the library.";
        }
        int index = random.nextInt(songs.size());
        return "Playing: " + songs.get(index);
    }
}


public class MusicLibraryOperations {
	 public static void main(String[] args) {
	        MusicLibrary myLibrary = new MusicLibrary();

	        // Add songs to the library
	        myLibrary.addSong("Song 1");
	        myLibrary.addSong("Song 2");
	        myLibrary.addSong("Song 3");

	        // Play a random song
	        System.out.println(myLibrary.playRandomSong());

	        // Remove a song
	        myLibrary.removeSong("Song 2");

	        // Try to play another random song
	        System.out.println(myLibrary.playRandomSong());
	    }

}
