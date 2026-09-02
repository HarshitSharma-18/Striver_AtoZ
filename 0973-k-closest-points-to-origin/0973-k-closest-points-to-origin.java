class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int n = points.length;

        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a , b) -> Double.compare(distanceHelper(b) , distanceHelper(a)));

        for(int[] entries : points){
            if(maxHeap.size() == k) {
                break;
            }
            maxHeap.add(entries);
        }

        for(int i = k ; i < n ; i++){
            if(distanceHelper(maxHeap.peek()) > distanceHelper((points[i]))){
                maxHeap.poll();
                maxHeap.add(points[i]);
            }
        }

        int[][] result = new int[k][2];

        int i = 0;
        while(!maxHeap.isEmpty()){
            result[i] = maxHeap.poll();
            i++;
        }

        return result;
    }
    public double distanceHelper(int[] arr){
        int x1 = arr[0];
        int y1 = arr[1];
        return Math.sqrt((x1*x1) + (y1*y1));
    }
}