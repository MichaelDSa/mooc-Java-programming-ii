
/**
 *
 * @author dsa21
 */
public class A {
    private int inheritance;
    
     public A (int i) { this.inheritance = i; }
    
     protected int inheritanceGiven() {
         return this.inheritance;
         
     }
     
     public String toString() {
         return String.valueOf(inheritanceGiven());
     }
    
}
