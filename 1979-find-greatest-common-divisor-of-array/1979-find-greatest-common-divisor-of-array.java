class Solution {
    public int findGCD(int[] nums) {
        int n = nums.length;
        int mn = Integer.MAX_VALUE , mx = Integer.MIN_VALUE;

        for(int i = 0; i < n ; i++){
            if(nums[i] < mn){
                mn = nums[i];
            }
            if(nums[i] > mx){
                mx = nums[i];
            }
        }
        
        return gcd(mn, mx);
    }

    public int gcd(int a , int b){
        if(b == 0){
            return a;
        }
        else{
            return gcd(b , a%b);
        }
    }
}