
/**
 *
 * @author dsa21
 */
public class Average {
    private double sum, avg, count;
    
    public Average() {
        this.sum = 0;
        this.avg = 0;
        this.count = 0;
    }
    
    public void positives(double i) {
        if(i > 0) {
            this.count++;
            this.sum += i;
        }
        this.avg = this.sum / this.count;
    }
    
    public String toString() {
        if(this.avg <= 0) {
            return "Cannot calculate ths average";
        }
        return String.valueOf(this.avg);
    }
}
