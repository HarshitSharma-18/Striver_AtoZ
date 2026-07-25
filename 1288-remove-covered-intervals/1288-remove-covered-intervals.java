class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals , (a,b) -> {
                                            if(a[0] != b[0]){
                                                return Integer.compare(a[0] , b[0]); // asending
                                            }
                                            else{
                                                return Integer.compare(b[1], a[1]); // desending
                                            }
         });

        ArrayList<int[]> result = new ArrayList<>();
        result.add(intervals[0]);

        for(int i = 1; i< n ; i++){
            int s1 = result.get(result.size()-1)[0];
            int s2 = intervals[i][0];
            int e1 = result.get(result.size()-1)[1];
            int e2 = intervals[i][1];

            if(e1 >= e2){
                result.get(result.size()-1)[0] = Math.min(s1,s2);
                result.get(result.size()-1)[1] = Math.max(e1 , e2);
            }
            else{
                result.add(intervals[i]);
            }
        }

        return result.size();
    }
}