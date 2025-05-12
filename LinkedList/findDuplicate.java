package LinkedList;

public class  findDuplicate{

    public static int FidnDuplicateNumber(int[] nums) {
        // Phase 1: Detect the cycle
        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        // Phase 2: Find the entrance to the cycle
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 4, 2, 2};
        int[] nums2 = {3, 1, 3, 4, 2};
        int[] nums3 = {3, 3, 3, 3, 3};

        System.out.println("Duplicate in nums1: " + FidnDuplicateNumber(nums1)); // 2
        System.out.println("Duplicate in nums2: " + FidnDuplicateNumber(nums2)); // 3
        System.out.println("Duplicate in nums3: " + FidnDuplicateNumber(nums3)); // 3
    }
}



//287. Find the Duplicate Number
// Medium

//Given an array of integers nums containing n + 1 integers where each integer is in the range \[1, n] inclusive.
//There is only one repeated number in nums, return this repeated number.
//You must solve the problem without modifying the array nums and using only constant extra space.

//Example 1:
//Input: nums = \[1,3,4,2,2]
//Output: 2

//Example 2:
//Input: nums = \[3,1,3,4,2]
//Output: 3

//Example 3:
//Input: nums = \[3,3,3,3,3]
//Output: 3

//Constraints:
//1 <= n <= 105
//nums.length == n + 1
//1 <= nums\[i] <= n
//All the integers in nums appear only once except for precisely one integer which appears two or more times.

//Follow up:
//How can we prove that at least one duplicate number must exist in nums?
//Can you solve the problem in linear runtime complexity?