class Solution {
    public String reorganizeString(String s) {
        int n = s.length();

        HashMap<Character , Integer> map = new HashMap<>();

        for(int i = 0 ; i < n ; i++){
            map.put(s.charAt(i) , map.getOrDefault(s.charAt(i) , 0) + 1);
        }

        PriorityQueue<Map.Entry<Character , Integer>> maxHeap = new PriorityQueue<>((a , b) -> Integer.compare(b.getValue() , a.getValue()));

        maxHeap.addAll(map.entrySet());

        StringBuilder sb = new StringBuilder();

        while(!maxHeap.isEmpty()){
            Map.Entry<Character , Integer> p1 = maxHeap.poll();

            if(sb.length() == 0 || sb.charAt(sb.length() - 1) != p1.getKey()){
                sb.append(p1.getKey());

                p1.setValue(p1.getValue() - 1);

                if(p1.getValue() > 0){
                    maxHeap.add(p1);
                }
            }
            else{
                if(maxHeap.isEmpty()){
                    return "";
                }

                Map.Entry<Character , Integer> p2 = maxHeap.poll();
                sb.append(p2.getKey());

                p2.setValue(p2.getValue() - 1);

                if(p2.getValue() > 0){
                    maxHeap.add(p2);
                }

                maxHeap.add(p1);
            }
        }

        return sb.toString();
    }
}