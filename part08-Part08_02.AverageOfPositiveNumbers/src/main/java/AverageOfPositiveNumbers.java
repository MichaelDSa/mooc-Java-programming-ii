
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Average psitv = new Average();
        
        int input = Integer.valueOf(scanner.nextLine());
        while(input != 0) {
            psitv.positives(input);
            input = Integer.valueOf(scanner.nextLine());
        }
        System.out.println(psitv);
    }
}
