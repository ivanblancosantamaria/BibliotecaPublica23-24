import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            Author author1 = new Author();
            author1.getBormCountry();
            author1.getName();
            author1.getDateAge();
            author1.getNumBook();
            author1.getSurname1();
            author1.getSurname2();
            author1.setName("Gabriel");
            author1.setBormCountry("");
            author1.setDateAge(23/432/124);
            author1.setNumBook(23);
            author1.setSurname1("García ");
            author1.setSurname2("Márquez");


            Author author2 = new Author();
            author2.getBormCountry();
            author2.getName();
            author2.getDateAge();
            author2.getNumBook();
            author2.getSurname1();
            author2.getSurname2();
            author1.setName("George ");
            author1.setBormCountry("");
            // author1.setDateAge();
            author1.setNumBook(23);
            author1.setSurname1("Orwell");
            author1.setSurname2("");


            Author author3 = new Author();
            author3.getBormCountry();
            author3.getName();
            author3.getDateAge();
            author3.getNumBook();
            author3.getSurname1();
            author3.getSurname2();
            author1.setName("Miguel ");
            author1.setBormCountry("");
            // author1.setDateAge();
            author1.setNumBook(23);
            author1.setSurname1("Cervantes");
            author1.setSurname2("");

            Author author4 = new Author();
            author4.getBormCountry();
            author4.getName();
            author4.getDateAge();
            author4.getNumBook();
            author4.getSurname1();
            author4.getSurname2();
            author4.setName("Harper ");
            author4.setBormCountry("");
            // author4.setDateAge();
            author4.setNumBook(23);
            author4.setSurname1("Lee");
            author4.setSurname2(" ");

            Loan loan1 = new Loan();
            loan1.getLoanDate();
            loan1.getBook();
            loan1.getReturnDate();
            loan1.getUserDate();
            // loan1.setLoanDate("");
            loan1.setBook("");
            //loan1.setReturnDate("");
            loan1.setUserDate("");

            Loan loan2 = new Loan();
            loan2.getLoanDate();
            loan2.getBook();
            loan2.getReturnDate();
            loan2.getUserDate();
            // loan2.setLoanDate("");
            loan2.setBook("");
            //loan2.setReturnDate("");
            loan2.setUserDate("");

            Loan loan3 = new Loan();
            loan3.getLoanDate();
            loan3.getBook();
            loan3.getReturnDate();
            loan3.getUserDate();
            // loan3.setLoanDate("");
            loan3.setBook("");
            //loan3.setReturnDate("");
            loan3.setUserDate("");

            Loan loan4 = new Loan();
            loan4.getLoanDate();
            loan4.getBook();
            loan4.getReturnDate();
            loan4.getUserDate();
            // loan4.setLoanDate("");
            loan4.setBook("");
            //loan4.setReturnDate("");
            loan4.setUserDate("");

            Loan loan5 = new Loan();
            loan5.getLoanDate();
            loan5.getBook();
            loan5.getReturnDate();
            loan5.getUserDate();
            // loan5.setLoanDate("");
            loan5.setBook("");
            //loan5.setReturnDate("");
            loan5.setUserDate("");


            String Author;
            String Gender;
            String isbn;

            Book book1 = new Book();
            book1.getFullNameAuthor();
            book1.getIsbn();
            book1.getLibraryGenre();
            book1.getTitle();
            book1.setIsbn(" 1341rq123");
            book1.setLibraryGenre("Novela social");
            book1.setTitle("Matar un ruiseñor");

            book1.setFullNameAuthor("");


            Book book2 = new Book();
            book2.getFullNameAuthor();
            book2.getIsbn();
            book2.getLibraryGenre();
            book2.getTitle();
            book2.setIsbn("342431g132");
            book2.setLibraryGenre("Realismo mágico");
            book2.setTitle("Cien años de soledad");
            book2.setFullNameAuthor(author2.toString());



            Book book3 = new Book();
            book3.getFullNameAuthor();
            book3.getIsbn();
            book3.getLibraryGenre();
            book3.getTitle();
            book3.setIsbn("2132t13");
            book3.setLibraryGenre("Distopía");
            book3.setTitle("1984");
            book3.setFullNameAuthor(author3.toString());


            Book book4 = new Book();
            book4.getFullNameAuthor();
            book4.getIsbn();
            book4.getLibraryGenre();
            book4.getTitle();
            book4.setIsbn("3424HJ3");
            book4.setLibraryGenre("Novela de caballerías");
            book4.setTitle("Don Quijote de la Mancha");
            book4.setFullNameAuthor(author4.toString());



            Book book5 = new Book();
            book5.getFullNameAuthor();
            book5.getIsbn();
            book5.getLibraryGenre();
            book5.getTitle();

            Book book6 = new Book();
            book6.getFullNameAuthor();
            book6.getIsbn();
            book6.getLibraryGenre();
            book6.getTitle();


            LibraryGenre libraryGenre1 = new LibraryGenre();
            libraryGenre1.getDescription();
            libraryGenre1.getName();
            libraryGenre1.setName(" Novela social ");
            libraryGenre1.setDescription("El realismo mágico es un estilo literario que combina elementos " +
                    "realistas con elementos fantásticos de una manera que los personajes y la trama aceptan lo " +
                    "extraordinario como algo normal. Este enfoque se originó en la literatura latinoamericana, " +
                    "especialmente en las obras de escritores como Gabriel García Márquez.");

            LibraryGenre libraryGenre3 = new LibraryGenre();
            libraryGenre3.getDescription();
            libraryGenre3.getName();
            libraryGenre3.setName("Realismo mágico");
            libraryGenre3.setDescription("Una distopía es un tipo de sociedad ficticia " +
                    "donde prevalecen condiciones extremadamente negativas y opresivas. " +
                    "En este mundo imaginario, las libertades individuales son restringidas, " +
                    "el gobierno ejerce un control total y " +
                    "las condiciones de vida son generalmente miserables.   ");

            LibraryGenre libraryGenre4 = new LibraryGenre();
            libraryGenre4.getDescription();
            libraryGenre4.getName();
            libraryGenre4.setName("Novela de caballerías");
            libraryGenre4.setDescription("Las novelas de caballerías son un género " +
                    "literario medieval que se centra " +
                    "en las aventuras de valientes caballeros. ");

            LibraryGenre libraryGenre5 = new LibraryGenre();
            libraryGenre5.getDescription();
            libraryGenre5.getName();
            libraryGenre5.setName("");
            libraryGenre5.setDescription("");

            LibraryGenre libraryGenre6 = new LibraryGenre();
            libraryGenre6.getDescription();
            libraryGenre6.getName();
            libraryGenre6.setName("");
            libraryGenre6.setDescription("");

            User user1 = new User();
            user1.getDni();
            user1.getName();
            user1.getSurname();
            user1.getSurname2();
            user1.getPhoneNumber();
            user1.setName("Ana ");
            user1.setSurname("Rodríguez");
            user1.setSurname2("Pérez");
            user1.setDni("31411G");
            user1.getPhoneNumber();

            User user2 = new User();
            user2.getDni();
            user2.getName();
            user2.getSurname();
            user2.getSurname2();
            user2.getPhoneNumber();

            while (true) {
                System.out.println("Menú de la Biblioteca");
                System.out.println("1. Ver libros");
                System.out.println("2. Ver tus datos");
                System.out.println("3. Ver reservas");
                System.out.println("4. Salir");
                System.out.print("Selecciona una opción: ");

                int opcion = scanner.nextInt();


                switch (opcion) {
                    case 1:
                        System.out.println(book1.toString());
                        System.out.println(book2.toString());
                        System.out.println(book3.toString());
                        System.out.println(book4.toString());
                        System.out.println("Desea agregar algun libro introduce 1");
                        opcion = scanner.nextInt();

                        switch (opcion) {

                            case 1:

                                System.out.println("Introduce el libro.");
                                book5.setIsbn(isbn = scanner.toString());
                                book5.setTitle( "");
                                book5.setFullNameAuthor("");



                                break;
                            case 2:
                                System.out.println("Saliendo del programa.");
                                System.exit(0);
                                break;
                            default:
                                System.out.println("Opción no válida. Por favor, elige una opción válida.");
                        }


                        break;
                    case 2:

                        System.out.println(user1.toString());


                        break;
                    case 3:

                        System.out.println(loan1.toString());

                        break;
                    case 4:
                        System.out.println("Saliendo del programa.");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, elige una opción válida.");
                }

        }


    }
}