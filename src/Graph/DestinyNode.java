/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

import java.util.ArrayList;

import missions.DestinyPosition;

public class DestinyNode
{
    // The beacon, event, etc represented by the node
    protected DestinyPosition _position;
	
    // The set of edges from THIS to other nodes
    protected ArrayList<DestinyEdge> _toEdges;

    public DestinyNode(DestinyPosition position)
    {
    	_position = position;
    	_toEdges = new ArrayList<DestinyEdge>();
    }
    
   public void addEdge(DestinyEdge edge) {
        _toEdges.add(edge);
         }

    public boolean addEdge()
    {
    	
    	return true;
    }
    
    //Equals method 
}
