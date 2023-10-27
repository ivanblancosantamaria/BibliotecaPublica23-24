public class User {
    private String dni;
    private String name;
    private String surname;
    private String surname2;
    private String phoneNumber;

    @Override
    public String toString() {
        return "User{" +
                "dni='" + dni + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", surname2='" + surname2 + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSurname2(String surname2) {
        this.surname2 = surname2;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDni() {
        return dni;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getSurname2() {
        return surname2;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
