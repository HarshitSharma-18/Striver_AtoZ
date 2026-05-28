//public
//private
//protected
//default

import java.util.*;

public class Dsa {
    public void main(String[] args) {

//        System.out.println(Arrays.toString(minOperationsOptimized("001011")));
//
//        System.out.println(alternatingSum(new int[]{1,3,5,7}));
//
//        System.out.println(binarySearch(new int[]{-11,-3,4,5,9,12,16,18,20,22,25}, 19));
//
//        System.out.println(Arrays.toString(binarySerachLoop(new int[]{5,7,7,8,8,10}, 8)));

//          System.out.println(reverseWords("the sky is blue"));

//        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));

//        System.out.println(isIsomorphic("paper", "title"));

//        System.out.println(rotateString("aaa","aaa"));

//        System.out.println(isAnagram("aacc", "ccac"));

//        System.out.println(search(new int[]{1,0,1,1,1}, 0));
//        System.out.println(findMin(new int[] {4,5,6,7,0,1,2}));

//        System.out.println(minOperationss(new String("0100")));

//        System.out.println(myPow(2,10));
//        System.out.println(countGoodNumbers(50));
//          System.out.println(myAtoi(""));

//        System.out.println(generateParenthesis(3));
//        System.out.println(subsets(new int[]{1,2,3}));

//        System.out.println(combine(4,3));

//        System.out.println(combinationSum(new int[]{2,3,6,7},7));

//        System.out.println(combinationSum2(new int[]{2,5,2,1,2} , 5));

//        System.out.println(subsetsWithDup(new int[]{1,2,2}));

//        System.out.println(combinationSumIII(3,7));

 //       System.out.println(dividee(2147483647,-1));
//        System.out.println(closestTarget(new String[]{"odjrjznxpn","cyulttuabe","zqxkdoeszk","yeewpgriok","odjrjznxpn","btqpvxpjzv","ukyudladhk","ukyudladhk","odjrjznxpn","yeewpgriok"}, "odjrjznxpn", 5));

//        System.out.println(solveQueries(new int[]{1,3,1,4,1,3,2},new int[]{0,3,5}));

//        System.out.println(lengthOfLongestSubstring("pwwkew"));

//        System.out.println(maxScore(new int[]{100,40,17,9,73,75}, 3));

//        System.out.println(numberOfSubarrays(new int[]{2,1,2,1,2} , 2));
//        System.out.println(function(new int[]{1,2,1,2,3} , 1));

        //System.out.println(minWindow(new String("cabwefgewcwaefgcf"), "cae"));

//        System.out.println(furthestDistanceFromOrigin("_______"));

//        System.out.println(totalFruit(new int[]{1,2,3,2,2}));

//        System.out.println(findMaxAverage(new int[]{3,3,4,3,0} , 3));

//        System.out.println(validDigit(2, 2));

//        System.out.println(containsNearbyDuplicate(new int[]{1,2,3,1,2,3},2));

//        System.out.println(checkInclusion(new String("ab"), new String("eidbaooo")));

//        plusOne(new int[]{1,2,3});

//        System.out.println(pivotIndex(new int[]{2,1,-1}));

//        rotate(new int[]{1,2,3,4,5,6,7},3);

//        moveZeroes(new int[]{0,1,0,3,12});

//        System.out.println(missingNumber(new int[]{0,1}));

//        System.out.println(findNumbers(new int[]{252}));

//        System.out.println(canAliceWin(11));

//        System.out.println(sortColors(new int[]{1}));

//        System.out.println(Arrays.toString(rearrangeArray(new int[]{3,1,-2,-5,2,-4})));

//        setZeroes(new int[][]{{0,1,2,0},{3,4,5,2},{1,3,1,5}});

//        rotate(new int[][]{{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}});

//        System.out.println(Arrays.toString(lowerBound_UpperBound(new int[]{1,2,2,3}, 2)));

//        System.out.println(searchRev(new int[]{2,3,4,5,6,7,8,1} , 1));

//        System.out.println(Arrays.toString(separateDigits(new int[]{13, 25, 83, 77})));

//        System.out.println(twoSum(new int[]{2,7,11,15}, 9));

//        System.out.println(threeSum(new int[]{-100,-70,-60,110,120,130,160}));
//
//        System.out.println(threeSumSol(new int[]{-1,0,1,2,-1,-4}));




//        Character ch = '1';
//        int n = ch - '0';
//        System.out.println(n);

//        System.out.println(characterReplacementII("KRSCDCSONAJNHLBMDQGIFCPEKPOHQIHLTDIQGEKLRLCQNBOHNDQGHJPNDQPERNFSSSRDEQLFPCCCARFMDLHADJADAGNNSBNCJQOF" , 4));


        ListNode l1 = new ListNode(9);
        l1.next = new ListNode(9);
        l1.next.next = new ListNode(9);
        l1.next.next.next = new ListNode(9);
        l1.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next.next = new ListNode(9);


// l2 = [9,9,9,9]

        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(9);
        l2.next.next = new ListNode(9);
        l2.next.next.next = new ListNode(9);

//        System.out.println(getIntersectionNode(A , B));



//        System.out.println(printLL(addTwoNumbers(l1 , l2)));

//        System.out.println(Arrays.toString(nextGreaterElement(new int[]{1,3,5,2,4}, new int[]{6,5,4,3,2,1,7})));

        System.out.println(Arrays.toString(dailyTemperatures(new int[]{73,74,75,71,69,72,76,73})));


    }
    public static boolean printLL(ListNode head){

        ListNode mover = head;

        while(mover != null){

            System.out.print(mover.val + " -> ");

            mover = mover.next;
        }

        System.out.println("null");
        return false;
    }

