class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals , (a,b) -> Integer.compare(a[0] , b[0]));

        ArrayList<int[]> result = new ArrayList<>();
        result.add(intervals[0]);

        for(int i = 1; i< n ; i++){
            int s1 = result.get(result.size()-1)[0];
            int s2 = intervals[i][0];
            int e1 = result.get(result.size()-1)[1];
            int e2 = intervals[i][1];

            if(s2 <= e1){
                result.get(result.size()-1)[0] = s1;
                result.get(result.size()-1)[1] = Math.max(e1 , e2);
            }
            else{
                result.add(intervals[i]);
            }
        }

        return result.toArray(new int[result.size()][]);
    }
}