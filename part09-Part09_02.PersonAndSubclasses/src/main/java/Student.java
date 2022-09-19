
/**
 *
 * @author dsa21
 */
public class Student extends Person {
    private int study;
    public Student(String a, String b) {
        super(a,b);
    }
    
    public void study() {
        this.study++;
    }
    public int credits() {
        return study;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n  Study credits " + this.credits();
    }
}
