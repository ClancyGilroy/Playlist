import java.util.ArrayList;

/**
 * Sample of a tester file for the Playlist class. This file should demonstrate all the capability of your
 * playlist in the main method. You don't need to follow the testing specifications of this exactly
 * if you want to write your own separate tester instead.
 * Note that there's no need for a Scanner in this project-- all of the playlist can be 'hardcoded' into main.
 * @author: Asher Singla
 * @version: Jan 12 2023
 */

public class PlaylistTester {
    public static void main(String[] args) {
        System.out.println("Initializing a Playlist...\n");
        //Make your playlist here
        Playlist x = new Playlist();

        System.out.println("Adding songs to the Playlist...\n");
        /**
         * Add some songs here. Note that the format for adding a Song to a Playlist p
         * is something like...
         * p.addSong(new Song(..., ..., ...))
         */
        Song a = new Song("3:24", "You Lose!", "Magdalena Bay");
        x.add(a);
        Song b = new Song("2:28", "That's Life", "Still Woozy");
        x.add(b);
        Song c = new Song("13:19", "Beach Life-In-Death", "Car Seat Headrest");
        x.add(c);
        Song d = new Song("2:53", "Stop Selling Her Drugs", "Bakar");
        x.add(d);
        Song e = new Song("4:15", "Genesis", "Grimes");
        x.add(e);

        System.out.println("Printing the songs...\n");
        //Print out all the songs in the playlist to verify it's working correctly
        ArrayList<String> y = new ArrayList<>();
        y = x.examine();
        arraytoprint(y);

        System.out.println("\nLiking the songs in position 1, 3, and 4...\n");
        //Once your songs are 'liked', this should be reflected in the next printout
        x.likepos(1);
        x.likepos(3);
        x.likepos(4);

        System.out.println("Printing the songs...\n");
        y = x.examine();
        arraytoprint(y);

        System.out.println("\nRemoving the song in position 3...\n");
        x.remove(3);

        System.out.println("Printing the songs...\n");
        y = x.examine();
        arraytoprint(y);

        System.out.println("\nPrinting only the liked songs...\n");
        //Your Playlist should be able to do this without looping while in main!
        y = x.examineliked();
        arraytoprint(y);

        System.out.println("\nPrinting the total duration of all songs...\n");
        //Note that the format should look something like minutes:seconds
        System.out.println(x.duration());

        System.out.println("\nRemoving all unliked songs from the playlist...\n");
        //This should be doable with a single method call
        x.removeunliked();

        System.out.println("Printing all songs...\n");
        //This should now look like only the liked songs list from before
        y = x.examine();
        arraytoprint(y);
    }
    public static void arraytoprint(ArrayList<String> x){
        for(int i = 0; i < x.size(); i++){
            System.out.println(x.get(i));
        }
    }
}
