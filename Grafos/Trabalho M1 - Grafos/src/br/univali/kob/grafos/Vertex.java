package br.univali.kob.grafos;

import java.util.ArrayList;

public class Vertex {

    /**
     * The Vertex identifier
     */
    private final String id;
    /**
     * list of the edges binding the vertexes
     */
    private ArrayList<Edge> edges = new ArrayList<>();

    public Vertex(){
        id = null;
    }

    public Vertex(String id){
        this.id = id;
    }

    public String getId(){
        return this.id;
    }

    /**
     * This method add an edge to de vertex
     * @param e
     */
    public void addEdge(Edge e){
        edges.add(e);
    }

    public ArrayList<Edge> getEdges(){
        return this.edges;
    }
}
