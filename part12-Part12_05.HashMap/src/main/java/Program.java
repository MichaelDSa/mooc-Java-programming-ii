
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // You can test the class here
        HashMap<String, Integer> m = new HashMap<>();
        
        m.add("one",1);
        m.add("two",2);
        m.add("three",3);
        m.add("four",4);
        m.add("five",5);
        m.add("six",6);
        m.add("seven",7);
        m.add("eight",8);
        m.add("nine",9);
        m.add("ten",10);
        m.add("eleven",11);
        m.add("twelve",12);
        m.add("thirteen",13);
        m.add("fourteen",14);
        m.add("fifteen",15);
        m.add("sixteen",16);
        m.add("seventeen",17);
        m.add("eighteen",18);
        m.add("nineteen",19);
        m.add("twenty",20);
        m.add("twentyone",21);
        m.add("twentytwo",22);
        m.add("twentythree",23);
        m.add("twentyfour",24);
        m.add("twentyfive",25);
        m.add("twentysix",26);
        m.add("twentyseven",27);
        m.add("twentyeight",28);
        m.add("twentynine",29);
        m.add("thirty",30);
        

        System.out.println(m.get("thirty") + " " + m.get("twentynine"));
        m.remove("twentyseven");
        System.out.println(m.get("twentyseven"));
        m.setValue("nine", 17);
        System.out.println(m.get("nine"));
        
    }

}
