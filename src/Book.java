import java.util.Date;

public class Book {

    private String isbn;
    private String title;
    private String fullNameAuthor;
    private String libraryGenre;
    private Date publicationDate;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFullNameAuthor() {
        return fullNameAuthor;
    }

    public void setFullNameAuthor(String fullNameAuthor) {
        this.fullNameAuthor = fullNameAuthor;
    }

    public String getLibraryGenre() {
        return libraryGenre;
    }

    public void setLibraryGenre(String libraryGenre) {
        this.libraryGenre = libraryGenre;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", fullNameAuthor='" + fullNameAuthor + '\'' +
                ", libraryGenre='" + libraryGenre + '\'' +
                ", publicationDate=" + publicationDate +
                '}';
    }
}
