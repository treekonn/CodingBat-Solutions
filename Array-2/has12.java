/*
    Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.

    has12([1, 3, 2]) → true
    has12([3, 1, 2]) → true
    has12([3, 1, 4, 5, 2]) → true
*/

public boolean has12(int[] nums) {
    boolean have1 = false;

    for (int i = 0; i < nums.length; i++) {
        if (have1) {
            if (nums[i] == 2)
                return true;
        } else {
            if (nums[i] == 1)
                have1 = true;
        }
    }

    return false;
}
