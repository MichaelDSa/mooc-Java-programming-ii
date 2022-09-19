import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // test your code here

//        Card first = new Card(2, Suit.DIAMOND);
//        Card second = new Card(14, Suit.SPADE);
//        Card third = new Card(12, Suit.HEART);
//
//        System.out.println(first);
//        System.out.println(second);
//        System.out.println(third);
//        
//        System.out.println("///////////\n");
//        
        Hand hand = new Hand();
        
        hand.add(new Card(12, Suit.HEART));
        hand.add(new Card(14, Suit.DIAMOND));
        hand.add(new Card(2, Suit.SPADE));
        hand.add(new Card(2, Suit.CLUB));
        
        hand.sort();
        hand.print();
        System.out.println("////////////\n");
//        
//        Hand hand2 = new Hand();
//
//        hand2.add(new Card(11, Suit.DIAMOND));
//        hand2.add(new Card(11, Suit.SPADE));
//        hand2.add(new Card(11, Suit.HEART));
//
//        int comparison = hand.compareTo(hand2);
//
//        if (comparison < 0) {
//            System.out.println("better hand is");
//            hand2.print();
//        } else if (comparison > 0){
//            System.out.println("better hand is");
//            hand.print();
//        } else {
//            System.out.println("hands are equal");
//        }

//        Hand cards = new Hand();
//
//        cards.add(new Card(3, Suit.SPADE));
//        cards.add(new Card(4, Suit.SPADE));
//        cards.add(new Card(14, Suit.DIAMOND));
//        cards.add(new Card(14, Suit.CLUB));
//        cards.add(new Card(13, Suit.HEART));
//        cards.add(new Card(2, Suit.DIAMOND));
//        cards.add(new Card(14, Suit.SPADE));
//        cards.add(new Card(12, Suit.HEART));
//        cards.add(new Card(2, Suit.SPADE));
//        
//        cards.sortBySuit();
//        cards.print();
//        
        

//        SortBySuit sortBySuitSorter = new SortBySuit();
//        Collections.sort(cards, sortBySuitSorter);
//
//        cards.stream().forEach(c -> System.out.println(c));
//        
//        System.out.println("//////////////////\n");
//        
//        Collections.sort(cards, new BySuitInValueOrder());
//        
//        cards.stream().forEach(a -> System.out.println(a));
        
        

        
    }
}
