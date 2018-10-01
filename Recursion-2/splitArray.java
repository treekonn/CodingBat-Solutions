/*
    Given an array of ints, is it possible to divide the ints into two groups,
    so that the sums of the two groups are the same. Every int must be in one group or the other.
    Write a recursive helper method that takes whatever arguments you like,
    and make the initial call to your recursive helper from splitArray(). (No loops needed.)

    splitArray([2, 2]) → true
    splitArray([2, 3]) → false
    splitArray([5, 2, 3]) → true
*/

public boolean splitArray(int[] nums) {
    return spl(0, nums, 0);
}

public boolean spl(int start, int[] nums, int target) {
    if (start >= nums.length)
        return (target == 0);

    return spl(start + 1, nums, target - nums[start])
        || spl(start + 1, nums, target + nums[start]);
}
