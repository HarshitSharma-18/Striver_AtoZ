class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;

        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i = 0; i < n ; i++){
            map.put(nums[i] , map.getOrDefault(nums[i] , 0) + 1);
        }

        // List<Map.Entry<Integer , Interger>> list = new ArrayList<>(map.entryset());

        PriorityQueue<Map.Entry<Integer , Integer>> maxHeap = new PriorityQueue<>((a , b) -> Integer.compare(b.getValue() , a.getValue()));

        maxHeap.addAll(map.entrySet());

        int[] arr = new int[k];
        int i = 0;
        while(i < k){
            arr[i] = maxHeap.peek().getKey();
            maxHeap.poll();
            i++;
        }

        return arr;        
    }
}