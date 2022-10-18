import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> shelf = new ArrayList<>();

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
        return new Gson().toJson(toOut);
    }
}
