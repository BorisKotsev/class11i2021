package chess;

import enums.FigureColor;

public class Rook extends Figure{

	public Rook(int row, int column, FigureColor color) 
	{
		super(row, column, color);
	}
	
	public void move(Figure[] figures, int destinationRow, int destinationColumn)
	{
		if(!isSelected())
		{
			return;
		}

		if(getRow() != destinationRow && getColumn() != destinationColumn)
		{
			return;
		}

		for(Figure f : figures)
		{
			if(f == null) 
				continue;

			if(f.getRow() == destinationRow && f.getColumn() == destinationColumn &&
					f.getColor().equals(this.getColor()))
				return;
		}
		
		if(getRow() == destinationRow)
		{
			int minColumn = destinationColumn;
			int maxColumn = getColumn();
			
			if(minColumn > getColumn())
			{
				minColumn = getColumn();
				maxColumn = destinationColumn;
			}
	
			for(int i = minColumn; i<maxColumn; i++)
			{
				for(Figure f : figures)
				{
					if(f == null)
						continue;
					if(f == this)
						continue;
					if(f.getColumn() == i && f.getRow() == getRow())
						return;
				}
			}

			setColumn(destinationColumn);
		}

		if(getColumn() == destinationColumn)
		{
			int minRow = getRow();
			int maxRow = destinationRow;
			
			if(minRow > maxRow)
			{
				int temp = maxRow;
				maxRow = minRow;
				minRow = temp;
			}
			
			for(int i = minRow+1; i<maxRow; i++)
			{
				for(Figure f : figures)
				{
					if(f == null)
						continue;
					if(f.getRow() == i && f.getColumn() == getColumn())
						return;
				}
			}
			setRow(destinationRow);
		}
	}

	public String toString()
	{
		return getColor().equals(FigureColor.WHITE) ? "R" : "r";
	}		
}
