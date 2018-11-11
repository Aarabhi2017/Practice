public class Codility {

    public static int solution(int[] A) {
        // write your code in Java SE 8
        if(A.length==0) return 1;
        int[] S = new int[1000000+1];
//        for(int i = 0;i<S.length;i++)
//        {
//            S[i] = -1;
//        }
        for(int i = 0;i<A.length;i++)
        {
            if(A[i]>0)
            {
                S[A[i]] = 1;
            }
        }
        for(int i=1;i<S.length;i++)
        {
            if(S[i]==0)
            {
        	return i;
            }
        }
        return -1;
}
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int[] A = {1, 3, 6, 4, 1, 2};
	int[] A1 = {-1,-3};
	int[] A2 = {1,2,3};
	int[] A3 = {6,7,4,8};
	int[] A4 = {2,3,4,6};
	//System.out.println(A3[2]);
//	List<Integer> l = new ArrayList<Integer>();
//	l.add(342);
//	System.out.println(l.get(0));
	System.out.println(solution(A3));
    }

}
