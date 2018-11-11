import java.util.ArrayList;
import java.util.List;

public class RotationOfAMatrix {
    static List<List<Integer>> matrixRotation(List<List<Integer>> matrix, int r) {
        //elements moving left and up decrease in row and column respectively.
        //elements moving right and down increase in row and column respectively.
	List<List<Integer>> Resmatrix = new ArrayList<List<Integer>>();
        int lastRowIndex = matrix.get(0).size();
        int lastColIndex = matrix.size();

        int firstRowIndex = 0;
        int firstColIndex = 0;
        
        int prev = 0;
        int curr = 0;
        int count = 1;
                
        while(firstRowIndex<lastRowIndex&&firstColIndex<lastColIndex&&count<r)
        {
            prev = matrix.get(firstRowIndex).get(firstColIndex);
            //Top row moves right
            for(int i = firstColIndex+1;i<lastColIndex;i++)
            {
        	List<Integer> thatRow = matrix.get(firstRowIndex);
                curr = (int) thatRow.get(i);
                thatRow.set(i, prev);
                prev = curr;
                matrix.set(firstRowIndex, thatRow);
            }
            lastColIndex--;
            //Right Column moves down
            for(int i = firstRowIndex+1;i<lastRowIndex;i++)
            {
        	List<Integer> thatRow = matrix.get(i);
                curr = (int) thatRow.get(lastColIndex);
                thatRow.set(lastColIndex, prev);
                prev = curr;
                matrix.set(i, thatRow);
            }
                                             
            lastRowIndex--;
            //Botton row moves left
            for(int i =lastColIndex-1;i>=firstColIndex;i--)
            {
        	List<Integer> thatRow = matrix.get(lastRowIndex);
                curr = (int) thatRow.get(i);
                thatRow.set(i, prev);
                prev = curr;
                matrix.set(lastRowIndex, thatRow);                
            }
            //Left Column moves up
            for(int i = lastRowIndex-1;i>=firstRowIndex;i--)
            {
        	List<Integer> thatRow = matrix.get(i);
                curr = (int) thatRow.get(firstColIndex);
                thatRow.set(firstColIndex, prev);
                prev = curr;
                matrix.set(i, thatRow);  
            } 
            firstRowIndex++;
            firstColIndex++;
            count++;
        }
        return matrix;
        }
               public List<List<Integer>> setMatrix(int r,int c)
        {
            List<List<Integer>> matrix = new ArrayList<List<Integer>>(r); 
            List<Integer> matrixElements ;
    	    int m = 1;
            for( int i = 0;i<r;i++)
            {
        	matrixElements = new ArrayList<Integer>(c);
        	for(int j = 0;j<c;j++)
                {
                    matrixElements.add(m);
                    m++;
                }
        	matrix.add(matrixElements);
            }
            return matrix;
        }
        public void printMatrix(List<List<Integer>>matrix)
        {
            int c = matrix.get(0).size();
            int r = matrix.size();
            
            if(!matrix.isEmpty())
            {
        	for(int i = 0;i<r;i++)
        	{
        	    for(int j = 0;j<c;j++)
        	    {
                 	   System.out.print(matrix.get(i).get(j)+" ");
        	    }
        	    System.out.println("\t");
        	}
            }
        }
        public static void main(String[] args)
        {
          RotationOfAMatrix rtm = new RotationOfAMatrix();
          List<List<Integer>>matrix = rtm.setMatrix(4, 4);
          rtm.printMatrix(matrix);
          System.out.println("\nNEW ONE\n");
          matrixRotation(matrix, 4);          
          rtm.printMatrix(matrixRotation(matrix, 4));
        }	
    

    

}
