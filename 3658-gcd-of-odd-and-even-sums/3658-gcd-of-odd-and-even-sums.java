class Solution {
    public int gcdOfOddEvenSums(int n) {
        int evenSum = 0;
        int oddSum = 0;

        for(int i = 1 ; i<=2*n ; i++){
            if(i % 2 == 0){
                evenSum = evenSum + i;
            }
            else{
                oddSum = oddSum + i;
            }
        }

        int gcd = 1;

        for(int i = 1; i<= Math.min(evenSum , oddSum) ; i++){
            if((evenSum % i == 0) && (oddSum % i == 0)){
                gcd = i;
            }
        }
        return gcd;
    }
}