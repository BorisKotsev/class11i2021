package chess;

import enums.FigureColor;

public class Pawn extends Figure{

	public Pawn(int row, int column, FigureColor color) 
	{
		super(row, column, color);
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
		
		if(isDestinationOccupied(figures, destinationRow, destinationColumn)) 
		{
			return;
		}
		else 
		{
			setRow(destinationRow);
			setColumn(destinationColumn);
		}
	}
}
