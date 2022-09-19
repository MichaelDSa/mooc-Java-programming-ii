
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        // implement the creation of a magic square with the Siamese method algorithm here
        int row = square.getWidth() / 2;
        int col = 0;
        int totalSquares = square.getWidth() * square.getHeight();
        
        for(int value = 1; value <= totalSquares; value++) {
            
            square.placeValue(row,col,value*3);
            
            if(value % size == 0) {
                col++;
                if(col >= size) {
                    col = 0;
                }
            }else {
                col--;
                row++;       
            }
            
            if(col < 0) {
               col = size-1;
            }
            
            if(row >= size) {
                row = 0;
            }
            
           
        }
        return square;
    }

}
