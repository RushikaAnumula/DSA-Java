/*Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).
Example 1:
Input: root = [3,9,20,null,null,15,7]
Output: [[3],[9,20],[15,7]]
Example 2:
Input: root = [1]
Output: [[1]]
Example 3:
Input: root = []
Output: []*/
import java.util.*;
class TreeNode{
	int val;
	TreeNode left,right;
	TreeNode(int val){
		this.val=val;
		left=right=null;
	}
}
class BinaryTreeLevelOrderTraversal{
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
		levelOrderIterative(root);
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
	public static void levelOrderIterative(TreeNode root){
		if(root==null) return;
		Queue<TreeNode> q=new LinkedList<>();
		q.offer(root);
		List<List<Integer>> res=new ArrayList<>();
		while(!q.isEmpty()){
			int size=q.size();
			List<Integer> level=new ArrayList<>();
			for(int i=0;i<size;i++){
				TreeNode node=q.poll();
				level.add(node.val);
				if(node.left!=null) q.offer(node.left);
				if(node.right!=null) q.offer(node.right);
			}
			res.add(level);
		}
		System.out.print(res);
	}
}
