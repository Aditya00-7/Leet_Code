package Two_Pointers;

import java.util.Arrays;

public class Two_sum2 {
        public static int[] twoSum(int[] numbers, int target) {
            int left = 0;
            int right = numbers.length - 1;

            while (left < right) {
                int sum = numbers[left] + numbers[right];

                if (sum == target) {
                    // Return 1-based indices
                    return new int[]{left + 1, right + 1};
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }

            // Just a fallback; per constraints this shouldn't happen
            return new int[]{-1, -1};
        }

        public static void main(String[] args) {
            // 🔸 You can change these values to test different inputs
            int[] numbers = {2, 7, 11, 15};
            int target = 9;

            int[] result = twoSum(numbers, target);
            System.out.println("Input: " + Arrays.toString(numbers));
            System.out.println("Target: " + target);
            System.out.println("Output: " + Arrays.toString(result));
        }
}

//167. Two Sum II - Input Array Is Sorted
//Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
//Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
//The tests are generated such that there is exactly one solution. You may not use the same element twice.
//Your solution must use only constant extra space.

//Example 1:
//Input: numbers = [2,7,11,15], target = 9
//Output: [1,2]
//Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
//Example 2:
//Input: numbers = [2,3,4], target = 6
//Output: [1,3]
//Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].
//Example 3:
//Input: numbers = [-1,0], target = -1
//Output: [1,2]
//Explanation: The sum of -1 and 0 is -1. Therefore index1 = 1, index2 = 2. We return [1, 2].
//Constraints:
//2 <= numbers.length <= 3 * 104
//-1000 <= numbers[i] <= 1000
//numbers is sorted in non-decreasing order.
//-1000 <= target <= 1000
//The tests are generated such that there is exactly one solution.


// Approach: Two Pointer Technique
//Since the array is sorted, we can use the two-pointer method:
//Set left = 0 and right = numbers.length - 1
//Loop while left < right:
//If numbers[left] + numbers[right] == target → return [left + 1, right + 1]
//If the sum is less than target → move left++
//If the sum is greater than target → move right--
//This is O(n) time and O(1) space.