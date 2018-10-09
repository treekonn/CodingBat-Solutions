/*
    Return an array that contains the exact same numbers as the given array,
    but rearranged so that all the zeros are grouped at the start of the array.
    The order of the non-zero numbers does not matter. So {1, 0, 0, 1} becomes {0 ,0, 1, 1}.
    You may modify and return the given array or make a new array.

    zeroFront([1, 0, 0, 1]) → [0, 0, 1, 1]
    zeroFront([0, 1, 1, 0, 1]) → [0, 0, 1, 1, 1]
    zeroFront([1, 0]) → [0, 1]
*/

public int[] zeroFront(int[] nums) {
    // universal solution
    return anyFront(nums, 0);
}

public int[] anyFront(int[] nums, int front) {
    int frontId = 0;
    int temp;

    while (frontId < nums.length && nums[frontId] == front) {
        frontId++;
    }

    for (int j = frontId + 1; j < nums.length; j++) {
        if (nums[j] == front) {
            nums[j] = nums[frontId];
            nums[frontId] = front;
            frontId++;
        }
    }

    return nums;
}