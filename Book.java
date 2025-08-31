import java.time.LocalDate;

public class Book extends Item{
    private String author;
    private int pages;

    public Book(String id,String title,LocalDate PublicationDate,String author,int pages){
        super(id,title,PublicationDate,15);
        this.author=author;
        this.pages=pages;
    }

    public String getAuthor(){return author;}
    public int getPages(){return pages;}
}