package Day17;

public enum ChessPiece {

    KING_WHITE(100, "♔"), KING_BLACK(100, "♚"),
    QUEEN_WHITE(9, "♕"), QUEEN_BLACK(9, "♛"),
    ROOK_WHITE(5, "♖"), ROOK_BLACK(5, "♜"),
    BISHOP_WHITE(3, "♗"), BISHOP_BLACK(3, "♝"),
    KNIGHT_WHITE(3.5, "♘"), KNIGHT_BLACK(3.5, "♞"),
    PAWN_WHITE(1, "♙"), PAWN_BLACK(1, "♟"), EMPTY(-1, "_");

    private String icon;
    private double valor;

    public String getIcon() {
        return icon;
    }

    @Override
    public String toString() {
        return "ChessPiece{" +
                "icon='" + icon + '\'' +
                ", valor=" + valor +
                '}';
    }

    ChessPiece(double valor, String icon) {
        this.valor = valor;
        this.icon = icon;
    }
}

