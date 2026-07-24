class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int n = firstList.length;
        int m = secondList.length;
        ArrayList<int[]> result = new ArrayList<>();

        int i = 0;
        int j = 0;

        while(i < n && j < m){
            int s1 = firstList[i][0];
            int e1 = firstList[i][1];
            int s2 = secondList[j][0];
            int e2 = secondList[j][1];

            if(s2 <= e1 && s1 <= e2){
                result.add(new int[]{Math.max(s1 ,s2) , Math.min(e1 , e2)});
            }
            if(e1 < e2){
                i++;
            }
            else{
                j++;
            }
        }

        return result.toArray(new int[result.size()][]);
    }
}