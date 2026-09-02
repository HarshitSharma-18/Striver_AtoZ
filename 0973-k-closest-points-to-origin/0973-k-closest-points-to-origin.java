class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int n = points.length;

        HashMap<Integer , Double> map = new HashMap<>();

        for(int i = 0 ; i < n ; i++){
            double distance = distanceHelper(points[i][0] , points[i][1]);

            map.put(i , distance);
        }

        PriorityQueue<Map.Entry<Integer , Double>> maxHeap = new PriorityQueue<>((a , b) -> Double.compare(b.getValue() , a.getValue()));

        for(Map.Entry<Integer , Double> entries : map.entrySet()){
            if(maxHeap.size() == k){
                break;
            }
            maxHeap.add(entries);

        }

        List<Map.Entry<Integer , Double>> list = new ArrayList<>(map.entrySet());
        int m = list.size();

        for(int i = k ; i < m ; i++){
            if(maxHeap.peek().getValue() > list.get(i).getValue()){
                maxHeap.poll();
                maxHeap.add(list.get(i));
            }
        }

        int[][] result = new int[k][2];

        int i = 0;
        while(!maxHeap.isEmpty()){
            int index = maxHeap.poll().getKey();
            result[i] = points[index];
            i++;
        }

        return result;
    }
    public double distanceHelper(double x1 , double y1){
        return Math.sqrt((x1*x1) + (y1*y1));
    }
}