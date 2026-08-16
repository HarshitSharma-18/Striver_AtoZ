class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int n = drones.length;
        int index = -1;
        int minMD = Integer.MAX_VALUE;

        for(int i = 0;i < n; i++){
            int mD = manhattanDist(drones[i][0] , target[0] , drones[i][1] , target[1]);

            if(mD <= drones[i][2] && mD < minMD){
                minMD = mD;
                index = i;
            }
        }
        return index;
    }
    public int manhattanDist(int x , int t1 , int y , int t2){
        return Math.abs(x - t1) + Math.abs(y - t2);
    }
}