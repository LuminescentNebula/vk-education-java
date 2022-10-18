public class Application {
    public static void main(String[] args) {
        Library library = LibraryFactory.createLibrary();
        System.out.println(library.outputByAuthor("Peter Vasiliev"));
    }

}
