/*Given the root of a binary tree, return the average value of the nodes on each level in the form of an array. Answers within 10-5 of the actual answer will be accepted.
Example 1:
Input: root = [3,9,20,null,null,15,7]
Output: [3.00000,14.50000,11.00000]
Explanation: The average value of nodes on level 0 is 3, on level 1 is 14.5, and on level 2 is 11.
Hence return [3, 14.5, 11].
Example 2:
Input: root = [3,9,20,15,7]
Output: [3.00000,14.50000,11.00000]*/
import java.util.*;
class AverageOfLevelsInBinaryTree{
	public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Integer[] arr=new Integer[n];
        for(int i=0;i<n;i++){
            String val=sc.next();
            arr[i]=val.equalsIgnoreCase("null")?null:Integer.valueOf(val);
        }
        TreeNode root=buildFromArray(arr);
        List<Double> res=averageofLevels(root);
        System.out.print(res);
    }
    public static TreeNode buildFromArray(Integer[] arr){
        if(arr.length==0||arr[0]==null)return null;
        TreeNode root=new TreeNode(arr[0]);
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        int i=1,n=arr.length;
        while(!q.isEmpty()&&i<n){
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
	public static List<Double> averageofLevels(TreeNode root){
		List<Double> res=new ArrayList<>();
		if(root==null) return res;
		Queue<TreeNode> q=new LinkedList<>();
		q.offer(root);
		while(!q.isEmpty()){
			int size=q.size();
			double sum=0;
			for(int i=0;i<size;i++){
				TreeNode node=q.poll();
				sum+=node.val;
				if(node.left!=null) q.offer(node.left);
				if(node.right!=null) q.offer(node.right);
			}
			res.add(sum/size);
		}
		return res;
	}
}
