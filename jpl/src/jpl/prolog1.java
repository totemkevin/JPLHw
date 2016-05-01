package jpl;

import java.util.Map;
import java.util.Set;

import org.jpl7.Query;
import org.jpl7.Term;

public class prolog1 {
	public String link()
	{
		String t1 = "consult('test.pl')";
	    Query q1 = new Query(t1);
	    
	    String linkMsg =q1.hasSolution() ? "連結成功" : "連結失敗";
	    
	    return linkMsg;
	}
	
	public String run(String input)
	{
		String t2 = input;//"likes(X, Y)"
	    Query q2 = new Query(t2);
	    
	    String tmp="";
	    
	     while ( q2.hasMoreSolutions() ){
	    	Map<String, Term> s4= q2.nextSolution();
	    	Set <String> s = s4.keySet();
	    	
	        tmp+= "X = " + s4.get("X") +" ";
	        tmp+= "Y = " + s4.get("Y") + "\n";
	     }
	     return tmp;
	}
}
