package mooc.logic;

import mooc.ui.TextInterface;
import mooc.ui.UserInterface;

/**
 *
 * @author dsa21
 */
public class ApplicationLogic {
    private UserInterface ui;
    public ApplicationLogic(UserInterface ui) {
        this.ui = new TextInterface();
    }
    
    public void execute(int times) {
        int count = times;
        for(int i = 0; i < count; i++) {
            System.out.println("Application logic is working");
            ui.update();
        }
    }
    
    
    
}
