class GameBoardRunner {

    public static void main(String[] args) {

    
        ChessBoard board1 = new ChessBoard();
        board1.material = "Wood";
        board1.shape = "Square";
        board1.price = 1200;

        board1.squares = 64;
        board1.pieceType = "Standard";
        board1.color = "Black & White";
        board1.foldable = true;
        board1.weight = 1.5;

        board1.startGame();
        board1.endGame();
        board1.displayBoardDetails();

        System.out.println("----------------");

        ChessBoard board2 = new ChessBoard();
        board2.material = "Plastic";
        board2.shape = "Square";
        board2.price = 800;

        board2.squares = 64;
        board2.pieceType = "Magnetic";
        board2.color = "Brown & Cream";
        board2.foldable = true;
        board2.weight = 1.2;

        board2.startGame();
        board2.endGame();
        board2.displayBoardDetails();

        System.out.println("----------------");


        GameBoard board3 = new ChessBoard();
        board3.material = "Wood";
        board3.shape = "Square";
        board3.price = 1000;

        board3.startGame();
        board3.endGame();

        System.out.println("----------------");

        GameBoard board4 = new ChessBoard();
        board4.material = "Plastic";
        board4.shape = "Square";
        board4.price = 700;

        board4.startGame();
        board4.endGame();

        System.out.println("----------------");

        GameBoard board5 = new GameBoard();
        board5.material = "Metal";
        board5.shape = "Square";
        board5.price = 1500;

        board5.startGame();
        board5.endGame();

        System.out.println("----------------");

        GameBoard board6 = new GameBoard();
        board6.material = "Glass";
        board6.shape = "Square";
        board6.price = 2000;

        board6.startGame();
        board6.endGame();
    }
}