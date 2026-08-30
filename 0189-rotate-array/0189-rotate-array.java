class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k=k%n;
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            int j = (i+k)%n;
            res[j]=nums[i];
        }
        for(int i=0;i<n;i++){
            nums[i]=res[i];
        }
    }
    
}