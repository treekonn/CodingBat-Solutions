/*
    Given an array of ints, return true if it contains no 1's or it contains no 4's.

    no14([1, 2, 3]) → true
    no14([1, 2, 3, 4]) → false
    no14([2, 3, 4]) → true
*/

public boolean no14(int[] nums) {
    boolean have1 = false;
    boolean have4 = false;

    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 1) {
            have1 = true;
        } else if (nums[i] == 4) {
            have4 = true;
        }

        if (have1 && have4)
            return false;
    }

    return (!have1 || !have4);
}