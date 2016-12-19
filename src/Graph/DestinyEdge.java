package graph;

import missions.DestinyPosition;

public class DestinyEdge
{
    protected DestinyNode _from;
    protected DestinyNode _to;
    protected DestinyAnnotation _annotation;
    
    
    public DestinyEdge(DestinyNode from, DestinyNode to)
    {
    	_from = from;
    	_to = to;
    	
   }
}
