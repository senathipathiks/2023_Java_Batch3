package Day4.Tasks;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class MusicLibrary {
    private List<String> songs;

    public MusicLibrary() {
        this.songs = new ArrayList<>();
    }

    public void addSong(String song) {
        songs.add(song);
        System.out.println("Song '" + song + "' added to the library.");
    }

    public void removeSong(String song) {
        if (songs.contains(song)) {
            songs.remove(song);
            System.out.println("Song '" + song + "' removed from the library.");
        } else {
            System.out.println("Song not found in the library.");
        }
    }

    public void playRandomSong() {
        if (songs.isEmpty()) {
            System.out.println("No songs in the library to play.");
            return;
        }

        Random random = new Random();
        int randomIndex = random.nextInt(songs.size());
        String randomSong = songs.get(randomIndex);

        System.out.println("Playing random song: '" + randomSong + "'");
    }

    public List<String> getSongs() {
        return songs;
    }
}

public class MusicLibraryTest {
    public static void main(String[] args) {
        MusicLibrary musicLibrary = new MusicLibrary();

        // Add songs
        musicLibrary.addSong("Song1");
        musicLibrary.addSong("Song2");

        // Remove a song
        musicLibrary.removeSong("Song3");

        // Play random song
        musicLibrary.playRandomSong();

        // Display songs in the library
        System.out.println("\nSongs in the library: " + musicLibrary.getSongs());
    }
}
