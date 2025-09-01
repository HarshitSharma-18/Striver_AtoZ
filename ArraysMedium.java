import java.util.*;

public class ArraysMedium {
    public static void main(String[] args) {
//        int[] arr = {33,19,4,9,11,2,8,54,87,98};
//        System.out.println(Arrays.toString(sum2_Problem(arr,6)));
//
//
//        int[] arrrr = {2,0,2,1,2,0};
//        SortColor(arrrr);
//        anotherApproach_SortColor(arrrr);
//
//        int[] ar2 ={-1,1,1,1,2,1};
//        System.out.println(majorityElementCorrect(ar2));
//
//
//        int[] prices = {7,6,4,3,1};
//        System.out.println(buyStockAndSell(prices));


        String st = "121";
        System.out.println(st.charAt(2));
        System.out.println();

//        int[][] multiArray = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
//        for(int i = 0;i<multiArray.length;i++){
//            for(int j =0;j<multiArray[i].length;j++){
//                System.out.print(multiArray[i][j]+" ");
//            }
//            System.out.println();
//        }
        //setMatrixZero_Correct(multiArray);


//        int[][] rotatematrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//        rotateArray90Degree_inPlace(rotatematrix);


        int[][] matrix = {{1}, {2}, {3}, {4}, {5}};
        System.out.println(spiralMatrix(matrix));



        int[] array = {1};
        System.out.println(subArraySumEquals_k_optimalSoln(array,0));


    }

