/*Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.
Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.
Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.
Return the minimum integer k such that she can eat all the bananas within h hours.
Example 1:
Input: piles = [3,6,7,11], h = 8
Output: 4
Example 2:
Input: piles = [30,11,23,4,20], h = 5
Output: 30
Example 3:
Input: piles = [30,11,23,4,20], h = 6
Output: 23*/
import java.util.*;
class KokoEatingBananasStream{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] piles=new int[n];
        for (int i=0;i<n;i++) {
            piles[i]=sc.nextInt();
        }
        int h=sc.nextInt();
        int maxPile = Arrays.stream(piles).max().getAsInt();
        int low=1,high=maxPile;
        while(low<high){
            int mid=low+(high-low)/2;
            if(canFinish(piles,h,mid)){
                high=mid;
            } else{
                low=mid+1;
            }
        }
        System.out.println(low);
    }
    private static boolean canFinish(int[] piles,int h,int k){
        long hours=0L;
        for (int pile:piles){
            hours+=(pile+(long)k-1)/k;
            if(hours>h) return false;
        }
        return hours<=h;
    }
}
