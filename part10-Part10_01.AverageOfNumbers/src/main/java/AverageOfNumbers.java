
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        
        while(!list.contains("end")) {
            list.add(inpt.nextLine());
        }
        list.remove("end");
        
        double avg = list.stream().mapToInt(s -> Integer.valueOf(s)).average().getAsDouble();
        
        System.out.println("average of the Numbers: " + avg);
        
    }
}
