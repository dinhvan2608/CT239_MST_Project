package com.mst.models;

import javafx.scene.control.Label;
import javafx.scene.shape.Line;

public class Edge {
    private Vertex startVertex;
    private Vertex endVertex;
    private int weight;

    private Label weightLabel;
    private Line lineEdge;

    public Edge() {
        this.startVertex = new Vertex();
        this.endVertex = new Vertex();
        this.weight = 1;
        this.weightLabel = new Label("1");
        this.lineEdge = new Line();
    }

    public Edge(Vertex startVertex, Vertex endVertex, int weight) {
        this.startVertex = startVertex;
        this.endVertex = endVertex;
        this.weight = weight;
        this.weightLabel = new Label(String.valueOf(weight));
    }

    public Edge(Edge edge) {
        this.startVertex = edge.getStartVertex();
        this.endVertex = edge.getEndVertex();
        this.weight = edge.getWeight();
        this.weightLabel = edge.getWeightLabel();
        this.lineEdge = edge.getLineEdge();
    }

    public Vertex getStartVertex() {
        return startVertex;
    }

    public void setStartVertex(Vertex startVertex) {
        this.startVertex = startVertex;
    }

    public Vertex getEndVertex() {
        return endVertex;
    }

    public void setEndVertex(Vertex endVertex) {
        this.endVertex = endVertex;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Label getWeightLabel() {
        return weightLabel;
    }

    public void setWeightLabel(Label weightLabel) {
        this.weightLabel = weightLabel;
    }

    public Line getLineEdge() {
        return lineEdge;
    }

    public void setLineEdge(Line lineEdge) {
        this.lineEdge = lineEdge;
    }

    public Vertex getOppositeVertex(Vertex vertex) {
        if (vertex == this.startVertex) {
            return this.endVertex;
        } else if (vertex == this.endVertex) {
            return this.startVertex;
        }
        return null;
    }

    @Override
    public String toString() {
        return "Edge{" +
                "startVertex=" + startVertex +
                ", endVertex=" + endVertex +
                ", weight=" + weight +
                ", weightLabel=" + weightLabel +
                ", lineEdge=" + lineEdge +
                '}';
    }
}
