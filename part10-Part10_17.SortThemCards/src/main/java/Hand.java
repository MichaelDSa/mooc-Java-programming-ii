import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/**
 *
 * @author dsa21
 */
public class Hand implements Comparable<Hand> {
    private ArrayList<Card> hand;    
    
    public Hand() { this.hand = new ArrayList<>(); }
    
    public void add(Card card) { this.hand.add(card); }
    public void print() { this.hand.forEach(a -> System.out.println(a)); }
    
    public void sort() {
        Collections.sort(this.hand);
    }
    
    public void sortBySuit() {
        Collections.sort(hand, new BySuitInValueOrder());
    }
    
    private int handValue() {
        int sumOfHand = 0;
        for(Card i : this.hand) sumOfHand += i.getValue();
        return sumOfHand;
    }
    
    @Override
    public int compareTo(Hand compare) {
        return this.handValue() - compare.handValue();          
    }    
}
