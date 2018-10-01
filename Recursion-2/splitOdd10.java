/*
    Given an array of ints, is it possible to divide the ints into two groups,
    so that the sum of one group is a multiple of 10, and the sum of the other group is odd.
    Every int must be in one group or the other. Write a recursive helper method that takes whatever
    arguments you like, and make the initial call to your recursive helper from splitOdd10(). (No loops needed.)

    splitOdd10([5, 5, 5]) → true
    splitOdd10([5, 5, 6]) → false
    splitOdd10([5, 5, 6, 1]) → true
*/

public boolean splitOdd10(int[] nums) {
    return spl(0, nums, 0, 0);
}

public boolean spl(int start, int[] nums, int target1, int target2) {
    if (start >= nums.length)
        return (target1 % 10 == 0 && target2 % 2 == 1)
            || (target2 % 10 == 0 && target1 % 2 == 1);

    return spl(start + 1, nums, target1 + nums[start], target2)
        || spl(start + 1, nums, target1, target2 + nums[start]);
}
