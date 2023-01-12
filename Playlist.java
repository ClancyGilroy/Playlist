import java.util.ArrayList;
import java.io.*;

/**
 * The Playlist class, which will keep track of a playlist of Song objects
 * Refer to the project description to make sure you have access to all available methods
 */
public class Playlist {
    /**
     * Fields-- This will likely just need to be the ArrayList of Songs. Reference our previous problems
     * (CarDealership, Zoo) for structure on how this will look
     */
    private ArrayList<Song> playlist = new ArrayList<>();

     /**
      * Constructor-- this doesn't need any parameters. You should just initialize the ArrayList and
      * then use additional methods to add Songs in one-by-one
      */
      public Playlist(){
      }

      /**
       * Methods-- Remember that you need to be able to complete all of the following:
       * Adding a song
       * 'liking' a song
       * Removing a specific song
       * Examining all Songs (a String return or void print makes sense here)
       * Examining a sublist of all liked songs
       * Determining the total duration of all songs
       * Removing all unliked songs from the playlist (careful with this one!)
       */
      public void add(Song x){
        playlist.add(x);
      }
      public void remove(int index){
        playlist.remove(index - 1);
      }
      public ArrayList<String> examine(){
        ArrayList<String> x = new ArrayList<>();
        for(int i = 0; i < playlist.size(); i ++){
            Song currentsong = playlist.get(i);
            String currentname = currentsong.getname();
            String currentartist = currentsong.getartist();
            int currentlength = currentsong.getlength();
            String currentformattedlength = "(" + currentlength / 60 + ":" + currentlength % 60 + ")";
            String y = "\"" + currentname + "\" by " + currentartist + currentformattedlength;
            x.add(y);
        }
        return x;
      }
      public ArrayList<String> examineliked(){
        ArrayList<String> x = new ArrayList<>();
        for(int i = 0; i < playlist.size(); i ++){
            Song currentsong = playlist.get(i);
            String currentname = currentsong.getname();
            String currentartist = currentsong.getartist();
            int currentlength = currentsong.getlength();
            boolean currentliked = currentsong.getliked();
            String currentformattedlength = "(" + currentlength / 60 + ":" + currentlength % 60 + ")";
            String y = "\"" + currentname + "\" by " + currentartist + currentformattedlength;
            if(currentliked){
                x.add(y);
            }
        }
        return x;
      }
      public String duration(){
        int sum = 0;
        for(int i = 0; i < playlist.size(); i++){
            Song currentsong = playlist.get(i);
            int currentlength = currentsong.getlength();
            sum += currentlength;
        }
        String x = sum / 60 + ":" + sum % 60;
        return x;
      }
      public void removeunliked(){
        ArrayList<Integer> indexlist = new ArrayList<>();
        for(int i = 0; i < playlist.size(); i++){
            Song currentsong = playlist.get(i);
            boolean currentliked = currentsong.getliked();
            if(!currentliked){
                indexlist.add(i);
            }
        }
        Collections.sort(indexlist);
        Collections.reverse(indexlist);  
        //this method is not done 
      }
}
