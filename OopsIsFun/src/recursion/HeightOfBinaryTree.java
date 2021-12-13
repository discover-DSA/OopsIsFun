package recursion;
//import java.util.Scanner;

class Node{
	int data;
	Node left, right;
	
	Node(int item)
	{
		data=item;
		left=right=null;
	}
}	
public class HeightOfBinaryTree {
	
	Node root;
	
	int maxDepth(Node node)
	{
		int ldepth=0;
		int rdepth=0;
		if(node==null)
			return -1;
		else
		{
		     ldepth=maxDepth(node.left);
			 rdepth=maxDepth(node.right);
			
			
		}
		
		return 1+ Math.max(ldepth, rdepth);
		
	}

	public static void main(String[] args) {
		
		HeightOfBinaryTree BT = new HeightOfBinaryTree();
		BT.root = new Node(1);
		BT.root.left=new Node(2);
		BT.root.right=new Node(3);
		BT.root.left.left=new Node(4);
		BT.root.left.right=new Node(5);
		
		System.out.println("Height of Tree is "+BT.maxDepth(BT.root));
		
	}

}
