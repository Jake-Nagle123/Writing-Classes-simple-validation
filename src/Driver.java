import java.util.Scanner;

    public class Driver {
    public Scanner input = new Scanner(System.in);
    Song mySong;  //mySong object
    public static void main(String[] args) {
        new Driver();
    }

    public Driver() {
        addSong();
        printSong();
    }

    private void printSong() {
        System.out.println(mySong); // same as System.out.println(mySong.toString());
    }

    private void addSong() {
        System.out.println(Utilities.printStars(40));
        System.out.println("Enter your favourite song details:");

        System.out.println("Song id (1000 to 9999): ");
        int songId = input.nextInt();
        input.nextLine();

        System.out.println("Enter song name: ");
        String songName = input.nextLine();

        System.out.println("Enter artists name: ");
        String artistName = input.nextLine();

        System.out.println("Enter song length (seconds): ");
        int songSeconds = input.nextInt();

        mySong = new Song(songId, songName, artistName, songSeconds); //mySong object calling song constructor
    }
}