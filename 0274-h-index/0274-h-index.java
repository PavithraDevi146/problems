class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n=citations.length;
        for (int i=0;i<n;i++){
            int remaining_papers=n-i;
            if(citations[i]>=remaining_papers){
                return remaining_papers;
            }
        }
        return 0;
    }
}