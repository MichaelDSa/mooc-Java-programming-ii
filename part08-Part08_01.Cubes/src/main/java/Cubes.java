
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CubeIt cube = new CubeIt();
        
        String input = scanner.nextLine();
        while(!input.equals("end")) {
            System.out.println(cube.makeCube(input));
            input = scanner.nextLine();
        }
        
    }
}
