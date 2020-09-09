package Day17;

public class Task2 {
    public static void main(String[] args) {
        ChessPiece[][] theGame = new ChessPiece[8][8];
        for (int i = 0; i < theGame.length; i++) {
            for (int j = 0; j < theGame[i].length; j++) {
                theGame[i][j] = ChessPiece.EMPTY;
            }
        }
        theGame[0][0] = ChessPiece.ROOK_BLACK;
        theGame[0][5] = ChessPiece.ROOK_BLACK;
        theGame[0][6] = ChessPiece.KING_BLACK;
        theGame[1][1] = ChessPiece.ROOK_WHITE;
        theGame[1][4] = ChessPiece.PAWN_BLACK;
        theGame[1][5] = ChessPiece.PAWN_BLACK;
        theGame[1][7] = ChessPiece.PAWN_BLACK;
        theGame[2][0] = ChessPiece.PAWN_BLACK;
        theGame[2][2] = ChessPiece.KNIGHT_BLACK;
        theGame[2][6] = ChessPiece.PAWN_BLACK;
        theGame[3][0] = ChessPiece.QUEEN_BLACK;
        theGame[3][3] = ChessPiece.BISHOP_WHITE;
        theGame[4][3] = ChessPiece.BISHOP_BLACK;
        theGame[4][4] = ChessPiece.PAWN_WHITE;
        theGame[5][4] = ChessPiece.BISHOP_WHITE;
        theGame[5][5] = ChessPiece.PAWN_WHITE;
        theGame[6][0] = ChessPiece.PAWN_WHITE;
        theGame[6][3] = ChessPiece.QUEEN_WHITE;
        theGame[6][5] = ChessPiece.PAWN_WHITE;
        theGame[6][7] = ChessPiece.PAWN_WHITE;
        theGame[7][5] = ChessPiece.ROOK_WHITE;
        theGame[7][6] = ChessPiece.KING_WHITE;
        ChessBoard myBoard = new ChessBoard(theGame);

        myBoard.print();
    }

}

