class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;

        for(int f = 0; f < n ; f++){
            if(nums[f] > 0){
                break;
            }
            else if(f == 0 || nums[f] != nums[f - 1]){
                twoSumHelper(nums[f] , f+1 , n-1 , nums , result);
            }
        }
        return result;

    }
    public void twoSumHelper(int target , int i , int j , int[] nums , List<List<Integer>> result){
        while(i < j){
            int sum = nums[i] + nums[j];

            if(sum > (-1)*(target)){
                j--;
            }
            else if(sum < (-1) * (target)){
                i++;
            }
            else{
                result.add(Arrays.asList(target , nums[i] , nums[j]));
                i++;
                j--;

                while(i < j && nums[i] == nums[i-1]){
                    i++;
                }

                while(i < j && nums[j] == nums[j+1]){
                    j--;
                }
            }
        }
    }
}