import java.util.Scanner;
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations required here!
        HashMap<String, String> nicknames = new HashMap<>();
        Scanner inpt = new Scanner(System.in);
        
        System.out.print("Search name: >");
        String name = inpt.nextLine();
        
        nicknames.put("matthew", "matt");
        nicknames.put("michael", "mix");
        nicknames.put("arthur", "artie");
        
        nicknames.forEach((key, value) -> {
           if(value.equals(name)) System.out.println(key); 
        });
    }

}
