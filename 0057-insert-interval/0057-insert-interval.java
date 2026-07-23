class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> newIntervals = new ArrayList<>(Arrays.asList(intervals));
        newIntervals.add(newInterval);

        int n = newIntervals.size();
        newIntervals.sort((a,b) -> Integer.compare(a[0] , b[0]));

        ArrayList<int[]> result = new ArrayList<>();
        result.add(newIntervals.get(0));

        for(int i = 1; i< n ; i++){
            int s1 = result.get(result.size()-1)[0];
            int s2 = newIntervals.get(i)[0];
            int e1 = result.get(result.size()-1)[1];
            int e2 = newIntervals.get(i)[1];

            if(s2 <= e1){
                result.get(result.size()-1)[0] = s1;
                result.get(result.size()-1)[1] = Math.max(e1 , e2);
            }
            else{
                result.add(newIntervals.get(i));
            }
        }

        return result.toArray(new int[result.size()][]);
    }
}