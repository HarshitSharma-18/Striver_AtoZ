class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String s : words) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        PriorityQueue<Map.Entry<String , Integer>> heap = new PriorityQueue<>((a , b) -> 
            {
                if(!a.getValue().equals(b.getValue())){
                    return Integer.compare(a.getValue() , b.getValue());                }
                else {
                    return b.getKey().compareTo(a.getKey());
                }
            }

        );

        for(Map.Entry<String , Integer> entries : map.entrySet()){
            if(heap.size() == k) break;
            heap.add(entries);
        }

        List<Map.Entry<String , Integer>> list = new ArrayList<>(map.entrySet());
        int m = list.size();

        for(int i = k ; i < m ; i++){
            if(heap.peek().getValue() < list.get(i).getValue()){
                heap.poll();
                heap.add(list.get(i));
            }
            else if(heap.peek().getValue() == list.get(i).getValue() && heap.peek().getKey().compareTo(list.get(i).getKey()) > 0){
                heap.poll();
                heap.add(list.get(i));
            }
        }

        List<String> result = new ArrayList<>();

        while(!heap.isEmpty()){
            result.add(heap.poll().getKey());
        }

        Collections.reverse(result);

        return result;
    }
}