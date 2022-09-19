import java.util.Scanner;
/**
 *
 * @author dsa21
 */
public class LiquidContainers2UI {
    private Container first;
    private Container second;
    
    public LiquidContainers2UI() {
        this.first = new Container();
        this.second = new Container();        
    }
    
    public void start() {
        Scanner inpt = new Scanner (System.in);
        String gets;
        int geti = 0;
        
        System.out.println("First: " +  first + "\n" + "Second: " + second);
        System.out.print(">");
        gets = inpt.next();
        gets = gets.equals("Quit") ? "quit" : gets;
        if(!gets.equals("quit")) {
            geti = Integer.valueOf(inpt.next());
        }
        while(!gets.equals("quit")) {
            switch(gets) {
                case "Add": case "add":
                    first.add(geti);
                    break;
                case "Move": case "move":
                    second.add(geti > first.contains() ? first.contains() : geti);
                    first.remove(geti);
                    break;
                case "Remove": case "remove":  
                    second.remove(geti);
            }
            System.out.println("");
            System.out.println("First: " +  first + "\n" + "Second: " + second);
            System.out.print(">");
            gets = inpt.next();
            gets = gets.equals("Quit") ? "quit" : gets;
            if(!gets.equals("quit")) {
                geti = Integer.valueOf(inpt.next());
            }
        }
    }
}
