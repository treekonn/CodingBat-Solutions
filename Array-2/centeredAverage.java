/*
    Return the "centered" average of an array of ints, which we'll say is the mean average of the values,
    except ignoring the largest and smallest values in the array. If there are multiple copies of the smallest value,
    ignore just one copy, and likewise for the largest value. Use int division to produce the final average.
    You may assume that the array is length 3 or more.

    centeredAverage([1, 2, 3, 4, 100]) → 3
    centeredAverage([1, 1, 5, 5, 10, 8, 7]) → 5
    centeredAverage([-10, -4, -2, -4, -2, 0]) → -3
*/

public int centeredAverage(int[] nums) {
    int sumAll = 0;
    int min;
    int max;

    if (nums.length <= 2)
        return 0;

    min = nums[0];
    max = nums[0];

    for (int i = 0; i < nums.length; i++) {
        sumAll += nums[i];
        min = Math.min(min, nums[i]);
        max = Math.max(max, nums[i]);
    }

    return (sumAll - min - max) / (nums.length - 2);
}