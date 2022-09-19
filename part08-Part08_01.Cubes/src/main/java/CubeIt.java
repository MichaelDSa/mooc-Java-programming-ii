import java.util.Scanner;
/**
 *
 * @author dsa21
 */
public class CubeIt {
    int cubed;
    
    public CubeIt() { this.cubed = 0; }
    
    public int makeCube(String uncubed) {
        int i = Integer.valueOf(uncubed);
        return this.cubed + (i*i*i);
    }
}
