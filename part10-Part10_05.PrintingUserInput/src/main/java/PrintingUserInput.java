
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> answers = new ArrayList<>();
        
        while(!answers.contains("")) answers.add(scanner.nextLine());
        answers.stream().forEach(i -> System.out.println(i));
        
    }
}
