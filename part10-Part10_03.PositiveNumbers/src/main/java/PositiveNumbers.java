
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {
    
    public static List<Integer> positive(List<Integer> number) {
        List<Integer> posList = number.stream()
                .filter(s -> s >= 0)
                .map(s -> s)
                .collect(Collectors.toCollection(ArrayList::new));
        return posList;
        //the following is the suggested solution.
        //return number.stream().filter(s -> s >= 0).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
        List<Integer> intList = new ArrayList<>();
        PositiveNumbers posList = new PositiveNumbers();
        
        intList.add(5);
        intList.add(-1);
        intList.add(8);
        intList.add(-98);
        intList.add(23);
        intList.add(34);
        intList.add(59);
        intList.add(-5);
        System.out.println(intList);
        System.out.println(posList.positive(intList));
        
        

    }

}
