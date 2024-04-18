import java.util.HashMap;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<>();
        trackList.put("song_1", "name_1");
        trackList.put("song_2", "name_2");
        trackList.put("song_3", "name_3");
        trackList.put("song_4", "name_4");
        System.out.println(trackList.get("song_3"));
        Set<String> keys = trackList.keySet();
        for (String key : keys) {
            System.out.println("Track: " + key + " Lyrics: " + trackList.get(key));
        }
    }
}
