/*
    Given an int array of any length, return a new array of its first 2 elements.
    If the array is smaller than length 2, use whatever elements are present.

    frontPiece([1, 2, 3]) → [1, 2]
    frontPiece([1, 2]) → [1, 2]
    frontPiece([1]) → [1]
*/

public int[] frontPiece(int[] nums) {
    int countFront = 2;
    int[] res;

    if (nums.length < 2)
        countFront = nums.length;

    res = new int[countFront];

    for (int i = 0; i < res.length; i++) {
        res[i] = nums[i];
    }

    return res;
}
