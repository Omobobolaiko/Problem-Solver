package com.example.problemsolver.framework.graph;
import com.example.problemsolver.framework.problem.Problem;
import com.example.problemsolver.framework.problem.State;
import java.util.List;
import java.util.Stack;
public class GraphCreator {

    private Vertex start;
    Stack stack = new Stack();

    public Graph createGraphFor(Problem problem) {
        graph = new Graph();
        stack = new Stack();
        start = new Vertex (problem.getInitialState());
        stack.push(start);
        List<String> moves = problem.getMover().getMoveNames();
        while ( !stack.isEmpty() ) {
            Vertex u = (Vertex) stack.pop();
            for  (int i = 0; i < moves.size(); i++) {
                State next = problem.getMover().doMove(moves.get(i), (State)u.getData());
                if (next != null) {
                    Vertex v = new Vertex(next);
                    if (graph.getVertices().containsKey(v)) {
                        v = graph.getVertices().get(v);

                    }
                    else {
                        stack.push(v);
                    }
                    graph.addEdge(u,v);



                }
            }
        }

        return graph;
    }

    private Graph graph = null;

}