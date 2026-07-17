class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int n = g.length;
        int m = s.length;

        Arrays.sort(g);
        Arrays.sort(s);

        int childP = 0;
        int cookieP = 0;

        while(childP < n && cookieP < m){
            if(s[cookieP] >= g[childP]){
                childP++;
            }
            cookieP++;
        }
        return childP;
    }
}