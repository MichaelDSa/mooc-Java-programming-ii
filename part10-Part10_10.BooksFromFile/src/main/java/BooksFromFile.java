
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {
    public static List<Book> readBooks(String file) {
        List<Book> lst = new ArrayList<>();
        try {
            return Files.lines(Paths.get(file))
                        .map(a -> a.split(","))
                        .filter(b -> b.length >= 4)
                        .map((b -> new Book(b[0],Integer.valueOf(b[1]), Integer.valueOf(b[2]), b[3])))
//                        .forEach(i -> lst.add(i))
                        .collect(Collectors.toList());
        }catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return lst;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

    }

}
