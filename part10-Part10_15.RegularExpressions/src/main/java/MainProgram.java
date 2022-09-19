import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        // you can create test code here. Call the methods that you'll implement
        // during the course of this exercise
        Scanner inpt = new Scanner(System.in);
        Checker regular = new Checker();
        String sInpt;
        
//        System.out.print("Enter a string: ");
//        sInpt = inpt.nextLine();
//        if(regular.isDayOfWeek(sInpt) == true) {
//            System.out.println("The form is correct.");
//        } else {
//            System.out.println("The form is incorrect.");
//        }
        
//        System.out.print("Enter a string: ");
//        sInpt = inpt.nextLine();
//        if(regular.allVowels(sInpt) == true) {
//            System.out.println("The form is correct.");
//        } else {
//            System.out.println("The form is incorrect.");
//        }
        while(true){
            System.out.print("Enter a string: ");
            sInpt = inpt.nextLine();
            if(!sInpt.toLowerCase().equals("stop")){
                if(regular.timeOfDay(sInpt) == true) {
                    System.out.println("The form is correct.");
                } else {
                    System.out.println("The form is incorrect.");
                }
            } else{
                break;
            }
        }
    }
}
