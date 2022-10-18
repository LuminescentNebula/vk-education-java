import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Library library = LibraryFactory.createLibrary();

        Scanner scanner = new Scanner(System.in);
        String author;
        System.out.print("Введите имя автора: ");
        author=scanner.nextLine();//Peter Vasiliev
        System.out.println(library.outputByAuthor(author));
    }

}
