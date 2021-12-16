import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int R = in.nextInt();
        int V = in.nextInt();
        ArrayList<Integer> robber = new ArrayList<Integer>(R);
        int time = 0;
        int result;
        for(int i = 0; i< R; i++){
            robber.add(0);
        }
        for (int i = 0; i < V; i++) {
            int C = in.nextInt();
            int N = in.nextInt();
            time = robber.get(0)+(int)(Math.pow(10,N) * Math.pow(5, C-N));
            robber.set(0,time);
            Collections.sort(robber);
        }
        result = robber.get(robber.size()-1);


        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(result);
    }
}