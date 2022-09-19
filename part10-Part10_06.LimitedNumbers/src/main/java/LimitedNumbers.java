
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        
        while(!numbers.removeIf(s -> s < 0)) numbers.add(Integer.valueOf(scanner.nextLine()));        
        numbers.stream().filter(a -> a > 0 && a < 6).forEach(b -> System.out.println(b));
    }
}
