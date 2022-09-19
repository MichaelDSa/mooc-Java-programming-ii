import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author dsa21
 */
public class Employees {
    List<Person> empList;    
    
    public Employees() {
        this.empList = new ArrayList<>();
    }
    public void add(Person personToAdd) {
        this.empList.add(personToAdd);
    }
    public void add(List<Person> peopleToAdd) {
        Iterator<Person> i = peopleToAdd.iterator();
        while(i.hasNext()) this.empList.add(i.next());
    }
    public void print() {
        Iterator<Person> i = this.empList.iterator();
        while(i.hasNext()) System.out.println(i.next());
    }
    public void print(Education education) {
        Iterator<Person> i = this.empList.iterator();
        Person index;
        while(i.hasNext()) {
            index = i.next();
            if(index.getEducation() == education) {                
                System.out.println(index);
            }
        }
    }
    public void fire(Education education) {
        Iterator<Person> i = this.empList.iterator();
        while(i.hasNext()) {
            if(i.next().getEducation() == education) {
                i.remove();
            }
        }
        
    
    }
}
