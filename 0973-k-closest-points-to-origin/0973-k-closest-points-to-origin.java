class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int n = points.length;

        List<Pair> list = new ArrayList<>();

        for(int i = 0 ; i < n ; i++){
            list.add(new Pair(i , distanceHelper(points[i][0] , points[i][1])));
        }

        PriorityQueue<Pair> maxHeap = new PriorityQueue<>((a , b) -> Double.compare(b.distance , a.distance));

        for(Pair entries : list){
            if(maxHeap.size() == k) {
                break;
            }
            maxHeap.add(entries);
        }

        int m = list.size();
        for(int i = k ; i < m ; i++){
            maxHeap.add(list.get(i));

            if(maxHeap.size() > k){
                maxHeap.poll();
            }
        }

        int[][] result = new int[k][2];

        int i = 0;
        while(!maxHeap.isEmpty()){
            int index = maxHeap.poll().index;
            result[i] = points[index];
            i++;
        }

        return result;
    }
    public double distanceHelper(double x1 , double y1){
        return Math.sqrt((x1*x1) + (y1*y1));
    }
}

class Pair{
    int index;
    double distance;

    Pair(int index , double distance){
        this.index = index;
        this.distance = distance;
    }
}