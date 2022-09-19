package application;

import java.sql.SQLException;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private TodoDao database;

    public UserInterface(Scanner scanner, TodoDao database) {
        this.scanner = scanner;
        this.database = database;
    }

    public void start() throws SQLException {
        while (true) {
            System.out.println("");
            System.out.println("Enter command:");
            System.out.println("1) list");
            System.out.println("2) add");
            System.out.println("3) mark as done");
            System.out.println("4) remove");
            System.out.println("x) quit");

            System.out.print("> ");
            String command = this.scanner.nextLine();
            if (command.equals("x")) {
                break;
            }            
            switch(command) {
                
                case "1"://LIST
                    System.out.println("Listing the database contents");
                    for(Todo i : this.database.list())  {
                        System.out.println(i);
                    }
                    
                    break;
                    
                case "2"://ADD

                    System.out.println("Adding a new todo");
                    
                    System.out.print("Enter name ");
                    String name = scanner.nextLine();
                    System.out.println("description");
                    String description = scanner.nextLine();                    
                    this.database.add(new Todo(name, description, false));
                    
                    break;
                    
                case "3"://MARK AS DONE
                    System.out.println("Which todo should be marked as done (give the id)?");
                    String code = scanner.nextLine();
                    if(code.matches("[0-9]{3}") || code.matches("[0-9]{2}") || code.matches("[0-9]")){
                        this.database.markAsDone(Integer.valueOf(code));
                    }
                    
                    break;
                    
                case "4"://REMOVE
                    System.out.println("Which todo should be marked as done (give the id)?");
                    code = scanner.nextLine();
                    if(code.matches("[0-9]{3}") || code.matches("[0-9]{2}") || code.matches("[0-9]")){
                        this.database.remove(Integer.valueOf(code));
                    }
                    
                    break;
                
            }

            // implement the functionality here
        }

        System.out.println("Thank you!");
    }

}
