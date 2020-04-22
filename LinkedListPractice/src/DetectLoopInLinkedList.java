import java.util.HashSet;

public class DetectLoopInLinkedList {
	
	
	public boolean detectLoop(Node node)
	{
		HashSet<Node> hashSet = new HashSet<>();
		while(hashSet!= null)
		{
			if(hashSet.contains(node))
			
				return true;
				hashSet.add(node);
				node = node.next;
				
		}
		return false;
		
	}
	
	public static void main(String args[])
	{
		LinkedList llist = new LinkedList(); 
		  
        llist.insert(llist, 20); 
        llist.insert(llist, 4); 
        llist.insert(llist, 15); 
        llist.insert(llist, 10); 
        System.out.println();
        
	}
	

}
