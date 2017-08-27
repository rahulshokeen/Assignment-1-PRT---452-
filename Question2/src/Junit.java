import graphc.BFSGraph;
import org.junit.Test;

public class Junit {
	
	@Test
	public void test1(){
		BFSGraph testcase1 = new BFSGraph(4);
	    testcase1.addEdge(0, 1);
	    testcase1.addEdge(0, 2);
	    testcase1.addEdge(1, 2);
	    testcase1.addEdge(2, 0);
	    testcase1.addEdge(2, 3);
	    testcase1.addEdge(3, 3);
		int u = 3;
	    int v = 1;
	    if (testcase1.hasConnection(u, v))
	        System.out.println("Path connected");
	    else
	        System.out.println("Path not connected");;
	}
	// FAILED TEST CASE
	@Test
	public void test2() {
			    
		    int u = 1;
		    int v = 3;
		    BFSGraph testcase2 = new BFSGraph(1);
		    if (testcase2.hasConnection(u, v))
		        System.out.println("Path connected");
		    else
		        System.out.println("Path not connected");;
	}
}
