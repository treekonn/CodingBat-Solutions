/*
    Given an array of ints of odd length, return a new array length 3 containing the elements
    from the middle of the array. The array length will be at least 3.

    midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
    midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
    midThree([1, 2, 3]) → [1, 2, 3]
*/

public int[] midThree(int[] nums) {
    int[] res = new int[3];
    int idMiddle = nums.length / 2;

    if (nums.length >= 3) {
        res[0] = nums[idMiddle - 1];
        res[1] = nums[idMiddle];
        res[2] = nums[idMiddle + 1];
    }

    return res;
}
