package com.day4.core;

import java.util.ArrayList;
import java.util.Random;

class MusicLibrary {
    private ArrayList<String> songs;
    private Random random;

    public  MusicLibrary() {
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
public class Main {
    public static void main(String[] args) {
        MusicLibrary myLibrary = new MusicLibrary();
        myLibrary.addSong("Song 1");
        myLibrary.addSong("Song 2");
        myLibrary.addSong("Song 3");
        myLibrary.addSong("Song 4");
        myLibrary.addSong("Song 5");
        myLibrary.addSong("Song 6");
        System.out.println(myLibrary.playRandomSong());
    }
}
