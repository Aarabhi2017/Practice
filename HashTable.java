import java.util.ArrayList;

public class HashTable<K, V> {

    private static class LinkedListNode<K,V>
    {
	private K key;
	private V value;
	private LinkedListNode<K,V> prev;
	private LinkedListNode<K,V> next;
	
	public LinkedListNode(K key,V value)
	{
	    this.key = key;
	    this.value = value;
	}
    }
    public HashTable(int capacity)
    {
	arr = new ArrayList<LinkedListNode<K,V>>();
	for(int i = 0;i<capacity;i++)
	{
	    arr.add(null);
	}
    }
    private ArrayList<LinkedListNode<K,V>> arr;
    
    public int getIndexForKey(K key)
    {
	if(key==null) return 0;
	return key.hashCode()%arr.size();
    }
    public LinkedListNode<K,V> getNodeForKey(K key)
    {
	if(key==null) return null;
	
	int index = getIndexForKey(key);
	LinkedListNode<K,V>head = arr.get(index); 
	while(head!=null)
	{
	    if(head.key==key)
	    {
		return head;
	    }
	    head = head.next;
	}
	return null;
    }
    public void put(K key,V value) 
    {
	LinkedListNode<K,V> node = getNodeForKey(key);
	int index = 0;
	if(node!=null)
	{
	    node.value = value;
	}
	else
	{
	    node = new LinkedListNode<K,V>(key,value);
	    index = getIndexForKey(key);
	    if(arr.get(index)!=null)
	    {
		node.next = arr.get(index);
		node.next.prev = node;
	    }
	}
	arr.set(index, node);
	
    }    
    public V getValue(K key)
    {
	if(key==null) return null;
	
	LinkedListNode<K,V> node = getNodeForKey(key);
	while(node!=null)
	{
	    if(node.key==key)
	    {
		return node.value;
	    }
	    node = node.next;
	}
	return null;
    }
    public void removeKey(K key)
    {
	LinkedListNode<K,V> node = getNodeForKey(key);
	if(node.prev!=null)
	{
	     node.prev.next = node.next;
	}
	else
	{ //Head node
	    int index = getIndexForKey(key);
	    arr.set(index, node.next);
	}
	if(node.next!=null)
	{
	    node.next.prev = node.prev;
	}
    }
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	HashTable<Integer, String> ht = new HashTable<Integer, String>(5);
	ht.put(23, "Twenty-Three");
	ht.put(24, "Twenty-Four");
	ht.put(25, "Twenty-Five");
	ht.put(26, "Twenty-Six");
	ht.put(27, "Twenty-Seven");
	System.out.println(ht.getValue(25));
	ht.removeKey(26);
	System.out.println(ht.getValue(26));
    }

}
