class ChessBoard extends GameBoard {

    int squares;
    String pieceType;
    String color;
    boolean foldable;
    double weight;

    void displayBoardDetails() {
        System.out.println("Squares: " + squares);
        System.out.println("Piece Type: " + pieceType);
        System.out.println("Color: " + color);
        System.out.println("Foldable: " + foldable);
        System.out.println("Weight: " + weight);
    }
}