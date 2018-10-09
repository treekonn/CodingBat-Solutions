/*
    Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}.
    You may modify and return the given array, or return a new array.

    shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6]
    shiftLeft([1, 2]) → [2, 1]
    shiftLeft([1]) → [1]
*/

public int[] shiftLeft(int[] nums) {
    int i;
    int temp;

    if (nums.length != 0) {
        temp = nums[0];

        for (i = 0; i + 1 < nums.length; i++)
            nums[i] = nums[i + 1];

        nums[i] = temp;
    }

    return nums;
}