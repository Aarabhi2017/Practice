import java.util.Stack;

public class LinkedListIntersection {

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
    static class Result
    {
	public Node tail = null;
	public int length = 0;
	
	public Result(int length,Node tail)
	{
	    this.tail = tail;
	    this.length = length;
	}
    }
    //Stack method
    public static boolean palindrome(Node a)
    {
	if(a==null)return false;
	
	Node head = a;
	Stack<Integer> stack = new Stack<Integer>();
	
	Node frunner = head;
	Node srunner = head;
	
	while(frunner!=null&&frunner.next!=null)
	{
	    System.out.println(frunner.data);
	    stack.push(srunner.data);
	    frunner = frunner.next.next;
	    srunner = srunner.next;
	}
	
	//Odd Numbers Cases, skip the mid point
	if(frunner!=null)
	{
	    srunner = srunner.next;
	}
	while(srunner.next!=null)
	{
	    if(srunner.data!=stack.pop())
	    {
		return false;
	    }
	    srunner = srunner.next;
	}
	
	return true;
    }
    public static boolean intersect (Node n,Node m)
    {
	int resLength = 0;
	Node a = n;
	Node b = m;
	boolean flag;
	
	if(a==null||b==null) return false;
	
	Result r1 = findLengthAndTail(a);
	Result r2 = findLengthAndTail(b);
	
	if(r1.tail!=r2.tail)
	    return false;
	
	if(r1.length>r2.length)
	{
	    resLength = r1.length-r2.length;
	    a = findkthNode(resLength,a);
	}
	else if(r1.length<r2.length)
	{
	    resLength = r2.length-r1.length;
	    b = findkthNode(resLength,b);
	}
	
	while(a!=null&&b!=null)
	{
	    if(a!=b)
		flag = false;
	    else
	    {
		System.out.println("Intersection value:"+a.data);
		flag = true;
		return flag;
	    }
	    a = a.next;
	    b = b.next;
	}
	
	return false;
    }
    public static Node findkthNode(int length,Node node)
    {
	Node h = node;
	if(length==0) return null;
	
	while(length>=1 && h!=null)
	{
	    h = h.next;
	    length--;
	}
	return h;
    }
    public static Result findLengthAndTail(Node a)
    {
	int length = 1;
	while(a.next!=null)
	{
	    length++;
	    a = a.next;
	}
	return new Result(length,a);
    }
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	LinkedListIntersection list = new LinkedListIntersection();
	LinkedListIntersection list1 = new LinkedListIntersection();

	list.head = new Node(3);		
	Node new1 = new Node(1);
	Node new2 = new Node(1);
	Node new3 = new Node(3);
	Node new4 = new Node(3);
	
	list.head.next = new1;
	new1.next = new2;
	new2.next = new3;
	new3.next = new4;
	
	list1.head = new Node(4);
	Node new5 = new Node(6);
	
	list1.head.next = new5;

	Node commonNode1 = new Node(7);
	Node commonNode2 = new Node(2);
	Node commonNode3 = new Node(3);
		
	new3.next = commonNode1;
	new5.next = commonNode1;
	
	commonNode1.next = commonNode2;
	commonNode2.next = commonNode3;
	
	LinkedListIntersection list3 = new LinkedListIntersection();
	list3.head = new Node(6);
	Node new6 = new Node(2);
	Node new7 = new Node(3);
	Node new8 = new Node(2);
	Node new9 = new Node(6);
	
	list3.head.next = new6;
	new6.next = new7;
	new7.next = new8;
	new8.next = new9;
	
	//System.out.println(intersect(list.head,list1.head));
	System.out.println(palindrome(list3.head));
	
    }

}
