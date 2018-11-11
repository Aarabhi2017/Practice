import java.util.HashMap;
import java.util.LinkedHashMap;

public class QueryFrequency {

    public static int[] sparseArrays(String[] strings,String[] queries)
    {
	int[] result = new int[queries.length];
	int j = 0;
	LinkedHashMap<String, Integer> hm = new LinkedHashMap<String,Integer>();
	
	for(int i=0;i<queries.length;i++)
	{
	    hm.put(queries[i], 0);
	}
	for(int i=0;i<strings.length;i++)
	{
	    String string = strings[i];
	    if(hm.containsKey(string))
	    {
		int val = hm.get(string);
		val++;
		hm.put(string, val);
	    }
	}
	for(int value:hm.values())
	{
		result[j]=value;
		j++;
	}

	
	return result;
    }
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	String[] strings = {"aba","baba","aba","xzxb"};
	String[] queries = {"aba","xzxb","ab"};
	int[] res = sparseArrays(strings,queries);
	
	for(int i = 0;i<res.length;i++)
	{
	    System.out.println(res[i]);
	}

    }

}
