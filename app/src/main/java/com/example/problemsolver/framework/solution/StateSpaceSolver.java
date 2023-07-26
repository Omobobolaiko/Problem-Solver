package com.example.problemsolver.framework.solution;
import com.example.problemsolver.framework.graph.Vertex;
import com.example.problemsolver.framework.problem.Mover;
import com.example.problemsolver.framework.problem.Problem;
import com.example.problemsolver.framework.problem.State;
import java.util.LinkedList;
import java.util.List;

/**
 * This class represents a state space solver by extending the abstract
 * Solver class.
 * @author Your name and section here
 */
public abstract class StateSpaceSolver extends Solver {

    /**
     * Creates a BFS or DFS state space solver.
     * This constructor should set the queue to a double-ended queue
     * (DEQUE) like the GraphSolver.
     * @param problem the problem being solved
     */
    public StateSpaceSolver(Problem problem) {
        super(problem);
        super.setQueue(new LinkedList<>());
    }

    /**
     * This method implements the expand operation required by the
     * state space search algorithm.
     * @param u the vertex being expanded
     * @return the children of u in the state space search tree
     */
    @Override
    public List<Vertex> expand(Vertex u) {

        List<Vertex>children = new LinkedList<>();
        Mover thisMover = this.getProblem().getMover();
        List<String> moves = thisMover.getMoveNames();
        for(String i:moves)
        {
            Vertex next = new Vertex(thisMover.doMove(i, (State) u.getData()));

            if(next.getData() != null && !occursOnPath((Vertex) next, u)) {
                next.setDistance(u.getDistance()+1);
                next.setPredecessor(u);
                children.add((Vertex) next);
            }
        }
        return children;

    }

    public static boolean occursOnPath(Vertex v, Vertex ancestor) {
        Vertex s = ancestor;
        while(s!= null){
            if(s.equals(v)) {
                s= s.getPredecessor();
                return true;
            }
            else {
                return false;
            }
        }
        return false;
    }








}

