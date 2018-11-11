
public class SumLinkedList {

    LinkedNode head;
     
    static class LinkedNode
    {
    	int data;
    	LinkedNode next;
    	
       public LinkedNode(int d)
       {
    	   this.data = d;
    	   this.next = null;
       }
       public LinkedNode()
       {
    	   this.next = null;
       }
       
    }
    
    static LinkedNode sumLinkedList(LinkedNode n,LinkedNode m)
    {
	LinkedNode temp = new LinkedNode(0);
	LinkedNode head = n;
	LinkedNode freshList = new LinkedNode();
	LinkedNode result = freshList;
	
	if(n==null) return m;
	if(m==null) return n;
	
	int nlen = findLength(n);
	int mlen = findLength(m);
	int resLength = nlen;
	int s = 0;

	if(nlen>mlen)
	{
	    resLength = nlen; 
	    head = m;
	}
	if(nlen!=mlen)
	{
	    
	}
	
	while(n!=null && m!=null)
	{	    
	    //System.out.println("S"+s);  
	    int n1 = n.data+m.data+s;

	    if(n1>9)
	    {
		result.data = n1%10;	
	    }
	    else
	    {
		result.data = n1;
	    }
	    s = n1/10;
	    
	    result.next = new LinkedNode();
	    result = result.next;	    
	    n = n.next;
	    m = m.next;
	}
	
	return freshList ;
    }
    private static int findLength(LinkedNode res) {
	int size = 0;
	while(res!=null)
	{
	    res = res.next;
	    size++;
	}
	return size;
    }
     static void printList(LinkedNode freshList)
    {
	LinkedNode n = freshList;
	while(n!=null)
	{
	    System.out.print(n.data+"--->");
	    n = n.next;
	}
    }
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	SumLinkedList list = new SumLinkedList();
	SumLinkedList list1 = new SumLinkedList();

	list.head = new LinkedNode(5);		
	LinkedNode new1 = new LinkedNode(1);
	LinkedNode new2 = new LinkedNode(6);
	
	list1.head = new LinkedNode(5);
	LinkedNode new3 = new LinkedNode(2);	
	LinkedNode new4 = new LinkedNode(3);
	
//	LinkedNode new5 = new LinkedNode(2);
//	LinkedNode new6 = new LinkedNode(1);
	
	list.head.next = new1;
	new1.next = new2;
	new3.next = new4;
	
	list1.head.next = new3;
//	new4.next = new5;
//	new5.next = new6;
	
	 
	printList(sumLinkedList(list.head,list1.head));
		

    }
    

}
