import java.util.ArrayList;
import java.util.Arrays;

public class Playlist {
    String name;
    ArrayList<String> songTitles;
    Object[] array;

    public boolean isEmpty() {
        if (this.songTitles.size() == 0){
            return true;
        } else {
            return false;
        }
    }

    public void addSong(Song song){
        this.songTitles.add(song.title);
    }

    public Object[] songNames(){
        array = this.songTitles.toArray();
        return array;
    }

    public Playlist(String name) {
        this.name = name;
        this.songTitles = new ArrayList<String>();
    }
}

