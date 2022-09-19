
import java.util.Scanner;

public class Program {
    
    public static int sum(int[] array, int fromWhere, int toWhere, int smallest, int largest) {        
        int a = fromWhere < 0 ? 0 : fromWhere > array.length ? array.length : fromWhere;                
        int b = toWhere > array.length ? array.length : toWhere < 0 ? 0 : toWhere;
        int sum = 0;
        
        for(int i = a; i < b; i++) {
//            sum += array[i] >= smallest ? array[i] <= largest ? array[i] : 0 : 0;  
            sum += (array[i] >= smallest && array[i] <= largest) ? array[i] :0;
        }
        return sum;
    }
    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // test your method here
        int[] numbers = {3, -1, 8, 4};

        System.out.println(sum(numbers, 0, 0, 0, 0));
        System.out.println(sum(numbers, 0, 0, 0, 10));
        System.out.println(sum(numbers, 0, 1, 0, 10));
        System.out.println(sum(numbers, 0, 1, -10, 10));
        System.out.println(sum(numbers, -1, 999, -10, 10));

    }

}
