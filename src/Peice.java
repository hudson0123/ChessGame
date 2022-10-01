interface Peice{
    
    public boolean isValidMove(int row, int col);

    public char getSymbol();

    public boolean getColor();

    public int getRow();

    public int getCol();

    public void setRow(int newRow);

    public void setCol(int newCol);

    public boolean isBlock(int row, int col);

}
