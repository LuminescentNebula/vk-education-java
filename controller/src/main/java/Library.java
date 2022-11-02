import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> shelf = new ArrayList<>();
    private final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    void add(Book book){
        shelf.add(book);
    }

    String outputByAuthor(String name){
        List<Book> toOut = new ArrayList<>();
        for (Book i:shelf){
            if (i.getAuthor().name.equals(name)){
                toOut.add(i);
            }
        }
        return gson.toJson(toOut);
    }
}
