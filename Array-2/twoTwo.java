/*
    Given an array of ints, return true if every 2 that appears in the array is next to another 2.

    twoTwo([4, 2, 2, 3]) → true
    twoTwo([2, 2, 4]) → true
    twoTwo([2, 2, 4, 2]) → false
*/

public boolean twoTwo(int[] nums) {
    int j;

    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 2) {
            j = 0;

            while (i + j + 1 < nums.length && nums[i] == nums[i + j + 1]) {
                j++;
            }

            if (j == 0)
                return false;
            else
                i += j;
        }
    }

    return true;
}
