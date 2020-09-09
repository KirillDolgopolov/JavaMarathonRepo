package Day17;

public class ChessBoard {
    private ChessPiece[][] board;

    ChessBoard(ChessPiece[][] board) {
        this.board = board;
    }

    void print() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j].getIcon());
            }
            System.out.println();

        }
    }

}
