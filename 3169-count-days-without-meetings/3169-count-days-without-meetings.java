class Solution {
    public int countDays(int days, int[][] meetings) {
        int n = meetings.length;
        Arrays.sort(meetings , (a,b) -> Integer.compare(a[0],b[0]));

        List<int[]> result = new ArrayList<>();
        result.add(meetings[0]);

        for(int i = 1 ; i<n ; i++){
            int s1 = result.get(result.size() - 1)[0];
            int e1 = result.get(result.size() - 1)[1];
            int s2 = meetings[i][0];
            int e2 = meetings[i][1];

            if(s2 <= e1 && s1 <= e2){
                result.get(result.size() - 1)[0] = Math.min(s1, s2);
                result.get(result.size()-1)[1] = Math.max(e1 , e2);
            }
            else{
                result.add(meetings[i]);
            }
        }

        for(int i = 0; i < result.size(); i++){
            days = days - ((result.get(i)[1] - result.get(i)[0]) + 1);
        }

        return days;
    }
}