    public static int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] answer = new int[n];

        char target = '1';

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (boxes.charAt(i) == target) {
                list.add(i);
            }
        }

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < list.size(); j++) {
                count = count + Math.abs(list.get(j) - i);
            }
            answer[i] = count;
        }
        return answer;
    }

    public static int[] minOperationsOptimized(String boxes) {
        int n = boxes.length();
        int[] answer = new int[n];

        int[] left = new int[n];
        int[] right = new int[n];

        int ball = boxes.charAt(0) - '0';
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] + ball;

            if (boxes.charAt(i) == '1') {
                ball++;
            }
        }

        ball = boxes.charAt(n - 1) - '0';
        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] + ball;

            if (boxes.charAt(i) == '1') {
                ball++;
            }
        }

        for (int i = 0; i < n; i++) {
            answer[i] = left[i] + right[i];
        }

        return answer;
    }

    public static int alternatingSum(int[] nums) {
        int n = nums.length;

        int sum = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sum = sum + nums[i];
            } else {
                sum = sum - nums[i];
            }
        }
        return sum;
    }

    public static int binarySearch(int[] nums, int target) {
        int n = nums.length;

        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int middle = (low + high) / 2;

            if (target == nums[middle]) {
                return middle;
            } else if (target < nums[middle]) {
                high = middle - 1;
            } else if (target > nums[middle]) {
                low = middle + 1;
            }
        }
        return low;
    }

    public static int[] binarySerachLoop(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;

        int[] array = {-1, -1};

        while (low <= high) {
            int middle = (low + high) / 2;

            if (target == nums[middle]) {
                return loop(nums, middle, target);
            } else if (target < nums[middle]) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        return array;
    }

    public static int[] loop(int[] nums, int index, int target) {
        int[] array = new int[2];
        int left = index;
        int right = index;
        while (target == nums[left]) {
            if (left == 0) {
                array[0] = nums[left];
                break;
            }
            left--;
            array[0] = nums[left + 1];
        }

        while (target == nums[right]) {
            if (right == nums.length - 1) {
                array[1] = nums[right];
                break;
            }
            right++;
            array[1] = nums[right + 1];
        }


        return array;
    }

    public static String reverseWords(String s) {
        String finalAns = "";
        int n = s.length();
        int i = n - 1;

        while (i >= 0) {
            if (s.charAt(i) == ' ') {
                i--;
                continue;
            }

            String temp = " ";

            temp = s.charAt(i) + temp;
            i--;


            if (!finalAns.isEmpty()) {
                finalAns = finalAns + " ";
            }

            finalAns = finalAns + temp;
        }
        return finalAns;
    }

    public static String longestCommonPrefix(String[] strs) {
        String lcp = strs[0];
        int n = strs.length;
        StringBuilder st = new StringBuilder();

        for (int i = 1; i < n; i++) {
            int len = Math.min(lcp.length(), strs[i].length());

            for (int j = 0; j < len; j++) {
                if (strs[i].charAt(j) != lcp.charAt(j)) {
                    break;
                }
                st.append(lcp.charAt(j));
            }
            lcp = st.toString();
            st.setLength(0);
        }
        if (lcp.isEmpty()) {
            return "";
        }
        return lcp;
    }

    public static boolean isIsomorphic(String s, String t) {

        int len = s.length();
        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();

        int i = 0;
        while (i < len) {
            if (map.isEmpty()) {
                map.put(s.charAt(i), t.charAt(i));
                set.add(t.charAt(i));
            }

            if (!map.containsKey(s.charAt(i)) && !set.contains(t.charAt(i))) {
                map.put(s.charAt(i), t.charAt(i));
                set.add(t.charAt(i));
            } else if (map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) == t.charAt(i)) {
                i++;
                continue;
            } else {
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;
        if (s.equals(goal)) return true;

        int n = s.length();

        int arrayLength = 2 * n;
        char[] array = new char[arrayLength];

        for (int i = 0; i < n; i++) {
            array[i] = s.charAt(i);
        }

        for (int i = 0; i < n; i++) {
            int newIndex = n + i;

            array[newIndex] = array[i];

            int j = i + 1;
            int k = 0;
            while (j <= (newIndex)) {
                if (array[j] != goal.charAt(k)) {
                    break;
                }

                if (j == newIndex) return true;

                j++;
                k++;
            }
        }
        return false;
    }

    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        int len = s.length();

        int i = 0;

        while (i < len) {
            int val = map1.getOrDefault(s.charAt(i), 0);
            map1.put(s.charAt(i), val + 1);
            i++;
        }

        i = 0;
        while (i < len) {
            if (map1.containsKey(t.charAt(i))) {
                int val = map1.get(t.charAt(i));

                map1.put(t.charAt(i), --val);
            }
            i++;
        }

        for (int val : map1.values()) {
            if (val != 0) return false;
        }
        return true;

    }

    public static int search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) return mid;

            if (nums[mid] >= nums[low]) {
                if (target >= nums[low] && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (target > nums[mid] && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static int searchII(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) return mid;
            if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
                low++;
                high--;
                continue;
            }
            if (nums[mid] >= nums[low]) {
                if (target >= nums[low] && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (target > nums[mid] && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static int findMin(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;

        int min = Integer.MAX_VALUE;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] < min) {
                min = nums[mid];
            }

            if (nums[mid] <= nums[low] && nums[mid] <= nums[high]) {
                high = mid - 1;
            } else if (nums[mid] >= nums[low] && nums[mid] >= nums[high]) {
                low = mid + 1;
            } else {
                if (nums[low] < min) {
                    return nums[low];
                } else return min;
            }
        }
        return min;

    }

    public static int minOperationss(String s) {
        int n = s.length();

        int count = 0;

        if (s.charAt(0) == 0) {
            for (int i = 0; i < n; i++) {
                if (i % 2 == 1 && s.charAt(i) == 0) {
                    count++;
                } else if (i % 2 == 0 && s.charAt(i) == 1) {
                    count++;
                }
            }

        } else {
            for (int i = 0; i < n; i++) {
                if (i % 2 == 1 && s.charAt(i) == 1) {
                    count++;
                } else if (i % 2 == 0 && s.charAt(i) == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static double myPow(double x, int n) {
        if (x == 1) return x;
        if (x == -1 && n % 2 == 0) return 1;
        if (x == -1) return -1;
        if (n <= Integer.MIN_VALUE) return 0;

        long expo = Math.abs(n);

        if (x == 0 && n <= 0) return -1;
        if (n == 0) return 1;

        double recWork = 0;
        double myWork = 0;

        if (expo % 2 == 1) {
            recWork = myPow(x, (int) (expo - 1));
            myWork = recWork * x;
        }
        if (expo % 2 == 0) {
            recWork = myPow(x, (int) (expo / 2));
            myWork = recWork * recWork;
        }
        if (n < 0) {
            return (1 / myWork);
        }
        return myWork;
    }

    public static int countGoodNumbers(long n) {
        int MOD = 1000000007;

        long evenPosition = (n + 1) / 2;
        long oddPosition = n / 2;

        long possibleEvenNumber = findExpo(5, evenPosition);
        long possibleCompositeNumber = findExpo(4, oddPosition);

        int totalPossibleGoodNumber = (int) ((possibleEvenNumber * possibleCompositeNumber) % MOD);

        return totalPossibleGoodNumber;
    }

    public static long findExpo(long possibleNumber, long expo) {
        int MOD = 1000000007;

        if (expo == 0) return 1;

        long recWork = 0;
        long myWork = 0;

        if (expo % 2 == 1) {
            recWork = findExpo(possibleNumber, expo - 1);
            myWork = (recWork * possibleNumber) % MOD;
        }
        if (expo % 2 == 0) {
            recWork = findExpo(possibleNumber, expo / 2);
            myWork = (recWork * recWork) % MOD;
        }
        return myWork;
    }

    public static int myAtoi(String s) {
        int i = 0;
        int a = s.length();
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        int sign = 1;
        if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if (s.charAt(i) == '+') {
                sign = 1;
                i++;
            } else {
                sign = -1;
                i++;
            }
        }

        return helper(s, i, 0, sign);
    }

    public static int helper(String s, int i, long num, int sign) {
        if (i >= s.length() || !Character.isDigit(s.charAt(i))) {
            return (int) (num * sign);
        }


        num = num * 10 + (s.charAt(i) - '0');

        if (num * sign <= Integer.MIN_VALUE) return Integer.MIN_VALUE;
        if (num * sign >= Integer.MAX_VALUE) return Integer.MAX_VALUE;

        return helper(s, i + 1, num, sign);
    }

    public static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        backtrack(list, "", 0, 0, n);
        return list;
    }

    public static void backtrack(List<String> list, String str, int open, int close, int max) {

        if (str.length() == max * 2) {
            list.add(str);
            return;
        }

        if (open < max)
            backtrack(list, str + "(", open + 1, close, max);
        if (close < open)
            backtrack(list, str + ")", open, close + 1, max);
    }

    public static List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        List<List<Integer>> resultList = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();

        recurse(resultList, tempList, 0, nums, n);

        return resultList;
    }

    public static void recurse(List<List<Integer>> resultList, List<Integer> tempList, int start, int[] nums, int n) {
        int i = start;
        resultList.add(new ArrayList<>(tempList));

        while (i < n) {
            tempList.add(nums[i]);
            recurse(resultList, tempList, i + 1, nums, n); // this will give us the all subset have nums[i] from the loop  // yaha start +1 nhi krna because i jab 2 tak pohoch chuka hoga toh per start 1 hoga toh ab iss line m vo 2 hoga toh jo nhi chalna hoga(for loop) vo bhi chal jayega{last mistake dry run kro = start + 1}
            tempList.remove(tempList.size() - 1);
            i++;
        }
    }


    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> resultList = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();
        int i = 1;

        recurseCombine(resultList, tempList, i, n, k);
        return resultList;
    }

    public static void recurseCombine(List<List<Integer>> resultList, List<Integer> tempList, int i, int n, int k) {
        if (k != 0) {
            while (i <= n) {
                tempList.add(i);
                recurseCombine(resultList, tempList, i + 1, n, k - 1);
                tempList.removeLast();
                i++;
            }
        } else {
            resultList.add(new ArrayList<>(tempList));
        }
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        int n = candidates.length;
        List<List<Integer>> resultList = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();
        int start = 0;
        int sum = 0;

        recurseWithSameNumber(resultList, tempList, 0, target, candidates, n);
        return resultList;
    }

//    public static void recurseWithoutSameNumber(List<List<Integer>> resultList, List<Integer> tempList, int i, int sum, int target, int[] nums, int n){
//
//        if(sum == target){
//            resultList.add(new ArrayList<>(tempList));
//        }
//
//        while(i<n){
//            tempList.add(nums[i]);
//            sum = sum + nums[i];
//            recurseWithoutSameNumber(resultList,tempList,i+1, sum , target , nums , n);
//            sum = 0;
//            tempList.removeLast();
//            i++;
//        }
//    }

    public static void recurseWithSameNumber(List<List<Integer>> resultList, List<Integer> tempList, int i, int target, int[] nums, int n) {

        if (target < 0) {
            return;
        }
        if (target == 0) {
            resultList.add(new ArrayList<>(tempList));
            return;
        }
        while (i < n) {
            tempList.add(nums[i]);
            recurseWithSameNumber(resultList, tempList, i, target - nums[i], nums, n);
            tempList.removeLast();
            i++;
        }
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        int n = candidates.length;
        Arrays.sort(candidates);
        List<List<Integer>> resultList = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();

        recurseCombinationII(resultList, tempList, 0, candidates, target, n);
        return resultList;
    }

    public static void recurseCombinationII(List<List<Integer>> resultList, List<Integer> tempList, int start, int[] nums, int target, int n) {
        if (target == 0) {
            resultList.add(new ArrayList<>(tempList));
            return;
        }

        int i = start;
        while (i < n) {
            if (i > start && nums[i] == nums[i - 1]) {
                i++;
                continue;
            }
            if (nums[i] > target) break;

            tempList.add(nums[i]);
            recurseCombinationII(resultList, tempList, i + 1, nums, target - nums[i], n);
            tempList.removeLast();
            i++;
        }
    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        int n = nums.length;
        List<List<Integer>> resultList = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();
        recurseSubsetII(resultList, tempList, 0, nums, n);
        return resultList;
    }

    public static void recurseSubsetII(List<List<Integer>> resultList, List<Integer> tempList, int start, int[] nums, int n) {
        int i = start;
        resultList.add(new ArrayList<>(tempList));

        while (i < n) {
            if(i > start && nums[i] == nums[i - 1]) {
                i++;
                continue;
            }
            tempList.add(nums[i]);
            recurseSubsetII(resultList, tempList, i + 1, nums, n);
            tempList.removeLast();
            i++;
        }
    }

    public static List<List<Integer>> combinationSumIII(int k, int n) {
        List<List<Integer>> resultList = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();

        recurseCombinationIII(resultList , tempList , 1 , k , n);
        return resultList;
    }

    public static void recurseCombinationIII(List<List<Integer>> resultList , List<Integer> tempList , int start , int k , int target){
        if(target < k) return;
        int i = start;

        if(k != 0){
            while(i <= 9){
                tempList.add(i);
                recurseCombinationIII(resultList , tempList , i + 1 , k-1 , target - i);
                tempList.removeLast();
                i++;
            }
        }
        else if(target == 0){
            resultList.add(new ArrayList<>(tempList));
        }
    }


    public static int dividee(int dividend, int divisor) {
        long expoAns = 0;
        long quotient = 0;
        boolean sign = true;

        long n = Math.abs((long)dividend);
        long m = Math.abs((long)divisor);

        if((divisor > 0 && dividend < 0) || (dividend > 0 && divisor < 0) ) sign = false;

        while(n >= m){
            long y = 0;
            int k = 0;

            while ((m << k) <= n) {
                y = (m << k);
                quotient = (1L << k);
                k++;
            }
            n = n - y;
            expoAns = (expoAns + quotient);
        }
        if(expoAns >= 1L << 31 && sign){
            return Integer.MAX_VALUE;
        }
        if(expoAns >= 1L << 31){
            return Integer.MIN_VALUE;
        }
        if(sign){
            return (int)expoAns;
        }
        else return (int)(-expoAns);
    }

    public static int closestTarget(String[] words, String target, int startIndex) {
//        int n = words.length;
//        int i = startIndex;
//
//        int forwardUnit = 0;
//        while(true){
//            if(words[i].equals(target)){
//                break;
//            }
//            i = (i+1) % n;
//            forwardUnit++;
//
//            if(i == startIndex){
//                return -1;
//            }
//        }
//
//        i = startIndex;
//        int backwardUnit = 0;
//        while(true){
//            if(words[i].equals(target)){
//                break;
//            }
//
//            i = (i-1+n) % n;
//
//            backwardUnit++;
//
//            if(i == startIndex) break;
//        }
//
//        return Math.min(forwardUnit,backwardUnit);

        int n = words.length;
        int i = 0;
        int sd;
        int cd;
        int result = Integer.MAX_VALUE;

        while(i<n) {
            if (words[i].equals(target)) {
                sd = Math.abs(i-startIndex);
                cd = n - sd;
                result = Math.min(result , Math.min(sd,cd));
            }
            i++;
        }
        if(result == Integer.MAX_VALUE) return -1;
        return result;
    }

    public static List<Integer> solveQueries(int[] nums, int[] queries) {
        int n = queries.length;
        List<Integer> answer = new ArrayList<>();

        int i = 0;
        while(i < n){
            int find = nums[queries[i]];
            int startIndex = queries[i];

            int result = Integer.MAX_VALUE;
            int m = nums.length;

            int j = 0;

            while(j < m){
                if(nums[j] == find && j != startIndex){
                    int sd = Math.abs(j - startIndex);
                    int cd = m - sd;
                    result = Math.min(result , Math.min(sd , cd));
                }
                j++;
            }
            if(result == Integer.MAX_VALUE) answer.add(-1);
            else answer.add(result);
            i++;
        }
        return answer;
    }

    public static int lengthOfLongestSubstring(String s) {
        int r = 0;
        int l = 0;
        int n = s.length();
        int maxLength = Integer.MIN_VALUE;

        HashMap<Character , Integer> map = new HashMap<>();

        while(r < n){
            map.put(s.charAt(r) , map.getOrDefault(s.charAt(r) ,0) + 1);

            if(map.get(s.charAt(r)) > 1){
                map.put(s.charAt(l) , map.get(s.charAt(l))-1);
                l++;
            }

            if(map.get(s.charAt(r)) == 1){
                maxLength = Math.max(maxLength , r - l + 1);
            }
            r++;
        }
        return maxLength;
    }

    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int r = 0;
        int l = 0;
        int zeroCount = 0;
        int maxLength = Integer.MIN_VALUE;

        while(r < n){
            if(nums[r] == 0){
                zeroCount++;
            }


            while(zeroCount > k){
                if(nums[l] == 0){
                    zeroCount--;
                }
                l++;
            }

            if(zeroCount <= k){
                maxLength = Math.max(maxLength , r-l+1);
            }
            r++;
        }
        return maxLength;
    }

    public static int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int sumLeft = 0;
        int sumRight = 0;
        int sumCircular = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0 ; i<k ; i++){
            sumLeft = sumLeft + cardPoints[i];
        }
        for(int i = n-1 ; i>(n-1)-k ; i--){
            sumRight = sumRight + cardPoints[i];
        }
        int i = 0;
        while(k != 0){
            sumCircular = sumCircular + cardPoints[i];
            i = (i-1+n) % n;
            k--;
        }

        maxSum = Math.max(sumCircular ,Math.max(sumLeft , sumRight));
        return maxSum;
    }

    public static int numberOfSubarrays(int[] nums, int k) {
//        int n = nums.length;
//        int count = 0;
//        for(int i = 0;i<n;i++){
//            int odd = 0;
//
//            for(int j = i;j<n;j++){
//                if(nums[j] % 2 == 1){
//                    odd++;
//                }
//                if(odd == k){
//                    count++;
//                }
//            }
//        }
//        return count;

        int n  = nums.length;
        int odd = 0;
        int count = 0;
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i<n;i++){

            if(nums[i] % 2 == 1){
                list.add(i);
                odd++;
            }
            if(odd == k){
                count = count + (list.get(odd-k)+1);
            }
            if(odd > k){
                count++;
            }
        }
        return count;
    }

    public int characterReplacement(String s, int k) {
        int len = s.length();
        int r = 0;
        int l = 0;

        int maxLength = Integer.MIN_VALUE;
        int maxF = Integer.MIN_VALUE;
        int[] hash = new int[26];

        while(r < len){
            hash[s.charAt(r) - 'A']++;
            maxF = Math.max(maxF , hash[s.charAt(r) - 'A']);

            if((r-l+1) - maxF > k){
                hash[s.charAt(l) - 'A']--;

                maxF = 0;

                for (int i = 0; i <= 25; i++) {
                    maxF = Math.max(maxF, hash[i]);
                }

                l++;
            }

            if((r-l+1) - maxF <= k){
                maxLength = Math.max(maxLength , r-l+1);
            }
            r++;
        }

        return maxLength;
    }

    public static int function(int[] nums, int k){
        int n = nums.length;
        HashMap<Integer , Integer> map = new HashMap<>();
        int count = 0;
        int l = 0;
        int r = 0;

        while(r < n){

            map.put(nums[r] , map.getOrDefault(nums[r] , 0) + 1);

            while(map.size() > k){
                map.put(nums[l] , map.getOrDefault(nums[l] , 0) - 1);
                if(map.get(nums[l]) == 0) map.remove(nums[l]);
                l++;
            }

            if(map.size() <= k){
                count = count + (r-l+1);
            }
            r++;
        }
        return count;
    }

    public static String minWindow(String s, String t) {
        int sleng = s.length();
        int tleng = t.length();

        if(sleng < tleng) return "";


        int r = 0;
        int l = 0;
        int countReq = tleng;
        int minLength = Integer.MAX_VALUE;
        int minstart_i = Integer.MAX_VALUE;
        int start_i = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i<tleng ;i++){
            map.put(t.charAt(i) , map.getOrDefault(t.charAt(i) , 0) + 1);
        }
        while(r < sleng){

            if(map.getOrDefault(s.charAt(r) , 0) > 0){
                countReq--;
            }
            map.put(s.charAt(r) , map.getOrDefault(s.charAt(r) , 0) - 1); // isko phle likhoge upper wli if condition se phle toh jo 1 freq wle aayenge uski value phle 0 hogi and neeche wla if kabhi nhi chal payega, isliye phle apn ko check krna hai ki 0 se badi agar hai toh count -kro and fir uske baad uski freq kam kro
            //means agar tum phle se hi map freq kam krr doge eg A ki freq thi 1 tumne phle hi kam krr di vo ho gyi 0 ab vo if condition jo chalni thi vo nhi chl payegi usko har > 0 pe chalna tha taki vo countReq ko -- krr de taki ye pata chale ki ek ki required list se kam ho gya hai, agar tum iss line ko upper likhoge toh usko ye lagega ki arey 0 se badha toh aaya hi nhi kabhi toh vo check conditon chal hi nhi payegi balki aaya tha phle hi kam krr diya and countReq bada hi reh gaya countReq ke hisab se toh A mill gya hai toh requiremnt kam ho jaani chiye per nhi kri idhar isliye isko neeche likhna hai

            while(countReq == 0){

                //dimag m aaya kyu na neeche ki 2 line min leng and start wali ko if ke neeche rakhe per.....
                //isko yha hi rakhna...VALID window
                //→ answer update karo ✅
                //→ phir shrink karo
                //“if ke baad rakhne ka matlab hai tum window todne ke baad answer le rahe ho”
                //means isko neeche rakhne ka mtlb aap phle window tod rhe ho fir lenght le rhe ho jo flow glt hai apako phle length leni hai l wagira ki fir mujhe window todni hai taki mere paas jaha se valid thi waha ki length ho (bhale sab same rhe ans bhi aa rha ho per ek flow m kaam hone chiye)

                minLength = Math.min(minLength , (r-l+1));


                map.put(s.charAt(l) , map.getOrDefault(s.charAt(l) , 0) + 1); // ab agar isko rakhoge if ke neeche toh fir jab tumhra count++ mtlb ab hume need hai ab expand krna hai tab per agr neeche likh doge isko toh baad mai freq ++ hogi and if check nhi chl payega isliye countReq == 0 hi reh jayega and ek baar aur l chal jayega jabki hona aaisa chiye tha ki freq++ hone ke turat baad hi hume r++ krke expand krna tha per yaha toh l ko hi badha diya frq badhane ke baad bhi jaise hi freq bache kissi number ki means ab expand kro per yaha tum shrink hi krte jaa rhe ho yrr
                if(map.get(s.charAt(l)) > 0){
                    start_i = l;
                    countReq++;
                }

                l++;
            }
            r++;
        }

        if(minLength == Integer.MAX_VALUE) return "";
        return s.substring(start_i , start_i + minLength);
    }
    public static int furthestDistanceFromOrigin(String moves) {
        int n = moves.length();
        int countOfL = 0;
        int countOfR = 0;
        int countOfBlank = 0;

        for(int i = 0;i<n;i++){
            if(moves.charAt(i) == 'L'){
                countOfL++;
            }else if(moves.charAt(i) == 'R'){
                countOfR++;
            }
            else{
                countOfBlank++;
            }
        }
        if(Math.max(countOfR , countOfL) == countOfL){
            return (countOfBlank + countOfL) - countOfR;
        }
        else {
            return (countOfBlank + countOfR) - countOfL;
        }
    }

    public static int totalFruit(int[] fruits) {
        int n = fruits.length;
        int k = 2;
        int r = 0;
        int l = 0;
        int maxLength = Integer.MIN_VALUE;

        HashMap<Integer , Integer> map = new HashMap<>();
        while(r < n){
            map.put(fruits[r] , map.getOrDefault(fruits[r] , 0) + 1);

            if(map.size() > k){
                map.put(fruits[l] , map.getOrDefault(fruits[l] , 0) -1);
                if(map.get(fruits[l]) == 0) map.remove(fruits[l]);
                l++;
            }
            if(map.size() <= k){
                maxLength = Math.max(maxLength , (r-l+1));
            }
            r++;
        }
        return maxLength;
    }

    public static double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int r = 0;
        int l = 0;
        double maxAvg = Integer.MIN_VALUE;
        double sum = 0;

        HashMap<Integer , Integer> map = new HashMap<>();
        while(r < n){
            sum = sum + nums[r];

            if((r-l+1) > k){
                sum = sum - nums[l];
                l++;
            }
            if((r-l+1) == k){
                maxAvg = Math.max(maxAvg ,sum/k);
            }
            r++;
        }
        return maxAvg;
    }

    public static boolean validDigit(int n, int x) {


        HashSet<Integer> set = new HashSet<>();
        while(n != 0){
            int i = 0;
            int lastDigit = n % 10;
            if((lastDigit == x) && set.contains(x)){
                return false;
            }
            set.add(lastDigit);
            n = n/10;
            i++;
        }


        if(set.contains(x)){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        int r = 0;
        int n = nums.length;

        HashMap<Integer , Integer> map = new HashMap<>();

        while(r < n){
            if(map.containsKey(nums[r]) && Math.abs(map.get(nums[r]) - r) <= k){
                return true;
            }
            map.put(nums[r] , r);
            r++;
        }
        return false;
    }

    public static boolean checkInclusion(String s1, String s2) {
        int n = s2.length();
        int m = s1.length();
        String window = new String();

        int r = 0;
        int l = 0;

        char[] arr = s1.toCharArray();
        Arrays.sort(arr);
        s1 = new String(arr);

        while(r < n){
            if((r-l+1) > m){
                l++;
            }
            if((r-l+1) == m){
                window =  s2.substring(l , r+1);

                char[] temp2 = window.toCharArray();
                Arrays.sort(temp2);
                window = new String(temp2);

                if(s1.equals(window)){
                    return true;
                }
            }
            r++;
        }
        return false;
    }
    public static void plusOne(int[] digits) {
        int sum = 199;
        String s =  Integer.toString(sum);
        char[] array = s.toCharArray();
        System.out.println(array.toString());
    }

    public static int pivotIndex(int[] nums) {
        int n = nums.length;
        int sumL = 0;
        int sumR = 0;
        for(int i = 0;i < n;i++){
            for(int j = 0;j<i;j++){
                sumL = sumL + nums[j];
            }
            for(int j = i+1;j<n;j++){
                sumR = sumR + nums[j];
            }
            if(sumL == sumR){
                return i;
            }
            sumL = 0;
            sumR = 0;
        }
        return -1;
    }

    public static void rotate(int[] nums, int k) {
//        int n = nums.length;
//        int[] temp = new int[k];
//
//        for(int i = n-k;i <= n-1; i++){
//            temp[i - (n-k)] = nums[i];
//        }
//
//        for(int i = n-k-1;i >= 0;i--){
//            nums[i+k] = nums[i];
//        }
//
//        for(int i = 0;i < k;i++){
//            nums[i] = temp[i];
//        }
//
//        System.out.println(Arrays.toString(nums));

        int n = nums.length;
        reverse(nums , n-k , n-1);
        reverse(nums , 0, n-k-1);
        reverse(nums , 0 , n-1);

        System.out.println(Arrays.toString(nums));
    }

    public static void reverse(int[] nums, int start, int end){
        int temp;
        while(start <= end){
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        int k = 0;
        for(int i = 0;i < n; i++){
            if(nums[i] != 0){
                k = i-1;
                break;
            }
        }

        reverse(nums , 0 , k);
        reverse(nums, k+1 , n-1);
        reverse(nums, 0 , n-1);

        System.out.println(Arrays.toString(nums));
    }

    public static int missingNumber(int[] nums) {
        double n = nums.length;
        int sum = 0;

        for(int i = 0;i<n;i++){
            sum = sum + nums[i];
        }

        double actuallSum = n*((n + 1) /2);

        return (int)actuallSum - sum;
    }

    public static int findNumbers(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int i = 0;i<n;i++){
            int m = (int)Math.log10(nums[i])+1;
            if(m % 2 == 0){
                count++;
            }
        }
        return count;
    }

    public static boolean canAliceWin(int n) {
        if(n < 10) return false;

        int i = 10;
        while(n-i >= 0){
            n = n-i;
            i--;
        }
        int x = 10-i;

        if(x % 2 == 0){
            return false;
        }
        else{
            return true;
        }
    }

    public static int[] sortColors(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();


        for(int i = 0;i<n;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0) +1);
        }

        for(int i = 0;i<n;i++){
            if(map.getOrDefault(0,0) != 0){
                nums[i] = 0;
                map.put(0,map.get(0) - 1);
            }
            else if(map.getOrDefault(1, 0) != 0){
                nums[i] = 1;
                map.put(1,map.get(1) - 1);
            }
            else{
                nums[i] = 2;
                map.put(2,map.get(2) - 1);
            }
        }
        return nums;
    }

    public static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] finalArray = new int[n];

        int k = 0;
        int l = 1;
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                finalArray[k] = nums[i];
                k+=2;
            }
            else{
                finalArray[l] = nums[i];
                l+=2;
            }
        }
        return finalArray;
    }

    public static void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        List<Integer> rowsIndex = new ArrayList<>();
        List<Integer> columnIndex = new ArrayList<>();

        for(int i= 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(matrix[i][j] == 0){
                    rowsIndex.add(i);
                    columnIndex.add(j);
                }
            }
        }

        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(rowsIndex.contains(i) || columnIndex.contains(j)){
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void rotate(int[][] matrix) {
        int n = matrix.length;

        int temp = 0;
        for(int i = 0 ; i<n-1 ; i++){
            for(int j = i+1 ; j<n ; j++){
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i = 0 ; i<n ; i++){
            int x = 0;
            int y = n-1;
            while(x <= y){
                temp = matrix[i][x];
                matrix[i][x] = matrix[i][y];
                matrix[i][y] = temp;

                x++;
                y--;
            }
        }
    }

    public static int[] lowerBound_UpperBound(int[] nums, int target) { //only works well if target is present otherwise it will give that index where target should be.
        int left = lowerLeftBound(nums,target);
        int right = upperRightBound(nums,target);

        int[] array = {left, right};

        return array;
    }

    public static int lowerLeftBound(int[] nums, int target){
        int n = nums.length;
        int index = n;
        int low = 0;
        int high = n-1;

        while(low <= high){
            int middle = low + (high - low)/2;

            if(target <= nums[middle]){
                index = middle;
                high = middle - 1;
            }
            else if(target < nums[middle]){
                high = middle -1;
            }
            else{
                low = middle + 1;
            }
        }
        if(index == n){
            return -1;
        }
        else{
            return index;
        }
    }

    public static int upperRightBound(int[] nums, int target){
        int n = nums.length;
        int index = n;
        int low = 0;
        int high = n-1;

        while(low <= high){
            int middle = low + (high - low)/2;

            if(target < nums[middle]){
                index = middle - 1;
                high = middle - 1;
            }
            else{
                low = middle + 1;
            }
        }
        if(index == n){
            return -1;
        }
        else{
            return index;
        }
    }

    public static int[] separateDigits(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();

        for(int i = 0;i<n;i++){
            int size = (int)Math.log10(nums[i])+1;

            String s = Integer.toString(nums[i]);

            for(int j= 0;j<size;j++) {
                list.add(Integer.valueOf(s.charAt(j)) - '0');
            }
        }

        int[] array = new int[list.size()];
        int i = 0;
        for(int element : list){
            array[i] = element;
            i++;
        }
        return array;
    }

    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] array = new int[2];
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i = 0; i<n ; i++){
            if(map.containsKey(target - nums[i])){
                array[0] = map.get(target - nums[i]);
                array[1] = i;
            }
            else{
                map.put(nums[i]  , i);
            }
        }
        return array;
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int stored = 0;
        List<List<Integer>> resultList = new ArrayList<>();
        int target = 0;

        for (int i = 0; i < n-1; i++) {
            HashSet<Integer> set = new HashSet<>();

            stored = nums[i];
            target = (-1) * (nums[i]);

            for (int j = i + 1; j < n; j++) {

                if(nums[i] == 0 && nums[j] == 0){
                    List<Integer> arrayList = new ArrayList<>();
                    arrayList.add(0);
                    arrayList.add(0);
                    arrayList.add(0);
                    if(!resultList.contains(arrayList)){
                        resultList.add(arrayList);
                    }
                }


                    if (set.contains(target - nums[j])) {
                        List<Integer> tempList = new ArrayList<>();
                        tempList.add(stored);
                        tempList.add(target - nums[j]);
                        tempList.add(nums[j]);

                        if(!resultList.contains(tempList)){
                            resultList.add(new ArrayList<>(tempList));
                        }

                        set.add(nums[j]);
                    } else {
                        set.add(nums[j]);
                    }

            }
        }
        return resultList;
    }

    public static List<List<Integer>> threeSumSol(int[] nums) {


        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> resultList = new ArrayList<>();
        int target = 0;

        for (int i = 0; i < n - 2; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) continue;
            target = (-1) * nums[i];

            int x = i + 1;
            int y = n - 1;

            while (x < y) {
                if((nums[x] + nums[y]) > target) y--;
                else if((nums[x] + nums[y]) < target) i++;
                else{
                    while(x < y && nums[x] == nums[x+1]) x++;
                    while(x < y && nums[y] == nums[y-1]) y--;
                    resultList.add(Arrays.asList(nums[i] , nums[x] ,nums[y]));
                    i++;
                    x--;
                }
            }
        }
        return resultList;
    }


    public static int characterReplacementII(String s, int k) {
        int n = s.length();
        int l = 0;
        int r = 0;
        int maxF = Integer.MIN_VALUE;

        int[] hash = new int[26];
        int maxLength = Integer.MIN_VALUE;

        while(r < n){
            hash[s.charAt(r) - 'A']++;
            maxF = Math.max(maxF , hash[s.charAt(r) - 'A']);

            while((r-l+1) -maxF > k){
                hash[s.charAt(l) - 'A']--;
                l++;
            }

            if((r-l+1) - maxF <= k){
                maxLength = Math.max(maxLength , r-l+1);
            }
            r++;
        }
        return maxLength;
    }

    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB){
        ListNode mover1 = headA;
        ListNode mover2 = headB;

        int m = 0;
        int n = 0;
        while(mover1 != null || mover2 != null){
            if(mover1 != null){
                m++;
                mover1 = mover1.next;
            }
            if(mover2 != null){
                n++;
                mover2 = mover2.next;
            }
        }

        int parallelPoint = Math.abs(m-n);

        if(m > n){
            while(parallelPoint != 0){
                headA = headA.next;
                parallelPoint--;
            }
        }
        else{
            while(parallelPoint != 0){
                headB = headB.next;
                parallelPoint--;
            }
        }

        while(headA != null){
            if(headA == headB){
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode mover1 = l1;
        ListNode mover2 = l2;
        ListNode extraNode = new ListNode(-1);
        ListNode temp = extraNode;

        while(mover1 != null && mover2 != null){
            int sum = 0;
            sum = mover1.val +  mover2.val + carry;

            ListNode sumNode = new ListNode(sum%10);
            temp.next = sumNode;
            temp = temp.next;

            carry = sum/10;

            mover1 = mover1.next;
            mover2 = mover2.next;
        }

        while(mover2 != null){
            int sum = 0;
            sum = mover2.val + carry;

            ListNode newNode = new ListNode(sum % 10);
            temp.next = newNode;
            temp = temp.next;

            carry = sum/10;

            mover2 = mover2.next;
        }

        while(mover1 != null){
            int sum = 0;
            sum = mover1.val + carry;

            ListNode newNode = new ListNode(sum % 10);
            temp.next = newNode;
            temp = temp.next;

            carry = sum/10;

            mover1 = mover1.next;
        }
        if(carry != 0){
            ListNode newNode = new ListNode(carry);
            temp.next = newNode;
            temp = temp.next;
        }

        return extraNode.next;

    }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();

        HashMap<Integer, Integer> map = new HashMap<>();

        int m = nums2.length;

        for(int i = m - 1; i >= 0; i--){

            while(!stack.isEmpty() && stack.peek() <= nums2[i]){
                stack.pop();
            }

            if(stack.isEmpty()){
                map.put(nums2[i], -1);
            }
            else{
                map.put(nums2[i], stack.peek());
            }

            stack.push(nums2[i]);
        }

        int[] ansArray = new int[nums1.length];

        for(int i = 0; i < nums1.length; i++){
            ansArray[i] = map.get(nums1[i]);
        }

        return ansArray;
    }

    public int[] nextGreaterElements(int[] nums) {
        int[] arrayAns = new int[nums.length];

        int sizeOfArray = nums.length;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 2 * nums.length; i++) {
            list.add(nums[i % nums.length]);
        }

        Stack<Integer> stack = new Stack<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= list.get(i)) {
                stack.pop();
            }
            if (stack.empty()) {
                stack.push(list.get(i));
                arrayAns[i % sizeOfArray] = -1;
            } else {
                arrayAns[i % sizeOfArray] = stack.peek();
                stack.push(list.get(i));
            }
        }
        return arrayAns;
    }

    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<Integer> stack_temp = new Stack<>();
        Stack<Integer> stack_index = new Stack<>();

        int[] ansArray = new int[n];

        for(int i = n-1; i >= 0; i--){
            while(!stack_temp.isEmpty() && stack_temp.peek() <= temperatures[i]){
                stack_temp.pop();
                stack_index.pop();
            }
            if(stack_temp.isEmpty()){
                ansArray[i] = 0;
            }
            else{
                ansArray[i] = stack_index.peek() - i;
            }
            stack_temp.push(temperatures[i]);
            stack_index.push(i);
        }
        return ansArray;
    }
}