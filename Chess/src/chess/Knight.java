package chess;

import enums.FigureColor;

public class Knight extends Figure 
{
    public Knight(int row, int col, FigureColor color)
    {
        super(row, col, color);
    }
   
    public void move(Figure[] figures, int destinationRow, int destinationColumn) 
    {
        if(!isSelected())
        {
            return;
        }
        
        if(destinationRow > 8 || destinationRow < 1 || destinationColumn > 8 || destinationColumn < 1)
        {
            return;
        }

        if(getRow() == destinationRow - 2 && getColumn() == destinationColumn - 1)
        {
            if(!isSameColorOnDestination(figures, destinationRow, destinationColumn))
            {
                setRow(destinationRow);
                setColumn(destinationColumn);
            }
        }
        else if(getRow() == destinationRow - 2 && getColumn() == destinationColumn + 1)
        {
            if(!isSameColorOnDestination(figures, destinationRow, destinationColumn))
            {
                setRow(destinationRow);
                setColumn(destinationColumn);
            }
        }
        else if(getRow() == destinationRow + 2 && getColumn() == destinationColumn + 1)
        {
            if(!isSameColorOnDestination(figures, destinationRow, destinationColumn))
            {
                setRow(destinationRow);
                setColumn(destinationColumn);
            }
        }
        else if(getRow() == destinationRow + 2 && getColumn() == destinationColumn - 1)
        {
            if(!isSameColorOnDestination(figures, destinationRow, destinationColumn))
            {
                setRow(destinationRow);
                setColumn(destinationColumn);
            }
        }
        else if(getRow() == destinationRow - 1 && getColumn() == destinationColumn - 2)
        {
            if(!isSameColorOnDestination(figures, destinationRow, destinationColumn))
            {
                setRow(destinationRow);
                setColumn(destinationColumn);
            }
        }
        else if(getRow() == destinationRow - 1 && getColumn() == destinationColumn + 2)
        {
            if(!isSameColorOnDestination(figures, destinationRow, destinationColumn))
            {
                setRow(destinationRow);
                setColumn(destinationColumn);
            }
        }
        else if(getRow() == destinationRow + 1 && getColumn() == destinationColumn - 2)
        {
            if(!isSameColorOnDestination(figures, destinationRow, destinationColumn))
            {
                setRow(destinationRow);
                setColumn(destinationColumn);
            }
        }
        else if(getRow() == destinationRow + 1 && getColumn() == destinationColumn + 2)
        {
            if(!isSameColorOnDestination(figures, destinationRow, destinationColumn))
            {
                setRow(destinationRow);
                setColumn(destinationColumn);
            }
        }
    }

	public String toString()
	{
		return getColor().equals(FigureColor.WHITE) ? "K" : "k";
	}
}
