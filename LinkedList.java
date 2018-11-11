
public class LinkedList {

    Node head;
    static class Node
    {
	int data;
	Node next;
	
       public Node(int d)
       {
	   this.data = d;
	   this.next = null;
       }
    }
    
    public void printList()
    {
	Node n = head;
	while(n!=null)
	{
	    //System.out.print(n.data+"  ");
	    n = n.next;
	}
    }
    
    void print(Node n)
    { 
    	Node current = n;
    	Node prev = n;

    	while(n!=null)
    	{
       		prev = current;
       		current = n;
       		n = n.next;
    	
       		//System.out.println(prev.data+","+current.data);
    	}
    }
    
    Node partition(int p,Node n)
    {
	if(n==null) return null;
	
	Node temp = n;
	
	while(temp.next!=null)
	{
	    temp = temp.next;
	}
	Node tail = temp;
	Node curr = n,prev = n,head = n;
	Node temp1 = null;
	
	while(n!=null)
	{
	    System.out.println(n.data);
	    prev = curr;
	    curr = n;
	    
	    if(curr.data>=p)
	    {		
		
		 tail.next = curr;
		 tail = curr; 
		 
		//Remove Node
		if(curr==head)
		{
		   head = curr.next; 
		   n = prev.next;
		}		    
		else
		{
		    prev.next = curr.next;
		    n = prev;
		}
		tail.next = null;
		curr = n;
	    }
	    else
	    {
		n = n.next;
	    }
	    System.gc();
	}
	
	return n;
    }
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	LinkedList list = new LinkedList();
	list.head = new Node(3);
	Node new1 = new Node(5);
	Node new2 = new Node(8);
	Node new3 = new Node(5);
	Node new4 = new Node(10);
	Node new5 = new Node(2);
	Node new6 = new Node(1);
		
	list.head.next = new1;
	new1.next = new2;
	new2.next = new3;
	new3.next = new4;
	new4.next = new5;
	new5.next = new6;

	list.printList(); 
	list.print(list.head);
	System.out.println(list.partition(5, list.head).data);
    }

}
