package com.example.problemsolver.domains.arithmetic;
import com.example.problemsolver.framework.problem.State;
import java.util.Objects;
import java.util.stream.Stream;
public class ArithmeticState extends State{

    public ArithmeticState(int contents) {
        this.contents = contents ;
    }
    @Override
    public boolean equals (Object other) {
        ArithmeticState otherArithmetic = (ArithmeticState) other;
        if (otherArithmetic.contents == this.contents) {
            return true;
        }  else {
            return false;
        }

    }// end equal
    public int getContents() {
        return contents;
    }

    @Override

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append ("The value is: ").append(this.contents);
        return sb.toString();
    }

    private final int  contents;
    private static final String NEW_LINE = "\n";
}

