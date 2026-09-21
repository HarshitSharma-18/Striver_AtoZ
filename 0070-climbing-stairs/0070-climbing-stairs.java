class Solution {
    HashMap<Integer , Integer> map = new HashMap<>();

    public int climbStairs(int n) {
       return helperFunc(0 , n);
    }

    public int helperFunc(int i , int n){
        if(i == n){
            return 1;
        }

        if(i > n){
            return 0;
        }

        if(map.containsKey(i)){
            return map.get(i);
        }

        int ans = helperFunc(i+1 , n) + helperFunc(i+2 , n);
        map.put(i , ans);
        return ans;
        
    }
}