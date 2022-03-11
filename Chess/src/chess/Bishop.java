package chess;

import enums.FigureColor;

public class Bishop extends Figure{
    public Bishop(int row, int col, FigureColor color)
    {
        super(row, col, color);
    }
    @Override
    public void move(Figure[] figures, int destinationRow, int destinationColumn) {
        if(!isSelected())
        {
            return;
        }

        if(destinationRow > 8 || destinationRow < 1 || destinationColumn > 8 || destinationColumn < 1)
        {
            return;
        }
    
        int deltaY = Math.abs(getRow() - destinationRow);
        int deltaX = Math.abs(getColumn() - destinationColumn);

        if(deltaX != deltaY)
        {
            return;
        }

        if(!hasClearPath(figures, destinationColumn, destinationRow)) return;

        if(!isSameColorOnDestination(figures, destinationRow, destinationColumn))
        {
            setColumn(destinationColumn);
            setRow(destinationRow);
        }
    }
    
    private boolean hasClearPath(Figure[] figures, int destinationColumn, int destinationRow){
        int delta = Math.abs(getRow() - destinationRow);
        for(int step = 1; step < delta; step++){
            int currentRow = (getRow() + step) * destinationRow<getRow() ? -1 : 1;
            int currentColumn = (getColumn() + step) * destinationColumn<getColumn() ? -1 : 1;
            if(isDestinationOccupied(figures, currentRow, currentColumn)) return false;
        }
        return true;
    }

    @Override
    public String toString() {
        if(getColor().equals(FigureColor.WHITE)) return "B";
        else return "b";
    }
}
