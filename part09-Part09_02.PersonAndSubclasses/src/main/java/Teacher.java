
/**
 *
 * @author dsa21
 */
public class Teacher extends Person {
    private int salary;
    
    public Teacher(String a, String b, int c) {
        super(a,b);
        this.salary = c;
    }
    @Override
    public String toString() {
        return super.toString() + "\n  salary " + this.salary + " euro/month";
    }
}
