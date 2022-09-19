
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        
        System.out.println("Input numbers, type \"end\" to stop");
        while(!list.contains("end")) {
            list.add(inpt.nextLine());
        }
        list.remove("end");
       
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p) ");
        String norp = inpt.nextLine();
        
        switch(norp) {
            case "n": 
                double negNums = list.stream()
                        .mapToDouble(s -> Double.valueOf(s))
                        .filter(num -> num < 0)
                        .average()
                        .getAsDouble();
                System.out.println("Average of the negative numbers: " + negNums);
                break;
            case "p":
                double posNums = list.stream()
                        .mapToDouble(s -> Double.valueOf(s))
                        .filter(num -> num >= 0)
                        .average()
                        .getAsDouble();
                System.out.println("Average of the positive numbers: " + posNums);
        }
    }
}
