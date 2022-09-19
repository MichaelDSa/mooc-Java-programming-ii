
import java.util.Scanner;
import java.util.Random;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // test your class here
        List<Integer> m = new List<>();
        
        m.add(1);
        m.add(2);
        m.add(3);
        m.add(4);
        m.add(5);

        System.out.println(m.size());
        System.out.println(m);
        
        m.remove(1);

        System.out.println();
        System.out.println(m.size());
        System.out.println(m);
        
        System.out.println();
        System.out.println(m.get(0));
        System.out.println(m.get(3));
        
        System.out.println();
        System.out.println(m.getIndexOf(2) );
        System.out.println(m.getIndexOf(3));
        
        System.out.println("");
        System.out.println(m.contains(5));
        System.out.println(m.get(2));
        
        try {                      
            m.remove(0);
            m.remove(0);
            m.remove(0);
            m.remove(0);
            m.remove(0);
            System.out.println(m.get(5));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException" + e.toString());
        }
        
        Random rand = new Random();
        
        for(int i = 0; i < 40; i++) {
            int r = rand.nextInt(200)-100;
            m.add(r);
        }
        System.out.println(m);

    }

}
