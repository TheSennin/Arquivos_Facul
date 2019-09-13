package br.univali.kob.grafos;

import java.util.ArrayList;

public class Graph {

    /**
     * List with all the vertices in the graph
     */
    private ArrayList<Vertex> vertices = new ArrayList<>();

    /**
     * List with all the edges in the graph
     */
    private ArrayList<Edge> edges = new ArrayList<>();

    /**
     * Method to add a vertex to the graph
     */
    public void addVertex(String id){
        Vertex v = new Vertex(id);
        vertices.add(v);
    }
    /**
     * Method to add an Edge to the graph
     * @param v1 the first vertex to be add
     * @param v2 the second vertex to be add
     * @param weight the binding's weight between two vertices
     * @param id the id of the new edge
     */
    public void addEdge(Vertex v1, Vertex v2, float weight, String id, Edge.EdgeType t){
        Edge e = new Edge(id, weight, v1, v2, t);
        v1.addEdge(e);
        v2.addEdge(e);
        edges.add(e);
    }

    /**
     * Method to check if there is a vertex called by the id passed by
     * @param id the id to be search
     * @return true if there is a vertex with the id
     */
    public boolean hasVertex(String id) {
        for(Vertex v:vertices) {
            if(v.getId().equals(id))
                return true;
        }
        return false;
    }

    /**
     * Method to check if there is an edge called by the id passed by
     * @param id the id to be search
     * @return true if there is an edge with the id
     */
    private boolean hasEdge(String id) {
        for(Vertex v:vertices) {
            for(Edge a:v.getEdges()) {
                if(a.getId().equals(id))
                    return true;
            }
        }
        return false;
    }

    /**
     * Method to remove an edge from de graph
     * @param id the id of the edge to be removed
     */
    public boolean removeEdge(String id) {
        if(id != null) {
            Edge e = getEdge(id);
            if(e != null) {
                e.getVertex1().getEdges().remove(e);
                e.getVertex2().getEdges().remove(e);
                edges.remove(e);
                return true;
            }else
                return false;
        }else
            return false;
    }

    /**
     * Method to remove a vertex from de graph
     * @param id the id of the vertex to be removed
     */
    public boolean removeVertex(String id) {
        if(id != null && hasVertex(id)) {
            Vertex v = getVertex(id);
            ArrayList<Edge> e = v.getEdges();
            if(!v.getEdges().isEmpty()) {
                int i = 0;
                for (Edge ed : e) {
                    ed.getVertex1().getEdges().remove(v);
                    ed.getVertex2().getEdges().remove(v);
                    edges.remove(ed);
                }
                vertices.remove(v);
                return true;
            }else {
                vertices.remove(v);
                return true;
            }
        }else{
            return false;
        }
    }

    /**
     * Method to get a vertex by the id
     * @param id the id to be searched
     * @return the result of the search
     */
    public Vertex getVertex(String id) {
        for(Vertex v:vertices) {
            if(v.getId().equals(id)) {
                return v;
            }
        }
        return null;
    }

    public Edge getEdge(String id){
        for(Edge e : edges) {
            if(e.getId().equals(id)) {
                return e;
            }
        }
        return null;
    }

    public ArrayList<Edge> getAllEdges(){
        return this.edges;
    }

    /**
     * Method to check if two vertices are adjacent
     * @param id1 the first vertex
     * @param id2 the second vertex
     * @return true if it's adjacent
     */
    public boolean isAdjacent(String id1, String id2) {
        Vertex v1 = getVertex(id1);
        Vertex v2 = getVertex(id2);
        if(v1 != null && v2 != null) {
            for (Edge a : v1.getEdges()) {
                for (Edge b : v2.getEdges()) {
                    if (a.getId().equals(b.getId()))
                        return true;
                }
            }
            return false;
        }else
            return false;
    }
    /**
     * Method to get the weight of the edge
     * @param id the id of the edge to be searched
     * @return the found weight
     */
    public float getEdgeWeight(String id) {
        for(Vertex v:vertices) {
            for(Edge a:v.getEdges()) {
                if(a.getId().equals(id))
                    return a.getWeight();
            }
        }
        return -1;
    }

    /**
     * Return the type of the edges in the graph
     */
    public Edge.EdgeType getEdgeType(){
        if (edges.size() >= 1) {
            return edges.get(0).getEdgeType();
        }else
            return null;
    }

    /**
     * Method to return the binding edge between two vertices
     * @param id1 the id of the first vertex
     * @param id2 the id of the second vertex
     * @return the found edge
     */
    public Edge getEdgeBetweenVertices(String id1, String id2) {
        Vertex v1 = getVertex(id1);
        Vertex v2 = getVertex(id2);
        for (Edge a: v1.getEdges()) {
            for(Edge b: v2.getEdges()) {
                if(a.getId().equals(b.getId()))
                    return a;
            }
        }
        return null;
    }

    public int[][] generateAdjacencyMatrix(){
        int matrix[][] = new int[vertices.size()][vertices.size()];

        for(int i = 0;i<vertices.size();i++){
            for(int j = 0;j<vertices.size();j++)
                if(isAdjacent(vertices.get(i).getId(), vertices.get(j).getId())){
                    if(vertices.get(i).getId() != vertices.get(j).getId())
                        matrix[i][j] = 1;
                }else{
                    matrix[i][j] = 0;
                }
            }
            return matrix;
        }

    public int[][] generateDirectedEdgeIncidenceMatrix(){
        if(!edges.isEmpty() && getEdgeType().equals(Edge.EdgeType.DIRECTED)) {
            int matrix[][] = new int[vertices.size()][edges.size()];

            for (int i = 0; i < edges.size(); i++) {
                for (int j = 0; j < vertices.size(); j++) {
                    if (edges.get(i).getVertex1().equals(vertices.get(j))) {
                        matrix[j][i] = 1;
                    } else if (edges.get(i).getVertex2().equals(vertices.get(j))) {
                        matrix[j][i] = -1;
                    }
                }
            }
            return matrix;
        }else
            return null;
    }

    public int[][] generateUndirectedEdgeIncidenceMatrix(){
        if(!edges.isEmpty() && getEdgeType().equals(Edge.EdgeType.UNDIRECTED)){
            int matrix[][] = new int[vertices.size()][edges.size()];

            for (int i = 0; i < edges.size(); i++) {
                for (int j = 0; j < vertices.size(); j++) {
                    if (edges.get(i).getVertex1().equals(vertices.get(j))) {
                        matrix[j][i] = 1;
                    } else if (edges.get(i).getVertex2().equals(vertices.get(j))) {
                        matrix[j][i] = 0;
                    }
                }
            }
            return matrix;
        }else
            return null;
    }

    /**
     *
     * @return a list of all the vertices in the graph
     */
    public ArrayList<Vertex> getVertices() {
        return this.vertices;
    }
}

