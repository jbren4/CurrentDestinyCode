/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

import java.util.ArrayList;

/**
 *
 * @author Joseph
 */
public class DestinyGraph {

    protected ArrayList<DestinyNode> _vertices;
    protected ArrayList<DestinyEdge> edges;
    protected double timePassed;

    public DestinyGraph() {
        edges = new ArrayList<>();
        _vertices = new ArrayList<>();

    }

    public void addNode(DestinyNode node) {
        _vertices.add(node);
    }

    public boolean contains(DestinyNode node) {

        return _vertices.contains(node);
    }

    //Finds the node and adds it to the graph
    public void addEdge(DestinyEdge edge) {
        edges.add(edge);
    }

    public double getCurrentTime() {
        return timePassed;
    }
    
    public void resetTime(){
        timePassed=0;
    }

    @Override
    public String toString() {
        String str = "";

        for (int i = 0; i < edges.size(); i++) {

        }

        return "";
    }
}
