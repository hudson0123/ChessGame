public class NoPeice implements Peice{
        
    int col = -1;
    int row = -1;
    boolean color;
    
    public NoPeice(int row, int col, boolean color) {
        this.col = col;
        this.row = row;
        this.color = color;
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
        this.row = newRow;
    }

    public void setCol(int newCol) {
        this.row = newCol;
    }

    public char getSymbol() {
        if (getColor() == true) {
            return '\u2800';
        }
        return '\u2B1C';
    }
}
