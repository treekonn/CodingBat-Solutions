/*
    We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1.
    Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.

    unlucky1([1, 3, 4, 5]) → true
    unlucky1([2, 1, 3, 4, 5]) → true
    unlucky1([1, 1, 1]) → false
*/

public boolean unlucky1(int[] nums) {
    // universal solution
    // - any unlucky sequence ($seq)
    // - any count of positions ($countPos)
    return haveSeqInPos(nums, new int[]{1, 3}, 2);
    }

private boolean haveSeqInPos(int[] nums, int[] seq, int countPos) {
    int countSeq = 0;

    if (seq.length == 0)
        return true;

    if (seq.length > nums.length || nums.length == 0)
        return false;

    for (int i = 0; i + seq.length <= nums.length && i < countPos; i++) {
        while (countSeq < seq.length
            && seq[countSeq] == nums[i + countSeq]) {
            countSeq++;
        }

        if (countSeq == seq.length)
            return true;
        else
            countSeq = 0;
    }

    for (int i = nums.length - countPos; i + seq.length <= nums.length; i++) {
        while (countSeq < seq.length
            && seq[countSeq] == nums[i + countSeq]) {
            countSeq++;
        }

        if (countSeq == seq.length)
            return true;
        else
            countSeq = 0;
    }

    return false;
}