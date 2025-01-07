    public class Song {

    //----------------
    //4 private fields created below
    //Note: private will hide the fields from other classes//
    //----------------

    private int songId = 9999; //songId field - default value of 9999 given
    private String songName = ""; //songName field - default of "" given
    private String artistName = ""; //artistName field - default of "" given
    private int length = 1; //length field - Default of 1 second value given

    //----------------
    //Constructor created below
    //----------------
    public Song(int songId, String songName, String artistName, int length) {
        setSongId(songId);
        if (songName.length() <= 20) //songName - Setter not used as String is an outlier
            this.songName = songName;
        else this.songName = songName.substring(0,20); //validation for songName being 20 characters applied in constructor
        if (artistName.length() <= 25) //artistName - Setter not used as String is an outlier
            this.artistName = artistName;
        else this.artistName = artistName.substring(0,25); //validation for songName being 25 characters applied in constructor
        setLength(length);
    }

    //----------------
    //Getter methods created below
    //Note: Each getter method will be public and has a return type
    //----------------

    public int getSongId() //getter for songId
    {
        return songId; //return statement
    }

    public String getSongName() //getter for songName
    {
        return songName; //return statement
    }

    public String getArtistName() //getter for artistName
    {
        return artistName; //return statement
    }

    public int getLength() //getter for length
    {
        return length; //return statement
    }

    //----------------
    //Setter methods created below
    //Note: Setter will be public and take in parameters
    //----------------

    public void setSongId(int songId) //Setter for SongId
    {
        if ((songId >= 1000) && (songId <= 9999)) { //validation so number is between 1000 & 9999
            this.songId = songId; //assignment statement
        }
    }

    public void setSongName(String songName) //Setter for songName
    {
        if (songName.length() <= 20) { //validation applied of 20 characters
            this.songName = songName; //assignment statement
        }
    }

    public void setArtistName(String artistName) //Setter for artistName
    {
        if (artistName.length() <= 25) { //validation applied of 25 characters
            this.artistName = artistName; //assignment statement
        }
    }

    public void setLength(int length) //Setter for length
    {
        if ((length >= 1) && (length <= 600)) { //validation applied for between 1 and 600 seconds
            this.length = length; //assignment statement
        }
    }

    //----------------
    //toString() coding below
    //----------------

    public String toString()
    {
        return "Details of your favourite song are "
                + "Song id: " + songId
                + ", Song Name: " + songName
                + ", Artists Name: " + artistName
                + ", Length of Song (seconds): " + length;
    }

} //Encapsulation completed - fields/constructors/methods wrapped in single unit
