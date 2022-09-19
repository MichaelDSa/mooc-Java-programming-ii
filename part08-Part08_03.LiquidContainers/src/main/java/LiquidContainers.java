
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0, second = 0, intIn = 0;
        
        
        System.out.println("First: " + first + "/100" + 
                           "\nSecond: " + second + "/100");
        System.out.print("> ");
        String strIn = scan.next();
        
        if(!strIn.equals("quit")) {
            intIn = Integer.valueOf(scan.next());
        }
        while (!strIn.equals("quit")) {
            
            switch(strIn) {
                case "add":
                    first = intIn < 0 ? first : first + intIn > 100 ? 100 : first + intIn;
                            
                    break;
                    
                case "move":       
                    second = intIn < 0 ? second : intIn > first ? first
                                                : intIn + second > 100 ? 100 
                                                : second + intIn;
                            
                    first = intIn < 0 ? first : intIn > first ? 0 
                                              : first - intIn;                    
                    
                    break;
                    
                case "remove":
                    second = intIn < 0 ? second : second - intIn < 0 ? 0 : second - intIn;
                    
            }
            System.out.println("");
            System.out.println("First: " + first + "/100" + 
                               "\nSecond: " + second + "/100");
            System.out.print("> ");
            strIn = scan.next();

            if(!strIn.equals("quit")) {
                intIn = Integer.valueOf(scan.next());
            }
        }
    }
}
