
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
        
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        // Implement the random number generation here
        // the method containsNumber is probably useful
        Random r = new Random();
        for(int i = 0; i < 7; i++) {
            int rand = r.nextInt(40)+1;
            if(!containsNumber(rand)) {
                this.numbers.add(rand);
            }else {
                i--;
            }
        }
    }

    public boolean containsNumber(int number) {
        // Check here whether the number is among the drawn numbers
        for(Integer i : this.numbers) {
            if(i == number) {
                return true;
            }
        }
        return false;
    }
}

