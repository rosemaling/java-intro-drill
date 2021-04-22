import java.util.ArrayList;

public class Playlist {
    String name;
    ArrayList<Song> songNames;

    public boolean isEmpty() {
        if (this.songNames.size() == 0){
            return true;
        } else {
            return false;
        }
    }

    public void addSong(Song song){
        this.songNames.add(song);
    }

    public Playlist(String name) {
        this.name = name;
        this.songNames = new ArrayList<Song>();
    }
}
