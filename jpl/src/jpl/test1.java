package jpl;
import java.util.*;
import org.jpl7.*;

public class test1 {

	public static void main(String[] args) {
		String t1="consult('test.pl')";
		
		Query q =new Query(t1);
		
		System.out.println(t1+" "+(q.hasSolution()?"sucess":"fail"));
		
		String t2="likes(X,Y)";
		
		Query q2 =new Query(t2);
		
		while(q2.hasMoreSolutions())
		{
			Map<String,Term> s4=q2.nextSolution();
			
		}
	}

}
