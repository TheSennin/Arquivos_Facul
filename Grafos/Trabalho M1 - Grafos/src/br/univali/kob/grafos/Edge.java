package br.univali.kob.grafos;

public class Edge {
    /**
     * The Edge's identifier
     */
    private String id;
    /**
     * The weight of the bindings on the Edges
     */
    private float weight;
    /**
     * This list persists the two vertexes in the edge
     */
    private Vertex vertices[] = new Vertex[2];

    /**
     * Enumerates the edge type
     */
    public enum EdgeType{
        DIRECTED,
        UNDIRECTED;
    }

    private EdgeType edgeType;

    public Edge(){}

    public Edge(String id, float weight, Vertex v1, Vertex v2, EdgeType e){
        this.id = id;
        this.weight = weight;
        this.vertices[0] = v1;
        this.vertices[1] = v2;
        this.edgeType = e;
    }

    public String getId() {
        return id;
    }

    public float getWeight() {
        return weight;
    }

    public Vertex getVertex1(){
        return this.vertices[0];
    }

    public Vertex getVertex2(){
        return this.vertices[1];
    }

    public Vertex[] getVertices(){
        return this.vertices;
    }

    public EdgeType getEdgeType(){
        return this.edgeType;
    }


}
