/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univali.kob.GUI;

import java.awt.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Optional;
import java.util.ResourceBundle;

import br.univali.kob.grafos.*;
import edu.uci.ics.jung.algorithms.layout.CircleLayout;
import edu.uci.ics.jung.algorithms.layout.Layout;
import edu.uci.ics.jung.graph.SparseMultigraph;
import edu.uci.ics.jung.graph.util.EdgeType;
import edu.uci.ics.jung.visualization.BasicVisualizationServer;
import edu.uci.ics.jung.visualization.decorators.ToStringLabeller;
import edu.uci.ics.jung.visualization.renderers.Renderer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import javax.swing.*;

/**
 * FXML Controller class
 *
 * @author 6322875
 */
public class GUI implements Initializable {

    @FXML
    private Button btnNewVertex;

    @FXML
    private Button btnNewDirectedEdge;

    @FXML
    private Button btnNewUndirectedEdge;

    @FXML
    private Button btnRemoveVertex;

    @FXML
    private Button btnRemoveEdge;

    @FXML
    private Button btnCheckAdjacency;

    @FXML
    private Button btnCheckEdgeWeight;

    @FXML
    private Button btnCheckEdgeEnd;

    @FXML
    private Button btnPrim;

    @FXML
    private Button btnDepthSearch;

    @FXML
    private Button btnWidthSearch;

    @FXML
    private GridPane adjMatrix;

    @FXML
    private GridPane directedIncidenceMatrix;

    @FXML
    private GridPane undirectedIncidenceMatrix;

    Graph graph = new Graph();
    edu.uci.ics.jung.graph.Graph jGraph = new SparseMultigraph<Vertex, Edge>();

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    public void newVertexAlert(ActionEvent event){
        TextInputDialog id = new TextInputDialog();
        id.setGraphic(null);
        id.setTitle("New Vertex");
        id.setHeaderText(null);
        id.setContentText("Please enter the vertex name (id):");

        Optional<String> result = id.showAndWait();
        if (result.isPresent()){
            graph.addVertex(result.get());
            jGraph.addVertex(graph.getVertex(result.get()).getId());
        }

        loadGraph();

    }

