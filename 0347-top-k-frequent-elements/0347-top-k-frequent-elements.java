class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         // 1. Create frequency map
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int num : nums) {
        map.put(num, map.getOrDefault(num, 0) + 1);
    }

    // 2. Convert map entries into a List
    List<Map.Entry<Integer, Integer>> list =
            new ArrayList<>(map.entrySet());

    // 3. Min Heap based on frequency
    PriorityQueue<Map.Entry<Integer, Integer>> minHeap =
            new PriorityQueue<>(
                    (a, b) -> Integer.compare(a.getValue(), b.getValue())
            );

    // 4. Put first k elements into heap
    for (int i = 0; i < k; i++) {
        minHeap.add(list.get(i));
    }

    // 5. Traverse remaining elements
    for (int i = k; i < list.size(); i++) {

        // Current element has higher frequency
        // than the smallest frequency in heap
        if (list.get(i).getValue() > minHeap.peek().getValue()) {

            minHeap.poll();          // remove smallest frequency
            minHeap.add(list.get(i)); // add new element
        }
    }

    // 6. Put heap elements into answer
    int[] result = new int[k];
    int i = 0;

    while (!minHeap.isEmpty()) {
        result[i] = minHeap.poll().getKey();
        i++;
    }

    return result;
    }
}