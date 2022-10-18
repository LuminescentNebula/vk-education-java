public class LibraryFactory {
    public static Library createLibrary(){
        Library library = new Library();
        Author PV = new Author("Peter Vasiliev",
                "Russian writer distinguished by interesting books",
                2);
        Author VP = new Author("Vasily Petrov",
                "A Russian writer, distinguished by the fact that he has a namesake who also writes books",
                3);
        Author PP = new Author("Peter Petrov",
                "Russian writer, distinguished by the fact that he has a namesake",
                4);
        Author VV = new Author("Vasily Vasilyev",
                "A Russian writer distinguished by absolutely nothing",
                5);
        library.add(new Book("Star Role",PV, 10,2001));
        library.add(new Book("Fragments of the Past",VP, 20,2002));
        library.add(new Book("Secret City",PV, 30,2003));
        library.add(new Book("What the Gods Dream of",PP, 40,2004));
        library.add(new Book("Be me",PP, 50,2005));
        library.add(new Book("Dream Room",VP, 60,2006));
        library.add(new Book("Ray of Hope",PV, 70,2007));
        library.add(new Book("Liturgy of Evil",VV, 80,2008));
        library.add(new Book("The cry of the soul",VV, 90,2009));
        library.add(new Book("Long way",VP, 100,2010));
        library.add(new Book("Love with a Taste of Death",VV, 110,2011));
        library.add(new Book("Fantasy Master",PV, 120,2012));

        return library;
    }
}
