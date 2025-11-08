/*A binary tree is uni-valued if every node in the tree has the same value.
Given the root of a binary tree, return true if the given tree is uni-valued, or false otherwise.
Example 1:
Input: root = [1,1,1,1,1,null,1]
Output: true
Example 2:
Input: root = [2,2,2,5,2]
Output: false*/
import java.util.*;
class TreeNode{
	int val;
	TreeNode left,right;
	TreeNode(int val){
		this.val=val;
		left=right=null;
	}
}
class UnivaluedBinaryTree{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Integer[] arr=new Integer[n];
		for(int i=0;i<n;i++){
			String tok=sc.next();
			if(tok.equalsIgnoreCase("null")) arr[i]=null;
			else{
				try{ 
					arr[i]=Integer.parseInt(tok);
				}catch(NumberFormatException e){
					arr[i]=null;
				}
			}
		}
		TreeNode root=buildFromArrayIterative(arr);
		System.out.print(isUnivalued(root));
	}
	public static TreeNode buildFromArrayIterative(Integer[] arr){
		int n=arr.length;
		if(n==0 || arr[0]==null) return null;
		TreeNode root=new TreeNode(arr[0]);
		Queue<TreeNode> q=new LinkedList<>();
		q.offer(root);
		int i=1;
		while(!q.isEmpty() && i<n){
			TreeNode parent=q.poll();
			if(i<n){
				Integer leftVal=arr[i++];
				if(leftVal!=null){
					TreeNode leftNode=new TreeNode(leftVal);
					parent.left=leftNode;
					q.offer(leftNode);
				}
			}
			if(i<n){
				Integer rightVal=arr[i++];
				if(rightVal!=null){
					TreeNode rightNode=new TreeNode(rightVal);
					parent.right=rightNode;
					q.offer(rightNode);
				}
			}
		}
		return root;
	}
	public static boolean isUnivalued(TreeNode root){
		if(root==null) return true;
		int val=root.val;
		Queue<TreeNode> q=new LinkedList<>();
		q.offer(root);
		while(!q.isEmpty()){
			TreeNode node=q.poll();
			if(node.val!=val) return false;
			if(node.left!=null) q.offer(node.left);
			if(node.right!=null) q.offer(node.right);
		}
		return true;
	}
}
