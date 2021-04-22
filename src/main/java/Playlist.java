import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Playlist {
    String name;
    ArrayList<String> songTitles;
    Object[] array;
    int duration;

    public boolean isEmpty() {
        if (this.songTitles.size() == 0){
            return true;
        } else {
            return false;
        }
    }

    public void addSong(Song song){
        this.songTitles.add(song.title);
        this.duration = this.duration + song.durationInSeconds;
    }

    public int totalDuration(){
        return this.duration;
    }

    public Object[] songNames(){
        array = this.songTitles.toArray();
        return array;
    }

    public void swap(Song foo, Song bar){
        Collections.swap(this.songTitles, this.songTitles.indexOf(foo.title), this.songTitles.indexOf(bar.title));
    }

    public Playlist(String name) {
        this.name = name;
        this.duration = 0;
        this.songTitles = new ArrayList<String>();
    }
}

