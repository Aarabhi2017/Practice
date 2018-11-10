package ArraysTest2;
class Node
{
	int data;
	Node next;
	
	public Node(int data)
	{
	    this.data = data;
	    this.next = null;
	}
}
public class LinkedList {

    Node header;
    
    void insert(Node node)
    {
	if(node!=null)
	{
	    if(header==null)
	    {
		header = node;
	    }
	    	
	    else
	    {
		Node last = header;
		while(last.next!=null)
		{
		    last = last.next;
		}
		last.next = node;
	    }
	}
}
    
    
    void print(Node n)
    {
	while(n!=null)
	{
	    System.out.println(n.data);
	    n = n.next;
	}
    }
    
    
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	LinkedList ls = new LinkedList();
	ls.insert(new Node(23));
	ls.insert(new Node(22));
	ls.insert(new Node(24));

	ls.print(ls.header);
    }

}
