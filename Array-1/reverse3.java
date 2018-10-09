/*
    Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3}
    becomes {3, 2, 1}.

    reverse3([1, 2, 3]) → [3, 2, 1]
    reverse3([5, 11, 9]) → [9, 11, 5]
    reverse3([7, 0, 0]) → [0, 0, 7]
*/

public int[] reverse3(int[] nums) {
    int temp;
    int len = nums.length;

    for (int i = 0; i < len / 2; i++) {
        temp = nums[i];
        nums[i] = nums[len - i - 1];
        nums[len - i - 1] = temp;
    }

    return nums;
}
