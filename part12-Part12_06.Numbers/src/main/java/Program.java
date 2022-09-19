
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        Random rnd = new Random();
        
        System.out.println("How many random numbers should be printed? ");
        
        int uinpt = Integer.valueOf(inpt.nextLine());        
        uinpt = uinpt < 0 ? uinpt * 1 : uinpt;        
        
        
        for(int i = 0; i < uinpt; i++) {
            
            System.out.println(rnd.nextInt(11));
        }
        
    }

}
