class Solution {
    public long sumAndMultiply(int n) {
        String str = String.valueOf(n);
        int sum = 0;
        long x=0;
        for(int ch : str.toCharArray()){
            if(ch !='0'){
                int d=ch - '0';
                x = x*10 + d; 
                sum+=d;
            }
        }
        return x* sum;
    }
}