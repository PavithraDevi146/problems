class Solution {
    public int findGCD(int[] nums) {
        int min =nums[0];
        int max =nums[0];
        for(int i:nums){
            if(i>max){
                max=i;
            }
            if(i<min){
                min=i;
            }
        }
        while(max%min!=0){
            int rem = max%min;
            max=min;
            min=rem;
        }
        return min;
    }
}