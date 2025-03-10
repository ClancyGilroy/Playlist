/**
 * File for a Song class to be used in the Playlist Project
 * @author
 * @version
 */
public class Song {
    //Fields-- what information do we want each Song to store?
    private boolean liked;
    private int length;
    private String name;
    private String artist;

    /**
     * Constructor-- what information needs to be given to make a Song?
     * How will you handle 'liked' songs? It makes sense for a Song not be 'liked' by default
     */
    public Song(String mylength, String myname, String myartist){
        liked = false;
        name = myname;
        artist = myartist;
        int colonindex = -1;
        for(int i = 0; i < mylength.length(); i++){
            if(mylength.substring(i, i+1).equals(":")){
                colonindex = i;
            }
        }
        String minstring = mylength.substring(0, colonindex);
        int min = Integer.parseInt(minstring);
        String secstring = mylength.substring(colonindex + 1);
        int sec = Integer.parseInt(secstring);
        length = min * 60 + sec;
    }

     /**
      * Methods-- what will you want each Song to do?
      * Consider all the getter methods (getName, getArtist, etc.)
      * You should probably have a toString method to be able to get the information for the full
      * song easily as well!
      * What kind of mutator (setter) methods will you need?
      */
      public void like(){
        liked = true;
      }
      public void unlike(){
        liked = false;
      }
      public String getname(){
        return name;
      }
      public String getartist(){
        return artist;
      }
      public int getlength(){
        return length;
      }
      public boolean getliked(){
        return liked;
      }
}
