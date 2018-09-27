/*
    Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.

    array123([1, 1, 2, 3, 1]) → true
    array123([1, 1, 2, 4, 1]) → false
    array123([1, 1, 2, 1, 2, 3]) → true
*/

public boolean array123(int[] nums) {
    // univeral solution for any sequence if numbers ($seqNum[])
    int[] seqNum = {1, 2, 3};
    int count;

    if (seqNum.length > nums.length)
        return false;

    for (int i = 0; i < nums.length - seqNum.length + 1; i++) {
        count = 0;

        while (count < seqNum.length
                && nums[i + count] == seqNum[count]) {
            count++;
        }

        if (count == seqNum.length)
            return true;
    }

    return false;
}
