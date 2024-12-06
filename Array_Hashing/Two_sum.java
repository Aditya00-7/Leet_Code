package Array_Hashing;

import java.util.Hashtable;
public  class Two_sum {
        public static void main(String[] args) {
            Solution solution = new Solution();

            // Test case 1
            int[] nums1 = {2, 7, 11, 15};
            int target1 = 9;
            int[] result1 = solution.twoSum(nums1, target1);
            System.out.println("Index: [" + result1[0] + ", " + result1[1] + "]");

            // Test case 2
            int[] nums2 = {3, 2, 4};
            int target2 = 6;
            int[] result2 = solution.twoSum(nums2, target2);
            System.out.println("Index: [" + result2[0] + ", " + result2[1] + "]");

            // Test case 3
            int[] nums3 = {3, 3};
            int target3 = 6;
            int[] result3 = solution.twoSum(nums3, target3);
            System.out.println("Index: [" + result3[0] + ", " + result3[1] + "]");
        }
    }

    class Solution {
        public int[] twoSum(int[] nums, int target) {
            Hashtable<Integer, Integer> table = new Hashtable<>();

            for (int i = 0; i < nums.length; i++) {
                int Pair = target - nums[i];
                if (table.containsKey(Pair)) {
                    return new int[] { table.get(Pair), i };
                }
                table.put(nums[i], i);
            }
            throw new IllegalArgumentException("No two sum solution");
        }
}