    public int[] sum2_Problem_byMe(int[] nums, int target) {
        int[] arrNew = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    arrNew[0] = i;
                    arrNew[1] = j;
                    return arrNew;
                }
            }
        }
        return arrNew;
    }


    static int[] sum2_Problem(int[] arr, int target) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < n; i++) {
            if (map.containsKey(target - arr[i])) {
                result[1] = i;
                result[0] = map.get(target - arr[i]);
                return result;
            }
            map.put(arr[i], i);
        }
        return result;

    }

    static void SortColor(int[] arr){
        int lastDigitIndex = arr.length - 1;
        int targetNumber = 2;

        for (int i = 0; i <= lastDigitIndex; i++) {
            if (arr[i] == targetNumber) {
                //swap
                int temp = arr[lastDigitIndex];
                arr[lastDigitIndex] = arr[i];
                arr[i] = temp;
                lastDigitIndex--;

                //restartTheLoop
                i = -1;
                continue;
            }
            if (i == lastDigitIndex) {
                targetNumber--;
                i = -1;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    static void anotherApproach_SortColor(int[] arr) {
        int[] hash = new int[3];
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
        }

        for (int i = 0; i < arr.length; i++) {
            if (hash[0] != 0) {
                arr[i] = 0;
                hash[0]--;
            } else if (hash[1] != 0) {
                arr[i] = 1;
                hash[1]--;
            } else arr[i] = 2;
        }
        System.out.println(Arrays.toString(arr));
    }

    static int majorityElement(int[] arr) {

//        int biggestElementInArray = 0;
//        int smallestNumber = Integer.MAX_VALUE;
//        for(int i = 0;i<arr.length;i++){
//            if(arr[i] > biggestElementInArray) biggestElementInArray = arr[i];
//
//            if(arr[i]<smallestNumber) smallestNumber = arr[i];
//        }
//
//        int[] hash = new int[biggestElementInArray + 1];
//        for(int i = 0;i<arr.length;i++){
//            hash[arr[i]]++;
//        }
//
//        int biggestNumber = 0;
//        int indexWhichHasMajorityNumber = 0;
//        for(int i = 0;i<hash.length;i++){
//            if(hash[i] > biggestNumber){
//                biggestNumber = hash[i];
//                indexWhichHasMajorityNumber = i;
//            }
//        }
//        return indexWhichHasMajorityNumber;
        return 0;
    } // this code fails when having negative numbers containing array like {-1,1,1,1,2,1}

    static int majorityElementCorrect(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int majorityElement = arr[n / 2];
        return majorityElement;
    }

    static int buyStockAndSell(int[] prices) {
        int maxProfit = 0;
        int i = 0;
        for (int j = i + 1; j < prices.length; j++) {
            if (prices[j] > prices[i] && maxProfit < (prices[j] - prices[i])) {
                maxProfit = prices[j] - prices[i];
            }
            if (j == prices.length - 1 && i < prices.length - 2) {
                i++;
                j = i;
            }
        }
        return maxProfit;
    } // this will fail in very large number of prices .....and in leetcode 200th test case it fails on that. TIME EXCEEDS aayega.

    static int buyStockAndSell_gpt(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int profit = 0;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if ((price - minPrice) > profit) {
                profit = price - minPrice;
            }
        }
        return profit;
    }

    static void setMatrixZero(int[][] arr) {
        int ithIndexOfZero = Integer.MIN_VALUE;
        int jthIndexOfZero = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    ithIndexOfZero = i;
                    jthIndexOfZero = j;
                    break;
                    //issi loop ke ander nhi kr skte hai neeche wale part ko,because jab tak hume 0 nhi mil jata tab tak jaha jaha i and j ki value 0 hai waha waha 0 fix ho jayega because 0 store hai phle se..........and if we use Interger.Max or min so isse bhi koi fayda nahi hai because loop ko jab tak milega 0 toh usse aage wale number per element change hoke 0 banega usse phle ke nhi ban payenge.

                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == ithIndexOfZero || j == jthIndexOfZero) {
                    arr[i][j] = 0;
                }
            }
        }
        for (int[] element : arr) {
            System.out.println(Arrays.toString(element));          // the elements will be like the array ke ander ka array like {{1,1,1},{},{}}  here 1,1,1 and this is the element so it is a array it cannot be printed if i write only sout(element) so this will print some random thing........to print the array i have to use toString method.
        }

    } // fails in cases where the number of zeros are more than 1
    //SO we have to store the diff diff index where the 0 comes then we will make zero at those indexes


    static void setZeroes(int[][] matrix) {
        ArrayList<Integer> zeroRows = new ArrayList<>();
        ArrayList<Integer> zeroColumns = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    zeroRows.add(i);
                    zeroColumns.add(j);
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (zeroRows.contains(i) || zeroColumns.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }
    } // this is correct but it takes more time

    static void setMatrixZero_Correct(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[] zeroRows = new int[m];
        int[] zeroColumns = new int[n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    zeroRows[i] = 1;
                    zeroColumns[j] = 1;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (zeroRows[i] == 1 || zeroColumns[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int[] element : matrix) {
            System.out.println(Arrays.toString(element));          // the elements will be like the array ke ander ka array like {{1,1,1},{},{}}  here 1,1,1 and this is the element so it is a array it cannot be printed if i write only sout(element) so this will print some random thing........to print the array i have to use toString method.
        }
    }

    static void rotateArray90Degree(int[][] matrix) {
        int numberOfRowsAndColumn_theyBothAreSame = matrix.length;
        for (int i = 0; i < numberOfRowsAndColumn_theyBothAreSame; i++) {
            for (int j = numberOfRowsAndColumn_theyBothAreSame - 1; j >= 0; j--) {
                System.out.print(matrix[j][i]);
            }
            System.out.println();
        }
    }

    static void rotateArray90Degree_inPlace(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - (j + 1)];
                matrix[i][n - (j + 1)] = temp;
            }
        }

        for (int[] element : matrix) {
            System.out.println(Arrays.toString(element));          // the elements will be like the array ke ander ka array like {{1,1,1},{},{}}  here 1,1,1 and this is the element so it is a array it cannot be printed if i write only sout(element) so this will print some random thing........to print the array i have to use toString method.
        }
    }


    static List<Integer> spiralMatrix(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                list.add(matrix[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }

        return list;
    }

    static int maxArray(int[] arr){
        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int val : arr){
            curSum = curSum + val;
            if(curSum>maxSum){
                maxSum = curSum;
            }
            if(curSum < 0){
                curSum = 0;
            }
        }
        return maxSum;
    } // by kadane's algo;       more optimised

    static int maxArray_bruteForce(int [] arr){
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;

        for(int start = 0;start<n;start++){
            int curSum = 0;       //alg alg subarray ke liye alg alg sum hona chiye
            for(int end = start;end<n;end++){
                curSum = curSum + arr[end];
                if(curSum>maxSum){
                    maxSum = curSum;
                }
            }
        }
        return maxSum;
    }

    static int subArraySumEquals_K_bruteforce(int [] arr, int k){
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            int sum = 0;
            for(int j = i;j<arr.length;j++){
                sum += arr[j];
                if(sum == k){
                    count++;
                }
            }
        }
        return count;
    }


    static int subArraySumEquals_k_optimalSoln(int[] arr, int k){
        int countTheSubArray = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        int n = arr.length;
        int[] prefixSum = new int[n];


        int sum = 0;
        for(int i = 0 ;i<n;i++){
            sum = sum + arr[i];
            prefixSum[i] = sum;

        }
//hum phle se hi map mai sari prefixSum array ki value nhi dalenge because agar hum aaaisa krte hai toh usse ye hoga ki jab koi signle element hoga hamare array mai and hum koi alg number find kr rhe hai tab dikkat aayegi because humne phle se save krr rakha hai tohh vo answer ++count krke hi dega
//for example:-
                //arr={1}; and we are finding 0(k), so if we will add the elements of the prefixSum array to the map corresponding then map mai phle se jake 1 aa chuka hai and jab humara code yaha pohochega {int elementToBeFind = prefixSum[j] - k;} tab usko element milegi 1(1-0 = 1) and vo next wahi element dhundega aur count++ kr dega but count toh tab ++ hona chiye jab humko 0 sum wale sub array mile yaha toh nhi mila/
                // isliye humko sath sath add nhi krna hai phle check kro fir add kro.


        for(int j= 0;j<n;j++){
            int elementToBeFind = prefixSum[j] - k;             //ye vo element hai jisse hume pata chalge ki array ka first index kya hai last toh humko chlte clte malum chalgea
            if(map.containsKey(elementToBeFind)){
                countTheSubArray += map.get(elementToBeFind);
            }

            if(prefixSum[j] == k){
                countTheSubArray++;
            }

            map.put(prefixSum[j],map.getOrDefault(prefixSum[j],0)+1);            //map.getOrDefault will give the value of that key if exist or if not exist it will give you the default set value here which is 0
        }

        return countTheSubArray;
    }
}
//