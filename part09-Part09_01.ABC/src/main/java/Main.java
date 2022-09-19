
public class Main {

    public static void main(String[] args) {
        // write your test code here
        A a = new A(1000000);
        B b = new B(a.inheritanceGiven(),500000);
        
        System.out.println("A: " + a);
        System.out.println("B: " + b);
        
        System.out.println("B's inheritance given: " + b.inheritanceGiven());
        System.out.println("A's inheritance given: " + a.inheritanceGiven());
        System.out.println(b);
    }
}
