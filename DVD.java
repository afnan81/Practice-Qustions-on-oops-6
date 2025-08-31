import java.time.LocalDate;

public class DVD extends Item {
    private String director;
    private int runningTime; // in minutes

    public DVD(String id, String title, LocalDate publicationDate, String director, int runningTime) {
        super(id, title, publicationDate, 8);
        this.director = director;
        this.runningTime = runningTime;
    }

    public String getDirector() {
        return director;
    }

    public int getRunningTime() {
        return runningTime;
    }
}
