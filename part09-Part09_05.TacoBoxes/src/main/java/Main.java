
public class Main {

    public static void main(String[] args) {
        // Test your code here!
        TacoBox tt = new TripleTacoBox();
        TacoBox ct = new CustomTacoBox(8);
        
        System.out.println("Tacos remaining tt: " + tt.tacosRemaining() + "\nTacos remaining ct: " + ct.tacosRemaining());
        
        System.out.println("\neating...");
        tt.eat();
        ct.eat();
        System.out.println("Tacos remaining tt: " + tt.tacosRemaining() + "\nTacos remaining ct: " + ct.tacosRemaining());
        
        System.out.println("\neating...");
        tt.eat();
        tt.eat();
        ct.eat();
        System.out.println("Tacos remaining tt: " + tt.tacosRemaining() + "\nTacos remaining ct: " + ct.tacosRemaining());
        
        System.out.println("\ntt can steal?");
        
        tt = ct;
        tt.eat();
        ct.eat();
        System.out.println("Tacos remaining tt: " + tt.tacosRemaining() + "\nTacos remaining ct: " + ct.tacosRemaining());
        
        System.out.println("\ntt eats...");
        tt.eat();
        System.out.println("Tacos remaining tt: " + tt.tacosRemaining() + "\nTacos remaining ct: " + ct.tacosRemaining());
        
        System.out.println("\nct eats...");
        ct.eat();
        System.out.println("Tacos remaining tt: " + tt.tacosRemaining() + "\nTacos remaining ct: " + ct.tacosRemaining());
        
        
    }
}
