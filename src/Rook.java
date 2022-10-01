public class Rook implements Peice {
    
    int col = -1;
    int row = -1;
    boolean color;    

    public Rook(int row, int col, boolean color) {
        this.col = col;
        this.row = row;
        this.color = color;
    }
    
    public boolean isValidMove(int row, int col) {
        if (row == getRow() || col == getCol()) {
            if (!isBlock(row, col)) {
                return true;
            }
        }
        return false;
    }

    public boolean isBlock(int row, int col){
        if (col == getCol()) {
            for (int i = row;i > getRow();i--) {
                if (Chess.board[row][col].getSymbol() != '\u2B1C' || Chess.board[row][col].getSymbol() != '\u2800' ) {
                    return true;
                }
            }
            return false;
        } else {
            for (int i = col;i > getCol();i--) {
                if (Chess.board[row][col].getSymbol() != '\u2B1C' || Chess.board[row][col].getSymbol() != '\u2800' ) {
                    return true;
                }
            }
            return false;
        }
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
            return '\u2656';
        }
        return '\u265C';
    }
}