    @FXML
    public void newUndirectedEdgeAlert(ActionEvent event){
            ArrayList<Edge> a = graph.getVertices().get(0).getEdges();
            JFrame frame = null;
            JPanel pane;
            JTextField idField;
            JTextField weightField;
            JTextField v1Field;
            JTextField v2Field;
            String id = null;
            String v1 = null;
            String v2 = null;
            float weight;

            pane = new JPanel();
            pane.setLayout(new GridLayout(0, 2, 2, 2));

            idField = new JTextField(5);
            weightField = new JTextField(5);
            v1Field = new JTextField(5);
            v2Field = new JTextField(5);

            pane.add(new JLabel("Insert new edge id: "));
            pane.add(idField);

            pane.add(new JLabel("Insert new edge weight"));
            pane.add(weightField);

            pane.add(new JLabel("Insert vertex 1"));
            pane.add(v1Field);

            pane.add(new JLabel("Insert vertex 2"));
            pane.add(v2Field);

            int option = JOptionPane.showConfirmDialog(frame, pane, "Please fill all the fields", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

            if (option == JOptionPane.OK_OPTION) {
                id = idField.getText();
                weight = Float.parseFloat(weightField.getText());
                v1 = v1Field.getText();
                v2 = v2Field.getText();

                Vertex vv1 = graph.getVertex(v1);
                Vertex vv2 = graph.getVertex(v2);

                if (vv1 != null && vv2 != null) {
                    graph.addEdge(vv1, vv2, weight, id, Edge.EdgeType.UNDIRECTED);
                    jGraph.addEdge(id, vv1.getId(), vv2.getId(), EdgeType.UNDIRECTED);
                }
        }

        loadGraph();
    }

    @FXML
    public void newDirectedEdgeAlert(ActionEvent event){

        JFrame frame = null;
        JPanel pane;
        JTextField idField;
        JTextField weightField;
        JTextField v1Field;
        JTextField v2Field;
        String id = null;
        String v1 = null;
        String v2 = null;
        float weight;

        pane = new JPanel();
        pane.setLayout(new GridLayout(0, 2, 2, 2));

        idField = new JTextField(5);
        weightField = new JTextField(5);
        v1Field = new JTextField(5);
        v2Field = new JTextField(5);

        pane.add(new JLabel("Insert new edge id: "));
        pane.add(idField);

        pane.add(new JLabel("Insert new edge weight"));
        pane.add(weightField);

        pane.add(new JLabel("Insert vertex 1"));
        pane.add(v1Field);

        pane.add(new JLabel("Insert vertex 2"));
        pane.add(v2Field);

        int option = JOptionPane.showConfirmDialog(frame, pane, "Please fill all the fields", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (option == JOptionPane.OK_OPTION) {
            id = idField.getText();
            weight = Float.parseFloat(weightField.getText());
            v1 = v1Field.getText();
            v2 = v2Field.getText();

            Vertex vv1 = graph.getVertex(v1);
            Vertex vv2 = graph.getVertex(v2);

            if(vv1 != null && vv2 != null) {
                graph.addEdge(vv1, vv2, weight, id, Edge.EdgeType.DIRECTED);
                jGraph.addEdge(id,vv1.getId(),vv2.getId(), EdgeType.DIRECTED);
            }

        }

        loadGraph();
    }

    @FXML
    public void removeVertexAlert(ActionEvent event){
        TextInputDialog id = new TextInputDialog();
        id.setGraphic(null);
        id.setTitle("Remove Vertex");
        id.setHeaderText(null);
        id.setContentText("Please enter the vertex name (id):");

        Optional<String> result = id.showAndWait();
        if (result.isPresent()) {
            Vertex v = graph.getVertex(result.get());
            graph.removeVertex(v.getId());
            jGraph.removeVertex(v.getId());
            loadGraph();
        }
    }

    @FXML
    public void removeEdgeAlert(ActionEvent event){
        TextInputDialog id = new TextInputDialog();
        id.setGraphic(null);
        id.setTitle("Remove Edge");
        id.setHeaderText(null);
        id.setContentText("Please enter the edge name (id):");

        Optional<String> result = id.showAndWait();
        if (result.isPresent()){
            Vertex v1 = graph.getEdge(result.get()).getVertex1();
            Vertex v2 = graph.getEdge(result.get()).getVertex2();

            jGraph.removeEdge(jGraph.findEdge(v1.getId(),v2.getId()));
            graph.removeEdge(result.get());

            loadGraph();
        }
    }

    @FXML
    public void checkAdjacencyAlert(ActionEvent event){
        JFrame frame = null;
        JPanel pane;
        JTextField v1Field;
        JTextField v2Field;
        String v1 = null;
        String v2 = null;

        pane = new JPanel();
        pane.setLayout(new GridLayout(0, 2, 2, 2));

        v1Field = new JTextField(5);
        v2Field = new JTextField(5);

        pane.add(new JLabel("Insert vertex 1"));
        pane.add(v1Field);

        pane.add(new JLabel("Insert vertex 2"));
        pane.add(v2Field);

        int option = JOptionPane.showConfirmDialog(frame, pane, "Please fill all the fields", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (option == JOptionPane.OK_OPTION) {
            v1 = v1Field.getText();
            v2 = v2Field.getText();

            if(v1 != null && v2 != null) {
                if(graph.isAdjacent(v1,v2)){
                    JFrame frame2 = null;
                    JOptionPane.showMessageDialog(frame2, "Vertices are adjacent.");
                }else{
                    JFrame frame2 = null;
                    JOptionPane.showMessageDialog(frame2, "Vertices are not adjacent.");
                }
            }

        }
    }

    @FXML
    public void checkEdgeWeightAlert(ActionEvent event){
        TextInputDialog id = new TextInputDialog();
        id.setGraphic(null);
        id.setTitle("Check Edge Weight");
        id.setHeaderText(null);
        id.setContentText("Please enter the edge name (id):");

        Optional<String> result = id.showAndWait();
        if (result.isPresent()){
            if(graph.getEdge(result.get()) != null) {
                JFrame frame2 = null;
                JOptionPane.showMessageDialog(frame2, "Edge: " + result.get()
                        + "\nWeight: " + graph.getEdgeWeight(result.get()));
            }else{
                JFrame frame2 = null;
                JOptionPane.showMessageDialog(frame2, "Edge Not Found!");
            }
        }
    }

    @FXML
    public void checkEdgeExtremitiesAlert(ActionEvent event){
        TextInputDialog id = new TextInputDialog();
        id.setGraphic(null);
        id.setTitle("Check Edge Extremities");
        id.setHeaderText(null);
        id.setContentText("Please enter the edge name (id):");

        Optional<String> result = id.showAndWait();
        if (result.isPresent()){
            if(graph.getEdge(result.get()) != null) {
                Vertex v1 = graph.getEdge(result.get()).getVertex1();
                Vertex v2 = graph.getEdge(result.get()).getVertex2();
                JFrame frame2 = null;
                JOptionPane.showMessageDialog(frame2, "Extremity vertex 1: " + v1.getId() +
                        "\nExtremity vertex 2: " + v2.getId());
            }else{
                JFrame frame2 = null;
                JOptionPane.showMessageDialog(frame2, "Edge Not Found!");
            }
        }
    }

    public void loadGraph(){

        Layout<Integer, String> layout = new CircleLayout(jGraph);
        layout.setSize(new Dimension(300,300)); // sets the initial size of the space
        // The BasicVisualizationServer<V,E> is parameterized by the edge types
        BasicVisualizationServer<Integer,String> vv =
                new BasicVisualizationServer<Integer,String>(layout);
        vv.setPreferredSize(new Dimension(350,350)); //Sets the viewing area size

        vv.getRenderContext().setVertexLabelTransformer(new ToStringLabeller());
        vv.getRenderContext().setEdgeLabelTransformer(new ToStringLabeller());
        vv.getRenderer().getVertexLabelRenderer().setPosition(Renderer.VertexLabel.Position.CNTR);

        JFrame frame = new JFrame("Graph View");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().add(vv);
        frame.pack();
        frame.setVisible(true);

        loadAdjacencyMatrix();
        loadDirectedIncidenceMatrix();
        loadUndirectedIncidenceMatrix();
    }

    public void loadAdjacencyMatrix() {
        int[][] aMatrix = graph.generateAdjacencyMatrix();
        int SIZE = graph.getVertices().size();
        int length = SIZE;
        int width = SIZE;
        adjMatrix.getChildren().clear();

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                // Create a new TextField in each Iteration
                TextField tf = new TextField();
                tf.setPrefHeight(20);
                tf.setPrefWidth(25);
                tf.setEditable(false);
                tf.setText(Integer.toString(aMatrix[i][j]));

                // Iterate the Index using the loops
                adjMatrix.setRowIndex(tf,i);
                adjMatrix.setColumnIndex(tf,j);
                adjMatrix.getChildren().add(tf);
            }
        }
    }

    public void loadDirectedIncidenceMatrix() {
        int[][] aMatrix = graph.generateDirectedEdgeIncidenceMatrix();
        directedIncidenceMatrix.getChildren().clear();
        if(aMatrix != null) {
            int width = graph.getVertices().size();
            int length = graph.getAllEdges().size();
            directedIncidenceMatrix.getChildren().clear();

            for (int i = 0; i < length; i++) {
                for (int j = 0; j < width; j++) {
                    // Create a new TextField in each Iteration
                    TextField tf = new TextField();
                    tf.setPrefHeight(20);
                    tf.setPrefWidth(25);
                    tf.setEditable(false);
                    tf.setText(Integer.toString(aMatrix[j][i]));

                    directedIncidenceMatrix.setRowIndex(tf, j);
                    directedIncidenceMatrix.setColumnIndex(tf, i);
                    directedIncidenceMatrix.getChildren().add(tf);
                }
            }
        }
    }

    public void loadUndirectedIncidenceMatrix() {
        int[][] aMatrix = graph.generateUndirectedEdgeIncidenceMatrix();
        undirectedIncidenceMatrix.getChildren().clear();
        if(aMatrix != null) {
            int width = graph.getVertices().size();
            int length = graph.getAllEdges().size();

            for (int i = 0; i < length; i++) {
                for (int j = 0; j < width; j++) {
                    // Create a new TextField in each Iteration
                    TextField tf = new TextField();
                    tf.setPrefHeight(20);
                    tf.setPrefWidth(25);
                    tf.setEditable(false);
                    tf.setText(Integer.toString(aMatrix[j][i]));

                    undirectedIncidenceMatrix.setRowIndex(tf, j);
                    undirectedIncidenceMatrix.setColumnIndex(tf, i);
                    undirectedIncidenceMatrix.getChildren().add(tf);
                }
            }
        }
    }

    @FXML
    private void depthSearchAlert() {
        JFrame frame = null;
        JPanel pane;
        JTextField v1Field;
        JTextField v2Field;
        String v1 = null;
        String v2 = null;

        pane = new JPanel();
        pane.setLayout(new GridLayout(0, 2, 2, 2));

        v1Field = new JTextField(5);
        v2Field = new JTextField(5);

        pane.add(new JLabel("Insert the initial vertex name (id):"));
        pane.add(v1Field);

        pane.add(new JLabel("Insert the vertex to be search (id):"));
        pane.add(v2Field);

        int option = JOptionPane.showConfirmDialog(frame, pane, "Please fill all the fields", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (option == JOptionPane.OK_OPTION) {
            v1 = v1Field.getText();
            v2 = v2Field.getText();

            if (v1 != null && v2 != null) {
                    Vertex vv1 = graph.getVertex(v1);
                    Vertex vv2 = graph.getVertex(v2);
                    ArrayList<Vertex> v = new ArrayList<>();
                    DepthSearch d = new DepthSearch();

                    v = d.search(graph, vv1, vv2, v);
                    JFrame frame2 = null;
                    String output = "";
                    for(Vertex vertices : v)
                        output+= vertices.getId() + " , ";
                    JOptionPane.showMessageDialog(frame2, "Found Vertices: " + output);
            }

        }
    }
}
