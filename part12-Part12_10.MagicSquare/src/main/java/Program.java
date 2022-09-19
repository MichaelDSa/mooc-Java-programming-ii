
public class Program {

    public static void main(String[] args) {
        // Test the MagicSquare class here
        
        MagicSquareFactory msFactory = new MagicSquareFactory();
        System.out.println(msFactory.createMagicSquare(13));
        System.out.println(msFactory.createMagicSquare(13).isMagicSquare());
        System.out.println(msFactory.createMagicSquare(13).sumsOfRows());
        System.out.println(msFactory.createMagicSquare(13).sumsOfColumns());
        System.out.println(msFactory.createMagicSquare(13).sumsOfDiagonals());
    }
}
