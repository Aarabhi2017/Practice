package ArrayTest3;

public class ColumnsRows7 {

    void setrowsColumns(int[][]matrix)
    {
	if(matrix.length<0||matrix[0].length<0)
	    System.out.println("EMPTY MATRIX");
	
	boolean[]rows = new boolean[matrix.length];
	boolean[]columns = new boolean[matrix[0].length];
	
	for(int i = 0;i<matrix.length;i++)
	{
	    for(int j = 0;j<matrix[0].length;j++)
	    {
		if(matrix[i][j]%7==0)
		{
		    rows[i]=true;
		    columns[j]=true;
		}
	    }
	}
	
	for(int i=0;i<rows.length;i++)
	{
	    if(rows[i])
	    {
		nullifyRows(i,matrix);
	    }
	}
	
	for(int j=0;j<columns.length;j++)
	{
	    if(columns[j])
	    {
		nullifyColumns(j,matrix);
	    }
	}
	
	for(int i = 0;i<matrix.length;i++)
	    for(int j = 0;j<matrix[0].length;j++)
		System.out.println(matrix[i][j]);
	
    }
    
    public void nullifyRows(int rows, int[][]matrix)
    {
	for(int i = 0;i<matrix[0].length;i++)
	{
	    matrix[rows][i] = 7;
	}
    }
    
    public void nullifyColumns(int columns, int[][]matrix)
    {
	for(int i = 0;i<matrix.length;i++)
	{
	    matrix[i][columns] = 7;
	}
    }
    
    
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	ColumnsRows7 cr7 = new ColumnsRows7();
	int[][]matrix = {{3,14,5,1}
			,{1,4,3,1}
			,{1,45,2,5}
			,{5,6,22,55}};
	cr7.setrowsColumns(matrix);
    }

}
