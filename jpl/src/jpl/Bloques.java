package jpl;

import java.util.*;
import org.jpl7.*;
import org.jpl7.Query;

public class Bloques {
	public static void main( String argv[] ){
        String t1 = "consult('test.pl')";
        Query q1 = new Query(t1);
        System.out.println( t1 + " " + (q1.hasSolution() ? "連結成功" : "連結失敗"+ " ") );
        String t2 = "likes(X, Y)";
        Query q2 = new Query(t2);
         while ( q2.hasMoreSolutions() ){
        	Map<String, Term> s4= q2.nextSolution();
        	Set <String> s = s4.keySet();
            System.out.println( "X = " + s4.get("X"));
            System.out.println( "Y = " + s4.get("Y"));
        }
   }
}
 