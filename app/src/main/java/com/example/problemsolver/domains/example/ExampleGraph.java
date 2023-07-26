package com.example.problemsolver.domains.example;
import com.example.problemsolver.framework.graph.Graph;
import com.example.problemsolver.framework.graph.Vertex;

public class ExampleGraph extends Graph {

    public static final Vertex A = new Vertex("A");
    public static final Vertex B = new Vertex("B");
    public static final Vertex C = new Vertex("C");
    public static final Vertex D = new Vertex("D");
    public static final Vertex E = new Vertex("E");

    public ExampleGraph() {
        add(A,B);
        add(A,C);
        add(B,D);
        add(C,E);
        add(D,E);
    }

    private void add(Vertex x, Vertex y) {
        addEdge(x, y);
        addEdge(y, x);
    }
}

