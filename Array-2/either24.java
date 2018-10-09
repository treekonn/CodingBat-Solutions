/*
    Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.

    either24([1, 2, 2]) → true
    either24([4, 4, 1]) → true
    either24([4, 4, 1, 2, 2]) → false
*/

public boolean either24(int[] nums) {
    boolean have22 = false;
    boolean have44 = false;

    for (int i = 0; i + 1 < nums.length; i++) {
        if (!have22 && nums[i] == 2 && nums[i + 1] == 2) {
            have22 = true;
            if (have44)
                return false;
        } else if (!have44 && nums[i] == 4 && nums[i + 1] == 4) {
            have44 = true;
            if (have22)
                return false;
        }
    }

    return (have22 ^ have44);
}