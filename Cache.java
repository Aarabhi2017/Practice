import java.util.HashMap;

public class Cache {
    
    Node head;
    Node tail;
    int length;
    int MAX_LENGTH = 10;
    HashMap<String,Node> hm = new HashMap<String,Node>();
    static class Node{
	Node next;
	Node prev;
	String[] results;
	String query;
	
    public Node(String q,String[] r)
    {
	this.query = q;
	this.results = r;
    }
    }
    public void moveToFront(Node n)
    {
	if(n==null)return;
	
	if(n==head) return;
	
	else
	{
	    removeNode(n);
	    n.next = head;
	    if(head!=null)
	    {
		head.prev = n;
	    }
	    head = n;
	    length++;
	}
	if(tail==null) tail = n;
    }
    public void removeNode(Node n)
    {
	if(n==null) return;
	if(n==head) head = n.next;
	if(n==tail) tail= n.prev;
	if(n.next!=null||n.prev!=null)
	    length--;
	
	Node next = n.next;
	Node prev = n.prev;
	
	if(next!=null)
	    next.prev = prev;
	
	if(prev!=null)
	    prev.next = next;
	
	n.next = null;
	n.prev = null;	   
    }
    public String[] getResults(String query)
    {
	if(query==null) return null;
	Node n = null;
	if(hm.containsKey(query))
	{
	    n = hm.get(query);
	}
	moveToFront(n);
	if(n==null)return null;
	return n.results;
    }
    public void insertValuesIntoKey(String query,String[]results)
    {
	Node n = null;
	if(hm.containsKey(query))
	{
	    n = hm.get(query);
	    n.results = results;
	    moveToFront(n);
	    return;
	}
	else
	{
	    n = new Node(query,results);
	    moveToFront(n);
	    hm.put(query, n);
	}
	if(length>MAX_LENGTH)
	{
	    hm.remove(tail.query);
	    removeNode(tail);
	}
    }
    
	public static String[] generateResults(int i) {
		String[] results =  {"resultA" + i, "resultB" + i, "resultC" + i};
		return results;
	}
	
	public static void main(String[] args) {
		Cache cache = new Cache();
		for (int i = 0; i < 20; i++) {
			String query = "query" + i;
			cache.insertValuesIntoKey(query, generateResults(i));
			if (i == 9 || i == 16 || i == 19) {
				cache.getResults("query" + 2);
				cache.getResults("query" + 6);
				cache.getResults("query" + 9);
			}
		}
		
		for (int i = 0; i < 30; i++) {
			String query = "query" + i;
			String[] results = cache.getResults(query);
			System.out.print(query + ": ");
			if (results == null) {
				System.out.print("null");
			} else {
				for (String s : results) {
					System.out.print(s + ", ");
				}
			}
			System.out.println("");
		}		
	}
    }

