/*
    Given an array of ints, is it possible to divide the ints into two groups, so that
    the sum of the two groups is the same, with these constraints: all the values
    that are multiple of 5 must be in one group, and all the values
    that are a multiple of 3 (and not a multiple of 5) must be in the other. (No loops needed.)

    split53([1, 1]) → true
    split53([1, 1, 1]) → false
    split53([2, 4, 2]) → true
*/

public boolean split53(int[] nums) {
    return split53(0, nums, 0);
}

private boolean split53(int start, int[] nums, int target) {
    if (start >= nums.length)
        return (target == 0);

    if (nums[start] % 5 == 0) {
        return split53(start + 1, nums, target + nums[start]);
    } else if (nums[start] % 3 == 0)
        return split53(start + 1, nums, target - nums[start]);

    return split53(start + 1, nums, target + nums[start])
        || split53(start + 1, nums, target - nums[start]);
}
