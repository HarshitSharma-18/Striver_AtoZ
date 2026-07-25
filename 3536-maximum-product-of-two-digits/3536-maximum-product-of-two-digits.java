class Solution {
    public int maxProduct(int n) {
        String str = String.valueOf(n);

        char[] array = str.toCharArray();

        Arrays.sort(array);

        int product = 1;
        int i = array.length-1;
        while(i >= array.length - 2){
            int lastDigit = array[i] - '0';
            product = product * lastDigit;
            i--;
        }

        return product;
    }
}