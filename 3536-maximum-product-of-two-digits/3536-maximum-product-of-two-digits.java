class Solution {
    public int maxProduct(int n) {
        String str = String.valueOf(n);

        char[] array = str.toCharArray();

        Arrays.sort(array);

        int m = array.length;

        return (array[m-1] - '0') * (array[m-2] - '0');
    }
}