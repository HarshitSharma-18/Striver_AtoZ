class Solution {
    public String frequencySort(String s) {
        int n = s.length();

        HashMap<Character , Integer> map = new HashMap<>();

        for(int i = 0 ; i < n ; i++){
            map.put(s.charAt(i) , map.getOrDefault(s.charAt(i) , 0) + 1);
        }

        PriorityQueue<Map.Entry<Character , Integer>> maxHeap = new PriorityQueue<>((a , b) -> Integer.compare(b.getValue() , a.getValue()));

        maxHeap.addAll(map.entrySet());

        StringBuilder st = new StringBuilder();


        while(!maxHeap.isEmpty()){
            int i = 0;
            while(i < maxHeap.peek().getValue()){
                st.append(maxHeap.peek().getKey());
                i++;
            }
            maxHeap.poll();
        }
        
        return st.toString();
    }
}