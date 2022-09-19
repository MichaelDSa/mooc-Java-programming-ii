import java.util.ArrayList;
/**
 *
 * @author dsa21
 */
public class TodoList {
    private ArrayList<String> list;    
    
    public TodoList() {
        this.list = new ArrayList<>();        
    }
    
    public void add(String task) {        
        this.list.add(task);    
        
    }
    
    public void print() {
        int count = 1;
        
        for(String i : this.list) {            
            System.out.println(count + ": " + i);
            count++;
        }
        
    }
    public void remove(int number) {
        if(number > 0) {
            this.list.remove(number-1);
            
        }
    }
    
}
