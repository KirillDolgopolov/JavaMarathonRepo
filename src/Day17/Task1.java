package Day17;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece[] array = new ChessPiece[8];


        for (int i = 0; i < 4; i++) {
            array[i] = ChessPiece.PAWN_WHITE;
        }
        for (int i = 4; i < array.length; i++) {
            array[i] = ChessPiece.ROOK_BLACK;
        }

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i].getIcon());
        }
    }
}
