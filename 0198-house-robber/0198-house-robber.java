class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        int[][] array2D = new int[2][n];

        for(int i = 0 ; i < array2D.length ; i++){
            for(int j = 0 ; j < array2D[0].length ; j++){
                array2D[i][j] = -1;
            }
        }

        return helperFunc(array2D , nums , 0 , 1 , n);
    }

    public int helperFunc(int[][] array2D , int[] nums , int i , int free , int n){
        if(i == n){
            return 0;
        }

        if(array2D[free][i] != -1){
            return array2D[free][i];
        }

        if(free == 0){
            array2D[free][i] = helperFunc(array2D , nums , i+1 , 1 , n);
            return array2D[free][i];
        }

        int choice1 = nums[i] + helperFunc(array2D , nums , i+1 , 0 , n);
        int choice2 = helperFunc(array2D , nums , i+1 , 1 , n);

        array2D[free][i] = Math.max(choice1 , choice2);
        return array2D[free][i];
    } 
}