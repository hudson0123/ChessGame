public class King implements Peice {
    
    int col = -1;
    int row = -1;
    boolean color;
    
    public King(int row, int col, boolean color) {
        this.col = col;
        this.row = row;
        this.color = color;
    }
    
    public int[] makeMove(int row, int col) {
        int[] test = new int[2];
        return test;
    }

    public boolean isValidMove(int row, int col) {
        if (row == getRow() + 1 && col == getCol()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isBlock(int row, int col){
        return true;
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
            return '\u2654';
        }
        return '\u265A';
    }
}
