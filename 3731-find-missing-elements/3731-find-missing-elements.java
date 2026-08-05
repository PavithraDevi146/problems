class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        ArrayList<Integer> list= new ArrayList<>();
        int max = nums[0];
        int min = nums[0];
        
        for(int num:nums){
            if(num>max){
                max=num;
            }
            if(num<min){
                min=num;
            }
            list.add(num);
        }
        for(int i=min;i<max;i++){
            if(!list.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}