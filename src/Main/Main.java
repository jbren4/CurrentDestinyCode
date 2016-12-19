package main;


import graph.DestinyEdge;
import graph.DestinyGraph;
import graph.DestinyNode;
import java.util.ArrayList;
import missions.BeaconPosition;
import missions.CompletionStatePosition;
import missions.DestinyPosition;
import missions.EliminateEnemies;
import missions.EnergizeSparrow;
import missions.GatherMaterialsFromDefeatedEnemies;
import missions.KillEnemyTarget;
import missions.PublicEventPosition;
import missions.ScanObject;
import missions.StartPosition;
import missions.SurveyArea;

/**
 *
 * @author Joseph
 */
public class Main {
    
    protected static DestinyGraph constructMoonGraph() {

// Create the empty graph
        DestinyGraph moon = new DestinyGraph();

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
        DestinyNode start = new DestinyNode(startPos);

        //Create the Beacon nodes
        DestinyNode beaconA = new DestinyNode(beaconPosA);
        DestinyNode beaconB = new DestinyNode(beaconPosB);
        DestinyNode beaconC = new DestinyNode(beaconPosC);
        DestinyNode beaconD = new DestinyNode(beaconPosD);
        DestinyNode beaconE = new DestinyNode(beaconPosE);
        DestinyNode beaconF = new DestinyNode(beaconPosF);
        DestinyNode beaconG = new DestinyNode(beaconPosG);
        DestinyNode beaconH = new DestinyNode(beaconPosH);
        DestinyNode beaconI = new DestinyNode(beaconPosI);

        //Create all the CompletionState Nodes
        DestinyNode archersLine = new DestinyNode(archersLinePos);
        DestinyNode hellmouth = new DestinyNode(hellmouthPos);
        DestinyNode anchorOfLight = new DestinyNode(anchorOfLightPos);

        //Create the Public Event Nodes
        DestinyNode archersLinePE = new DestinyNode(archersLinePublicEventPos);
        DestinyNode anchorOfLightPE = new DestinyNode(AoLPublicEventPos);
        DestinyNode hellmouthPE = new DestinyNode(hellmouthPublicEventPos);

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
         DestinyEdge startToArchersLineNode = new DestinyEdge(start, archersLine);
         DestinyEdge startToHellmouthNode = new DestinyEdge(start, hellmouth);
         DestinyEdge startToAnchorOfLightNode = new DestinyEdge(start, anchorOfLight);

         //Constructs the edges between the patrol state nodes and the beacon nodes
         DestinyEdge archersLineToBeaconA=new DestinyEdge(archersLine,beaconA);
         DestinyEdge archersLineToBeaconB=new DestinyEdge(archersLine,beaconB);
         DestinyEdge archersLineToBeaconC=new DestinyEdge(archersLine,beaconC);
         DestinyEdge hellmouthToBeaconD=new DestinyEdge(hellmouth,beaconD);
         DestinyEdge hellmouthToBeaconE=new DestinyEdge(hellmouth,beaconE);
         DestinyEdge hellmouthToBeaconF=new DestinyEdge(hellmouth,beaconF);
         DestinyEdge anchorOfLightToBeaconG=new DestinyEdge(anchorOfLight,beaconG);
         DestinyEdge anchorOfLightToBeaconH=new DestinyEdge(anchorOfLight,beaconH);
         DestinyEdge anchorOfLightToBeaconI=new DestinyEdge(anchorOfLight,beaconI);
       
           
        //Constructs the edges between the nodes 
        DestinyEdge startToFirstBeacon = new DestinyEdge(start, beaconA);
        DestinyEdge beaconAtoBeaconB = new DestinyEdge(beaconA, beaconB);
        DestinyEdge beaconBtoBeaconC = new DestinyEdge(beaconB, beaconC);
        DestinyEdge beaconAtoBeaconC = new DestinyEdge(beaconA, beaconC);
        DestinyEdge beaconAtobeaconD = new DestinyEdge(beaconA, beaconD);
        DestinyEdge beaconAtobeaconE = new DestinyEdge(beaconA, beaconE);
        DestinyEdge beaconAtobeaconF = new DestinyEdge(beaconA, beaconF);
        DestinyEdge beaconAtobeaconG = new DestinyEdge(beaconA, beaconG);
        DestinyEdge beaconAtobeaconH = new DestinyEdge(beaconA, beaconH);
        DestinyEdge beaconAtobeaconI = new DestinyEdge(beaconA, beaconI);
        DestinyEdge beaconBtoBeaconD = new DestinyEdge(beaconB, beaconD);
        DestinyEdge beaconBtoBeaconE = new DestinyEdge(beaconB, beaconE);
        DestinyEdge beaconBtoBeaconF = new DestinyEdge(beaconB, beaconE);
        DestinyEdge beaconBtoBeaconG = new DestinyEdge(beaconB, beaconG);
        DestinyEdge beaconBtoBeaconH = new DestinyEdge(beaconB, beaconH);
        DestinyEdge beaconBtoBeaconI = new DestinyEdge(beaconB, beaconI);
        DestinyEdge beaconCtoBeaconD = new DestinyEdge(beaconC, beaconD);
        DestinyEdge beaconCtoBeaconE = new DestinyEdge(beaconC, beaconE);
        DestinyEdge beaconCtoBeaconF = new DestinyEdge(beaconC, beaconF);
        DestinyEdge beaconCtoBeaconG = new DestinyEdge(beaconC, beaconG);
        DestinyEdge beaconCtoBeaconH = new DestinyEdge(beaconC, beaconH);
        DestinyEdge beaconCtoBeaconI = new DestinyEdge(beaconC, beaconI);
        DestinyEdge beaconDtoBeaconE = new DestinyEdge(beaconD, beaconE);
        DestinyEdge beaconDtoBeaconF = new DestinyEdge(beaconD, beaconF);
        DestinyEdge beaconDtoBeaconG = new DestinyEdge(beaconD, beaconG);
        DestinyEdge beaconDtoBeaconH = new DestinyEdge(beaconD, beaconH);
        DestinyEdge beaconDtoBeaconI = new DestinyEdge(beaconD, beaconI);
        DestinyEdge beaconEtoBeaconF = new DestinyEdge(beaconE, beaconF);
        DestinyEdge beaconEtoBeaconG = new DestinyEdge(beaconE, beaconG);
        DestinyEdge beaconEtoBeaconH = new DestinyEdge(beaconE, beaconH);
        DestinyEdge beaconEtoBeaconI = new DestinyEdge(beaconE, beaconI);
        DestinyEdge beaconFtoBeaconG = new DestinyEdge(beaconF, beaconG);
        DestinyEdge beaconFtoBeaconH = new DestinyEdge(beaconF, beaconH);
        DestinyEdge beaconFtoBeaconI = new DestinyEdge(beaconF, beaconI);
        DestinyEdge beaconGtoBeaconH = new DestinyEdge(beaconG, beaconH);
        DestinyEdge beaconGtoBeaconI = new DestinyEdge(beaconG, beaconI);

        
        

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
        

        // Print the graph (to verify code)
        //
        // Return the graph
        return moon;
    }

    public static void main(String[] args) {
        // Construct the graph
        DestinyGraph moon = constructMoonGraph();
        
        Analyzer(moon);

        // Analyze the graph
    }

    //DestinyNode has a DestinyPosition within it
}

//AnaylzerClass 
//
//takes a Destiny graph 
////instaniationg(){

//
//
//   This gives us a graph to run the simulation 
//generates an instance for our graphs to  simuatios
//   each beacon will choose a mission 
//
//
//}
//
//Anyzie(Desinty Graph){
//
//
//returns a new class called 
//
//statisitcalanysis which will reutn the sum of the anysisi of the whole graph 
//
//}
//
//Do 
//
//Stats class ASAP 
//
//!!!!!!!!!!
