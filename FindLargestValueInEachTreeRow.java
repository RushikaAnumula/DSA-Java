/*Given the root of a binary tree, return an array of the largest value in each row of the tree (0-indexed).
Example 1:
Input: root = [1,3,2,5,3,null,9]
Output: [1,3,9]
Example 2:
Input: root = [1,2,3]
Output: [1,3]*/
import java.util.*;
class TreeNode{
    int val;
    TreeNode left,right;
    TreeNode(int val){
        this.val=val;
        right=left=null;
    }
}
class FindLargestValueInEachTreeRow{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Integer[] arr=new Integer[n];
        for(int i=0;i<n;i++){
            String val=sc.next();
            arr[i]=val.equalsIgnoreCase("null")?null:Integer.valueOf(val);
        }
        TreeNode root=buildFromArray(arr);
        List<Integer> res=largestValue(root);
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
    public static List<Integer> largestValue(TreeNode root){
        List<Integer> res=new ArrayList<>();
		if(root==null) return res;
		Queue<TreeNode> q=new LinkedList<>();
		q.offer(root);
		while(!q.isEmpty()){
			int size=q.size();
			int max=Integer.MIN_VALUE;
			for(int i=0;i<size;i++){
				TreeNode node=q.poll();
				max=Math.max(max,node.val);
				if(node.left!=null) q.offer(node.left);
				if(node.right!=null) q.offer(node.right);
			}
			res.add(max);
		}
		return res;
    }
}
