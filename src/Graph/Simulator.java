package DestinySimulator;

import Graph.DestinyGraph;
import Main.*;
import java.util.*;
import missions.BeaconPosition;
import missions.CompletionStatePosition;
import missions.PublicEventPosition;
import missions.StartPosition;

public class Simulator {
private static final double KILLENEMIES=.47;
private static final double SURVEYAREA=.05;
private static final double COLLECTMATERIALS=.10;
private static final double ENERGIZESSPRAROW=.3;


Simulator() {
}
    
protected DestinyGraph _graph;
protected double _stdDev;
protected double _mean;

public void simulate(SimulationAccumulator analyzer)
{
  int time = 0;

  while (time < _graph.getCurrentTime())
  {
     // Make a choice
	 _graph.chooseNextMove();
	 
	 // Enact the choice
	 _graph.carryOutChoice();
  }
  
  _graph.resetTime();
  
  // Analyze the simulation
  // Accumulate what we find interesting:
  //  * was this optimal what we did?
  //  * Where was time spent? What activities? Locations?
  analyzer.analyze(_graph);
}


Random _rng = new Random();

public double generateTime()
{
   return _rng.nextGaussian() * _stdDev + _mean;
}
}



    
