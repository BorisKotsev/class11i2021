package chess;

import enums.FigureColor;

public abstract class Figure 
{
	private int row;
	private int column;
	private FigureColor color;
	private boolean selected;
	
	public void setRow(int row) 
	{
		if (row >= 1 && row <= 8) {

			this.row = row;
		}
	}

	public void setColumn(int column) 
	{
		if (column >= 1 && column <= 8)
		{
			this.column = column;
		}
	}

	public void setSelected(boolean selected) 
	{
		this.selected = selected;
	}

	public int getRow() 
	{
		return row;
	}

	public int getColumn() 
	{
		return column;
	}

	public FigureColor getColor() 
	{
		return color;
	}

	public boolean isSelected() 
	{
		return selected;
	}

	public Figure(int row, int column, FigureColor color) 
	{
		setRow(row);
		setColumn(column);
		this.color = color;
		setSelected(false);
	}

	protected boolean isDestinationOccupied(Figure[] figures, int destinationRow, int destinationColumn)
	{
		for(Figure f : figures) 
		{
			if (f == null)
				continue;

			if(f.getRow() == destinationRow && f.getColumn() == destinationColumn)
			{
				return true;
			}
		}
		return false;
	}

	protected boolean isSameColorOnDestination(Figure[] figures, int destinationRow, int destinationColumn)
    {
        for(Figure f : figures)
		{
			if(f == null) 
				continue;
                
			if(f.getRow() == destinationRow && f.getColumn() == destinationColumn && f.getColor().equals(this.getColor()))
            {
                return true;
            }
		}  

        return false;
    }

	public String toString() 
	{
		return String.format("Row: %d,Column: %d,Color: %s", getRow(), getColumn(), getColor());
	}
	
	public abstract void move(Figure[] figures, int row, int column);
}
