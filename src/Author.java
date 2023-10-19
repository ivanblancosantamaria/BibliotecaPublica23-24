import javax.xml.crypto.Data;
import java.util.Date;

public class Author {

    private String name;
    private String surname1;
    private String surname2;
    private int numBook;
    private Date dateAge;
    private String bormCountry;





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname1() {
        return surname1;
    }

    public void setSurname1(String surname1) {
        this.surname1 = surname1;
    }

    public String getSurname2() {
        return surname2;
    }

    public void setSurname2(String surname2) {
        this.surname2 = surname2;
    }

    public int getNumBook() {
        return numBook;
    }

    public void setNumBook(int numBook) {
        this.numBook = numBook;
    }

    public Date getDateAge() {
        return dateAge;
    }

    public void setDateAge(Date dateAge) {
        this.dateAge = dateAge;
    }

    public String getBormCountry() {
        return bormCountry;
    }

    public void setBormCountry(String bormCountry) {
        this.bormCountry = bormCountry;
    }
}
