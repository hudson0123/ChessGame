public class App {
    public static void main(String[] args) throws Exception {
        Chess game = new Chess();
        Peice pawn1 = game.getPeice(1, 4);
        Peice pawn2 = game.getPeice(6, 3);
        Peice pawn3 = game.getPeice(6, 3);
        Peice pawn4 = game.getPeice(1, 0);
        Peice rook = game.getPeice(0, 0);
        System.out.print(pawn4.getSymbol());
        game.printBoard();
        game.makeMove(pawn4, 2, 0);
        game.printBoard();
        game.makeMove(pawn4, 3, 0);
        game.printBoard();
        game.makeMove(pawn4, 4, 0);
        game.printBoard();
        game.makeMove(pawn4, 5, 0);
        game.printBoard();
        game.makeMove(pawn4, 6, 0);
        game.printBoard();
        game.makeMove(pawn2, 5, 3);
        game.printBoard();
        game.makeMove(pawn2, 4, 3);
        game.printBoard();
        game.makeMove(pawn2, 3, 3);
        game.printBoard();
        game.makeMove(rook, 3, 0);
        game.printBoard();
        game.makeMove(rook, 3, 2);
        game.printBoard();
    }
}
