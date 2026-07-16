class Solution {
    public long gcdSum(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        List<Integer> newList = new ArrayList<>();
        long sum = 0;

        for(int i = 0; i< n ; i++) {
            max = Math.max(max, nums[i]);
            newList.add(gcdFunc(nums[i] , max));
        }
        newList.sort(null);

            int low = 0;
            int high = n-1;
            while(low < high){
                sum = sum + gcdFunc(newList.get(low) , newList.get(high));;
                low++;
                high--;
            }
        return sum;
    }

    public int gcdFunc(int a , int b){
        if(b == 0){
            return a;
        }
        else{
            return gcdFunc(b , a % b);
        }
    }
}