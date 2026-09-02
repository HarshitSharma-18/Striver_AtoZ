class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
            (a, b) -> Long.compare(
                distance(b),
                distance(a)
            )
        );

        for (int i = 0; i < points.length; i++) {

            maxHeap.add(points[i]);

            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        int[][] result = new int[k][2];

        int i = 0;

        while (!maxHeap.isEmpty()) {
            result[i] = maxHeap.poll();
            i++;
        }

        return result;
    }

    public long distance(int[] point) {
        long x = point[0];
        long y = point[1];

        return x * x + y * y;
    }
}