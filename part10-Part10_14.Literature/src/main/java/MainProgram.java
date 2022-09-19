import java.lang.NumberFormatException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);      
        String title;
        int age;
        ArrayList<Literature> bookList = new ArrayList<>();
        
        
        do{
            System.out.print("Input the name of the book, empty stops: ");
            title = scanner.nextLine();
            if(title.isEmpty()) break;
            
            System.out.print("Input the age recommendation: ");
            age = Integer.valueOf(scanner.nextLine());
                        
            bookList.add(new Literature(title, age));
            
        } while(!title.equals(""));
        
        System.out.println(bookList.size() + " books in total.");
        
        Comparator<Literature> compy = Comparator.comparing(Literature::getRecommendedAge).thenComparing(Literature::getTitle);
        
        Collections.sort(bookList, compy);
        
        bookList.forEach(a -> System.out.println(a));
    }

}
