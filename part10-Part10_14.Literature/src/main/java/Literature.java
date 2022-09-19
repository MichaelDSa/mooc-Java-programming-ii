/**
 *
 * @author dsa21
 */
public class Literature {
    private String title;
    private int rAge;
    
    public Literature(String b, int a) {
        this.title = b;
        this.rAge = a;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public int getRecommendedAge() {
        return this.rAge;
    }
    
    @Override
    public String toString() {
        return this.title + " (recommended for " + this.rAge + " year-olds or older)";
    }
    
}
