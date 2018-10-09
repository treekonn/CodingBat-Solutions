/*
    Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.

    modThree([2, 1, 3, 5]) → true
    modThree([2, 1, 2, 5]) → false
    modThree([2, 4, 2, 5]) → true
*/

public boolean modThree(int[] nums) {
    int[] isEven = new int[nums.length];
    int sum3Numbers;

    if (nums.length < 3)
        return false;

    for (int i = 0; i < isEven.length; i++) {
        isEven[i] = (nums[i] % 2 == 0) ? 1 : 0;
    }

    sum3Numbers = isEven[0] + isEven[1];

    for (int i = 2; i < isEven.length; i++) {
        sum3Numbers += isEven[i];

        if (sum3Numbers == 0 || sum3Numbers == 3)
            return true;

        sum3Numbers -= isEven[i - 2];
    }

    return false;
}