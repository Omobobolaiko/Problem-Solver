package com.example.problemsolver.framework.solution;
import com.example.problemsolver.framework.graph.Vertex;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

/**
 *
 * @author Omobobola Ikotun
 */
public class Solution implements Iterator<Vertex> {

    /**
     * Creates an object that represents a path from a start
     * vertex to an end vertex in a problem solving domain.
     * This constructor will be called after a search has been
     * initiated on the start vertex.
     * If a path from start to end exists, it can be constructed
     * from the predecessor information stored in the end vertex.
     * @param start the start vertex
     * @param end the end vertex
     */
    public Solution(Vertex start, Vertex end) {
        while ( end.getPredecessor() != null)
        {
            stack.push(end);
            end = end.getPredecessor();

        }
        stack.push(start);
    }

    /**
     * Gets the length of the solution.
     * This is the number of moves in the solution, not the
     * number of vertices.
     * @return the solution length
     */
    public int getLength() {

        System.out.println(stack.size()-1);
        return stack.size()-1;
    }

    /**
     * Checks whether there are more vertices in this solution.
     * @return true if there are more vertices in this solution, false
     * otherwise
     */
    @Override
    public boolean hasNext() {

        return !stack.isEmpty();

    }

    /**
     * Removes and returns the next vertex in this solution.
     * @return the next vertex in this solution
     * @throws RuntimeException if there are no more vertices
     */
    @Override
    public Vertex next() {

        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        //int next = 0;
        //stack.pop(next);
        Vertex next = stack.pop();
        return next;



    }



    // Private instance fields here
    Stack<Vertex> stack = new Stack<Vertex>();


    private int count;

}
