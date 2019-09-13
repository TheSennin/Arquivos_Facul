package br.univali.kob.grafos;

import java.util.ArrayList;

public class DepthSearch {

    public DepthSearch(){
    }

    public ArrayList<Vertex> search(Graph g, Vertex i, Vertex v, ArrayList<Vertex> path) {
        path.add(i);
        ArrayList<Edge> Edges = i.getEdges();

        for(Edge e : Edges) {
            Vertex v1 = e.getVertex1();
            Vertex v2 = e.getVertex2();

            if(v1.getId().equals(v.getId())) {
                path.add(v1);
                return path;
            }
            if(v2.getId().equals(v.getId())) {
                path.add(v2);
                return path;
            }

            if(!wasVisited(v1, path)) {
                search(g, v1, v, path);
            }
            else {
                if(!wasVisited(v2, path)) {
                    search(g, v2, v, path);
                }
            }
        }
        return path;
    }

    private boolean wasVisited(Vertex v, ArrayList<Vertex> vi) {
        return vi.contains(v);
    }

}
