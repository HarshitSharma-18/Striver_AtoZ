class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;

        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i = 0; i < n ; i++){
            map.put(nums[i] , map.getOrDefault(nums[i] , 0) + 1);
        }

        List<Map.Entry<Integer , Integer>> list = new ArrayList<>(map.entrySet());

        PriorityQueue<Map.Entry<Integer , Integer>> minHeap = new PriorityQueue<>((a , b) -> Integer.compare(a.getValue() , b.getValue()));

        for(Map.Entry<Integer , Integer> entries : list){
            if(minHeap.size() == k) break;
            minHeap.add(entries);
        }

        int[] arr = new int[k];

        for(int i = k ; i < list.size() ; i++){
            if(minHeap.peek().getValue() < list.get(i).getValue()){
                minHeap.poll();
                minHeap.add(list.get(i));
            }
        }

        int i = 0;
        while(!minHeap.isEmpty()){
            arr[i] = minHeap.peek().getKey();
            minHeap.poll();
            i++;
        }

        return arr;        
    }
}