import java.time.LocalDate;

public class Cd extends Item{
    private String artist;
    private int tracks;


    public Cd(String id, String title, LocalDate PublicationDate,String artist,int tracks){
        super(id,title,PublicationDate,12);
        this.artist=artist;
        this.tracks=tracks;
    }
    public String getArtist(){return artist;}
    public int getTracks(){return tracks;}

}