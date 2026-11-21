// Smallest Subarray Sum Greater Than x

class Solution {
    public static int smallestSubWithSum(int x, int[] arr) {
        // Your code goes here
        int s=0;
        int e=0;
        int sum=0;
        int ans=Integer.MAX_VALUE;
        int n = arr.length;
        
        while(e<n){
            sum = sum + arr[e];
            
                while(sum>x){
                    ans = Math.min(ans, e-s+1);
                    sum = sum - arr[s];
                    s++;
                }
                
            e++;
        }
        return ans == Integer.MAX_VALUE?0:ans;
    }
}
