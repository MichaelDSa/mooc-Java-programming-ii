
public class Main {

    public static void main(String[] args) {
        // test your classes here
            Box box = new Box(10);

            box.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2)) ;
            box.add(new Book("Robert Martin", "Clean Code", 1));
            box.add(new Book("Kent Beck", "Test Driven Development", 0.7));

            box.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
            box.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
            box.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));

            System.out.println("Box: " + box);
            
            //  Part 4 adding box to another box
            Box bigBox = new Box(20);
            Box otherBox = new Box(10);
            
            otherBox.add(new Book("The young Beginner's Guitar Method", "FJH", 0.2));
            otherBox.add(new Book("Douze Etudes", "H. Villa-Lobos", 0.5));
            otherBox.add(new Book("Life is only Real Then, When I Am", "G.I.Gurdieff", 3));
            otherBox.add(new Book("Fifty Shades of Smut", "Smut Smutterson", 4));
            otherBox.add(new CD("Petrified Chaircaughsky", "Dance of the Magic Mushroom Humchback", 2001));
            otherBox.add(new CD("Charles Beethoven(A.I)", "Ludwig's 11th Symphony", 2173));
            
            bigBox.add(otherBox);
            bigBox.add(box);
            System.out.println("Other box: " + otherBox);
            System.out.println("Big box: " + bigBox);
    }

}
