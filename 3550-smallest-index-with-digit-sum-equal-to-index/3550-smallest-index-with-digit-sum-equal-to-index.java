class Solution {
    public int smallestIndex(int[] nums) {
        int n = nums.length;
        for(int i = 0 ; i < n ; i++){
            int digitSum = digitSum(nums[i]);
            if(digitSum == i){
                return i;
            }
        }
        return -1;
    }

    public int digitSum(int val){
        int sum = 0;
        while(val != 0){
            int lastDigit = val % 10;
            sum = sum + lastDigit;
            val = val/10;
        }
        return sum;
    }
}