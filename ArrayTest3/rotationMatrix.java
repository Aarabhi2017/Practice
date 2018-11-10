package ArrayTest3;

public class rotationMatrix {

    int[][] findRotationMatrix(int[][]matrix)
    {
	if(matrix.length!=matrix[0].length)
	{
	    int n = matrix.length;
	    
	    for(int layer = 0;layer<n/2;layer++)
	    {
		int first = layer;
		int last = n-1-layer;
		
		for(int j = first;j<=last;j++)
		{
		    int offset = j - first;
		    int top = matrix[first][j];
		    
		    matrix[first][j] = matrix[last-offset][first];
		    matrix[last-offset][first] = matrix[last][last-offset];
		    matrix[last][last-offset] = matrix[j][last];
		    matrix[j][last] = top;
		    
		}
	    }
	}
	    return matrix;

    }
    
    public void printMatrix(int[][] result)
    {
	for(int i = 0;i<result.length;i++)
	{
	    for(int j = 0;j<result[0].length;j++)
	    {
		System.out.println(result[i][j]);
	    }
	}
    }
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	rotationMatrix rm = new rotationMatrix();
	int[][] matrix = {{3,14,5,1}
			 ,{1,4,3,1}
			 ,{1,45,2,5}};
	int[][] result = rm.findRotationMatrix(matrix);
	
	rm.printMatrix(result);

    }

}
