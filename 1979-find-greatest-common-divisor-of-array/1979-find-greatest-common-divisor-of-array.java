class Solution {
    public int findGCD(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        return gcd(nums[0] , nums[n-1]);
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