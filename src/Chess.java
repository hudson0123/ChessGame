public class Chess {

    int currentPlayer = 0;
    // true = White | false = Black
    boolean color;
    char[] players = new char[2];
    public static Peice[][] board = new Peice[8][8];

    public Chess() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if ((i % 2 == 1 && j % 2 == 1) || (i % 2 == 0 && j % 2 == 0)) {
                    board[i][j] = new NoPeice(i, j, false);
                } else {
                    board[i][j] = new NoPeice(i, j, true);
                }
            }
        }
        board[1][0] = new Pawn(1, 0, true);
        board[1][1] = new Pawn(1, 1, true);
        board[1][2] = new Pawn(1, 2, true);
        board[1][3] = new Pawn(1, 3, true);
        board[1][4] = new Pawn(1, 4, true);
        board[1][5] = new Pawn(1, 5, true);
        board[1][6] = new Pawn(1, 6, true);
        board[1][7] = new Pawn(1, 7, true);
        board[0][0] = new Rook(0, 0, true);
        board[0][7] = new Rook(0, 7, true);
        board[0][1] = new Knight(0, 1, true);
        board[0][6] = new Knight(0, 6, true);
        board[0][2] = new Bishop(0, 2, true);
        board[0][5] = new Bishop(0, 5, true);
        board[0][3] = new Queen(0, 3, true);
        board[0][4] = new King(0, 4, true);
        board[6][0] = new Pawn(6, 0, false);
        board[6][1] = new Pawn(6, 1, false);
        board[6][2] = new Pawn(6, 2, false);
        board[6][3] = new Pawn(6, 3, false);
        board[6][4] = new Pawn(6, 4, false);
        board[6][5] = new Pawn(6, 5, false);
        board[6][6] = new Pawn(6, 6, false);
        board[6][7] = new Pawn(6, 7, false);
        board[7][0] = new Rook(7, 0, false);
        board[7][7] = new Rook(7, 7, false);
        board[7][1] = new Knight(7, 1, false);
        board[7][6] = new Knight(7, 6, false);
        board[7][2] = new Bishop(7, 2, false);
        board[7][5] = new Bishop(7, 5, false);
        board[7][3] = new Queen(7, 3, false);
        board[7][4] = new King(7, 4, false);
    }

    public void setPlayers(String player1, String player2) {
        player1 = player1.toUpperCase();
        players[0] = player1.charAt(0);
        players[1] = player2.charAt(0);
    }

    public char getPlayer(int player) {
        return players[player];
    }

    public Peice getPeice(int row, int col) {
        return board[row][col];
    }

    public void makeMove(Peice peice, int row, int col) {
        if (peice.isValidMove(row, col)) {
            board[row][col] = board[peice.getRow()][peice.getCol()];
            if ((peice.getRow() % 2 == 1 && peice.getCol() % 2 == 1) || (peice.getRow() % 2 == 0 && peice.getCol() % 2 == 0)) {
                board[peice.getRow()][peice.getCol()] = new NoPeice(row, col, false);
            } else {
                board[peice.getRow()][peice.getCol()] = new NoPeice(row, col, true);
            }
            peice.setRow(row);
            peice.setCol(col);
        } else {
            System.out.print("Not Valid move");
        }

    }
    int c = 0;
    public void printBoard() {
        System.out.println(c);
        for (int rowing = 0; rowing < 8; rowing++) {
            System.out.println("");
            System.out.println("-----------------------------------------");

            for (int column = 0; column < 8; column++) {
                System.out.print("| " + getPeice(rowing, column).getSymbol() + " ");
                if (getPeice(rowing, column).getSymbol() != '\u2B1C') {
                    System.out.print(" ");
                }
                if (column == 7) {
                    System.out.print("|");
                }
            }
        }
        System.out.println("");
        System.out.println("-----------------------------------------");
        c++;
    }
}
