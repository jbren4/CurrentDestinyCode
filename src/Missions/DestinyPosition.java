package missions;

import statistics.Distribution;

/**
 *
 * @author Joseph
 */
public abstract class DestinyPosition
{
	protected Distribution _distribution;
	protected String _name;
	protected int _xCoord;
	protected int _yCoord;	

	public DestinyPosition()
	{
		
	}
	
    public DestinyPosition(String nameOfPosition, int xCord, int yCord)
    {
       _name=nameOfPosition;
       _xCoord=xCord;
       _yCoord=yCord;
    }
    
}
