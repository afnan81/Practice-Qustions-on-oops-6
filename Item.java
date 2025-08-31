import java.time.LocalDate;

public abstract class Item {
    private String id;
    private String title;
    private LocalDate publicationDate;
    private int maxCheckoutDays;

    public Item(String id, String title, LocalDate publicationDate, int maxCheckoutDays) {
        this.id = id;
        this.title = title;
        this.publicationDate = publicationDate;
        this.maxCheckoutDays = maxCheckoutDays;
    }

    public String getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public LocalDate getPublicationDate() {
        return this.publicationDate;
    }

    public int getMaxCheckoutDays() {
        return this.maxCheckoutDays;
    }
}
