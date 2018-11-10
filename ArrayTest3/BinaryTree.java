package ArrayTest3;

class TreeNode
{
	int key;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(int key)
	    {
		this.key = key;
		this.left = null;
		this.right = null;
	    }
}
public class BinaryTree {
    
    TreeNode root;
    
    public BinaryTree()
    {
	this.root = null;
    }
    public BinaryTree(TreeNode tn)
    {
	this.root = tn;
    }    
    
    public void print(TreeNode tn)
    {
	if(tn!=null)
	{
	    print(tn.left);
	    System.out.println(tn.key);
	    print(tn.right);
	}
    }
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	BinaryTree bt = new BinaryTree();
	
	TreeNode tn = new TreeNode(6);
	tn.left = new TreeNode(5);
	tn.right = new TreeNode(4);
	
	tn.left.left = new TreeNode(9);
	tn.left.right = new TreeNode(8);
	
	bt.print(tn);
	
	
    }
    
}

