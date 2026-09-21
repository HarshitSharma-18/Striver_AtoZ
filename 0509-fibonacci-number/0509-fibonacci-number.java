class Solution {
    public int fib(int n) {
        HashMap<Integer , Integer> map = new HashMap<>();

       if(n == 0 || n == 1){
            return n;
        }
        
        if(map.containsKey(n)){
            return map.get(n);
        }

        int ans = fib(n - 2) + fib(n - 1);
        map.put(n , ans);

        return ans;
    }
}