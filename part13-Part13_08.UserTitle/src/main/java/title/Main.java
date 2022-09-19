package title;

import javafx.application.Application;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        System.out.print("Enter title: ");        
        Application.launch(UserTitle.class, "--title=" + inpt.nextLine());

    }

}
