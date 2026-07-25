class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        ArrayList<int[]> newIntervals = new ArrayList<>();

        int i = 0;
        while (i < n && intervals[i][0] < newInterval[0]) {
            newIntervals.add(intervals[i]);
            i++;
        }

        newIntervals.add(newInterval);
        
        while (i < n) {
            newIntervals.add(intervals[i]);
            i++;
        }
        newIntervals.add(newInterval);

        n = newIntervals.size();

        ArrayList<int[]> result = new ArrayList<>();
        result.add(newIntervals.get(0));

        for(int j = 1; j< n ; j++){
            int s1 = result.get(result.size()-1)[0];
            int s2 = newIntervals.get(j)[0];
            int e1 = result.get(result.size()-1)[1];
            int e2 = newIntervals.get(j)[1];

            if(s2 <= e1){
                result.get(result.size()-1)[0] = s1;
                result.get(result.size()-1)[1] = Math.max(e1 , e2);
            }
            else{
                result.add(newIntervals.get(j));
            }
        }

        return result.toArray(new int[result.size()][]);
    }
}