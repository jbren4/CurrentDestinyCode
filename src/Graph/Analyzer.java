package Graph;

import Main.*;
import java.util.*;
import missions.BeaconPosition;
import missions.CompletionStatePosition;
import missions.PublicEventPosition;
import missions.StartPosition;


/**
 *
 * @author Joseph
 */



public class Analyzer {
double killEnemies=.47;
double killEnemyTarget=.35;
double surveyArea=.05;
double collectMaterials=.10;
double energizeSparrow=.3;
double total=1;

Analyzer() {
     
        
    }

    Analyzer(DestinyGraph moon) {
      instaniationg(moon);
        
    }

    public void instaniationg(DestinyGraph planet) {
         graph.DestinyGraph moon = new graph.DestinyGraph();

        
         //Construct all the Beacon Postions on the graph 
        BeaconPosition beaconPosA = new BeaconPosition("Beacon A", 4, 0);
        BeaconPosition beaconPosB = new BeaconPosition("Beacon B", 4, 0);
        BeaconPosition beaconPosC = new BeaconPosition("Beacon C", 5, -6);
        BeaconPosition beaconPosD = new BeaconPosition("Beacon D", 10, 6);
        BeaconPosition beaconPosE = new BeaconPosition("Beacon E", 8, 5);
        BeaconPosition beaconPosF = new BeaconPosition("Beacon F", 6, 4);
        BeaconPosition beaconPosG = new BeaconPosition("Beacon G", 6, 4);
        BeaconPosition beaconPosH = new BeaconPosition("Beacon H", 6, 4);
        BeaconPosition beaconPosI = new BeaconPosition("Beacon I", 6, 4);

        //Construct all the CompletionState Postions on the graph     
        CompletionStatePosition anchorOfLightPos = new CompletionStatePosition("Anchor of Light", 0, 0);
        CompletionStatePosition hellmouthPos = new CompletionStatePosition("Hellmouth", 0, 0);
        CompletionStatePosition archersLinePos = new CompletionStatePosition("Archers Line", 0, 0);

        //Construct the start DestinyPosition
        StartPosition startPos = new StartPosition("Phase in Location", 0, 0);

        //Creates a public eventPosition 
        PublicEventPosition AoLPublicEventPos = new PublicEventPosition("Defeat the Fallen Walker", 3, 0);
        PublicEventPosition archersLinePublicEventPos = new PublicEventPosition("Defend the Warsat", 3, 0);
        PublicEventPosition hellmouthPublicEventPos = new PublicEventPosition("Kill the high value target", 3, 0);

        //
        //Creates the nodes
        //
        
        //Creates the start postion node
        graph.DestinyNode start = new graph.DestinyNode(startPos);

        //Create the Beacon nodes
        graph.DestinyNode beaconA = new graph.DestinyNode(beaconPosA);
        graph.DestinyNode beaconB = new graph.DestinyNode(beaconPosB);
        graph.DestinyNode beaconC = new graph.DestinyNode(beaconPosC);
        graph.DestinyNode beaconD = new graph.DestinyNode(beaconPosD);
        graph.DestinyNode beaconE = new graph.DestinyNode(beaconPosE);
        graph.DestinyNode beaconF = new graph.DestinyNode(beaconPosF);
        graph.DestinyNode beaconG = new graph.DestinyNode(beaconPosG);
        graph.DestinyNode beaconH = new graph.DestinyNode(beaconPosH);
        graph.DestinyNode beaconI = new graph.DestinyNode(beaconPosI);

        //Create all the CompletionState Nodes
        graph.DestinyNode archersLine = new graph.DestinyNode(archersLinePos);
        graph.DestinyNode hellmouth = new graph.DestinyNode(hellmouthPos);
        graph.DestinyNode anchorOfLight = new graph.DestinyNode(anchorOfLightPos);

        //Create the Public Event Nodes
        graph.DestinyNode archersLinePE = new graph.DestinyNode(archersLinePublicEventPos);
        graph.DestinyNode anchorOfLightPE = new graph.DestinyNode(AoLPublicEventPos);
        graph.DestinyNode hellmouthPE = new graph.DestinyNode(hellmouthPublicEventPos);

        //
        // Add the nodes to the graph
        //
        //Adds the starting node to the graph
        moon.addNode(start);

        //Adds the beacon nodes to the graph
        moon.addNode(beaconA);
        moon.addNode(beaconC);
        moon.addNode(beaconD);
        moon.addNode(beaconE);
        moon.addNode(beaconF);
        moon.addNode(beaconG);
        moon.addNode(beaconH);
        moon.addNode(beaconI);

       //Adds the Completion State nodes to the graph
        moon.addNode(archersLine);
        moon.addNode(anchorOfLight);
        moon.addNode(hellmouth);

        //Adds the PublicEvent nodes to the graph 
        moon.addNode(archersLinePE);
        moon.addNode(anchorOfLightPE);
        moon.addNode(hellmouthPE);

        //
        //Construct Edges between nodes
        //
        

        //Constructs edges from the start node to the general patrol state nodes
         graph.DestinyEdge startToArchersLineNode = new graph.DestinyEdge(start, archersLine);
         graph.DestinyEdge startToHellmouthNode = new graph.DestinyEdge(start, hellmouth);
         graph.DestinyEdge startToAnchorOfLightNode = new graph.DestinyEdge(start, anchorOfLight);

         //Constructs the edges between the patrol state nodes and the beacon nodes
         graph.DestinyEdge archersLineToBeaconA=new graph.DestinyEdge(archersLine,beaconA);
         graph.DestinyEdge archersLineToBeaconB=new graph.DestinyEdge(archersLine,beaconB);
         graph.DestinyEdge archersLineToBeaconC=new graph.DestinyEdge(archersLine,beaconC);
         graph.DestinyEdge hellmouthToBeaconD=new graph.DestinyEdge(hellmouth,beaconD);
         graph.DestinyEdge hellmouthToBeaconE=new graph.DestinyEdge(hellmouth,beaconE);
         graph.DestinyEdge hellmouthToBeaconF=new graph.DestinyEdge(hellmouth,beaconF);
         graph.DestinyEdge anchorOfLightToBeaconG=new graph.DestinyEdge(anchorOfLight,beaconG);
         graph.DestinyEdge anchorOfLightToBeaconH=new graph.DestinyEdge(anchorOfLight,beaconH);
         graph.DestinyEdge anchorOfLightToBeaconI=new graph.DestinyEdge(anchorOfLight,beaconI);
       
           
        //Constructs the edges between the nodes 
        graph.DestinyEdge startToFirstBeacon = new graph.DestinyEdge(start, beaconA);
        graph.DestinyEdge beaconAtoBeaconB = new graph.DestinyEdge(beaconA, beaconB);
        graph.DestinyEdge beaconBtoBeaconC = new graph.DestinyEdge(beaconB, beaconC);
        graph.DestinyEdge beaconAtoBeaconC = new graph.DestinyEdge(beaconA, beaconC);
        graph.DestinyEdge beaconAtobeaconD = new graph.DestinyEdge(beaconA, beaconD);
        graph.DestinyEdge beaconAtobeaconE = new graph.DestinyEdge(beaconA, beaconE);
        graph.DestinyEdge beaconAtobeaconF = new graph.DestinyEdge(beaconA, beaconF);
        graph.DestinyEdge beaconAtobeaconG = new graph.DestinyEdge(beaconA, beaconG);
        graph.DestinyEdge beaconAtobeaconH = new graph.DestinyEdge(beaconA, beaconH);
        graph.DestinyEdge beaconAtobeaconI = new graph.DestinyEdge(beaconA, beaconI);
        graph.DestinyEdge beaconBtoBeaconD = new graph.DestinyEdge(beaconB, beaconD);
        graph.DestinyEdge beaconBtoBeaconE = new graph.DestinyEdge(beaconB, beaconE);
        graph.DestinyEdge beaconBtoBeaconF = new graph.DestinyEdge(beaconB, beaconE);
        graph.DestinyEdge beaconBtoBeaconG = new graph.DestinyEdge(beaconB, beaconG);
        graph.DestinyEdge beaconBtoBeaconH = new graph.DestinyEdge(beaconB, beaconH);
        graph.DestinyEdge beaconBtoBeaconI = new graph.DestinyEdge(beaconB, beaconI);
        graph.DestinyEdge beaconCtoBeaconD = new graph.DestinyEdge(beaconC, beaconD);
        graph.DestinyEdge beaconCtoBeaconE = new graph.DestinyEdge(beaconC, beaconE);
        graph.DestinyEdge beaconCtoBeaconF = new graph.DestinyEdge(beaconC, beaconF);
        graph.DestinyEdge beaconCtoBeaconG = new graph.DestinyEdge(beaconC, beaconG);
        graph.DestinyEdge beaconCtoBeaconH = new graph.DestinyEdge(beaconC, beaconH);
        graph.DestinyEdge beaconCtoBeaconI = new graph.DestinyEdge(beaconC, beaconI);
        graph.DestinyEdge beaconDtoBeaconE = new graph.DestinyEdge(beaconD, beaconE);
        graph.DestinyEdge beaconDtoBeaconF = new graph.DestinyEdge(beaconD, beaconF);
        graph.DestinyEdge beaconDtoBeaconG = new graph.DestinyEdge(beaconD, beaconG);
        graph.DestinyEdge beaconDtoBeaconH = new graph.DestinyEdge(beaconD, beaconH);
        graph.DestinyEdge beaconDtoBeaconI = new graph.DestinyEdge(beaconD, beaconI);
        graph.DestinyEdge beaconEtoBeaconF = new graph.DestinyEdge(beaconE, beaconF);
        graph.DestinyEdge beaconEtoBeaconG = new graph.DestinyEdge(beaconE, beaconG);
        graph.DestinyEdge beaconEtoBeaconH = new graph.DestinyEdge(beaconE, beaconH);
        graph.DestinyEdge beaconEtoBeaconI = new graph.DestinyEdge(beaconE, beaconI);
        graph.DestinyEdge beaconFtoBeaconG = new graph.DestinyEdge(beaconF, beaconG);
        graph.DestinyEdge beaconFtoBeaconH = new graph.DestinyEdge(beaconF, beaconH);
        graph.DestinyEdge beaconFtoBeaconI = new graph.DestinyEdge(beaconF, beaconI);
        graph.DestinyEdge beaconGtoBeaconH = new graph.DestinyEdge(beaconG, beaconH);
        graph.DestinyEdge beaconGtoBeaconI = new graph.DestinyEdge(beaconG, beaconI);

        
        

        //
        // Add the edges to the graph
        //
        moon.addEdge(startToFirstBeacon);
        moon.addEdge(beaconAtoBeaconB);
        moon.addEdge(beaconBtoBeaconC);
        moon.addEdge(beaconAtoBeaconC);
        moon.addEdge(beaconAtobeaconD);
        moon.addEdge(beaconAtobeaconE);
        moon.addEdge(beaconAtobeaconF);
        moon.addEdge(beaconAtobeaconG);
        moon.addEdge(beaconAtobeaconH);
        moon.addEdge(beaconAtobeaconI);
        moon.addEdge(beaconBtoBeaconD);
        moon.addEdge(beaconBtoBeaconE);
        moon.addEdge(beaconBtoBeaconF);
        moon.addEdge(beaconBtoBeaconG);
        moon.addEdge(beaconBtoBeaconH);
        moon.addEdge(beaconBtoBeaconI);
        moon.addEdge(beaconCtoBeaconD);
        moon.addEdge(beaconCtoBeaconE);
        moon.addEdge(beaconCtoBeaconF);
        moon.addEdge(beaconCtoBeaconG);
        moon.addEdge(beaconCtoBeaconH);
        moon.addEdge(beaconCtoBeaconI);
        moon.addEdge(beaconDtoBeaconE);
        moon.addEdge(beaconDtoBeaconF);
        moon.addEdge(beaconDtoBeaconH);
        moon.addEdge(beaconDtoBeaconI);
        moon.addEdge(beaconEtoBeaconF);
        moon.addEdge(beaconDtoBeaconG);
        moon.addEdge(beaconEtoBeaconG);
        moon.addEdge(beaconEtoBeaconH);
        moon.addEdge(beaconEtoBeaconI);
        moon.addEdge(beaconFtoBeaconG);
        moon.addEdge(beaconFtoBeaconH);
        moon.addEdge(beaconFtoBeaconI);
        moon.addEdge(beaconGtoBeaconH);
        moon.addEdge(beaconGtoBeaconI);
        
        moon.addEdge(startToArchersLineNode);
        moon.addEdge(startToHellmouthNode);
        moon.addEdge(startToAnchorOfLightNode);
        
        moon.addEdge(archersLineToBeaconA);
        moon.addEdge(archersLineToBeaconB);
        moon.addEdge(archersLineToBeaconC);
        moon.addEdge(hellmouthToBeaconD);
        moon.addEdge(hellmouthToBeaconE);
        moon.addEdge(hellmouthToBeaconF);
        moon.addEdge(anchorOfLightToBeaconG);
        moon.addEdge(anchorOfLightToBeaconH);
        moon.addEdge(anchorOfLightToBeaconI);

        
        Random rand = new Random();
        int pathNumber = rand.nextInt(6);
        ArrayList graphList=new ArrayList();

   
        Analyzer mon = new Analyzer();
        for(int i=0;i<100;i++){
            graphList.add(startPos);
            double prob=mon.probabilityToNextNode(5,2,3,1,.43);
            
            switch ((int)prob) {
                case 1:
                    //Go to Beacon A
                      System.out.println("Kill Target");
                      graphList.add(beaconA);
                    break;

                case 2:
                    //Go to beacon B
                      System.out.println("Gather Resources ");
                      graphList.add(beaconB);
                    break;

                case 3:
                    //Go to beacon C
                     System.out.println("Kill enemies ");
                     graphList.add(beaconC);
                    break;
                case 4:
                    //Go to beacon D
                     System.out.println("Energize Sparrow");
                     graphList.add(beaconD);
                    break;
                case 5:
                    //Go to beacon E
                    System.out.println("Scan Area");
                    graphList.add(beaconE);
                    break;
                case 6: //Go to beacon F
                      System.out.println("Collect materials ");
                      graphList.add(beaconF);
                    break;
            }
         //Turn nodes off once they are added to the graph
         //Create github
                
    }
        
    }

    
    //Calculates the probability of going to the next position     
public double probabilityToNextNode(double xCord1,double yCord1, double xCord2,double yCord2,double weight){
  double distance=Math.sqrt((Math.pow(yCord2-yCord1, 2)-Math.pow(xCord2-xCord1, 2)));
  return distance/total;
  
}
    
    
}



    
