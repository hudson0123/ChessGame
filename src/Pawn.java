public class Pawn implements Peice {
    
    int col = -1;
    int row = -1;
    boolean color;
    
    public Pawn(int row, int col, boolean color) {
        this.col = col;
        this.row = row;
        this.color = color;
    }
    


    public boolean isValidMove(int row, int col) {
        if (getColor()) {
            if (row == (getRow() + 1) && col == getCol() && !isBlock(row, col)) {
                return true;
            } else {
                return false;
            }
        } else {
            if (row == getRow() - 1 && col == getCol() && !isBlock(row, col)) {
                return true;
            } else {
                return false;
            }
        }

    }

    public boolean isBlock(int row, int col){
        if (Chess.board[row][col].getSymbol() != '\u2B1C' || Chess.board[row][col].getSymbol() != '\u2800' ) {
            return true;
        }
        return false;
    }

    public boolean getColor() {
        return color;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public void setRow(int newRow) {
        row = newRow;
    }

    public void setCol(int newCol) {
        col = newCol;
    }

    public char getSymbol() {
        if (getColor() == true) {
            return '\u2659';
        }
        return '\u265F';
    }
}
