class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        HashSet<Integer> set= new HashSet<>();
        int max = nums[0];
        int min = nums[0];
        
        for(int num:nums){
            if(num>max){
                max=num;
            }
            if(num<min){
                min=num;
            }
            set.add(num);
        }
        for(int i=min;i<max;i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}