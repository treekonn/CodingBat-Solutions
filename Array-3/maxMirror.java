/*
    We'll say that a "mirror" section in an array is a group of contiguous elements such that somewhere
    in the array, the same group appears in reverse order. For example, the largest mirror section in
    {1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 3} part).
    Return the size of the largest mirror section found in the given array.

    maxMirror([1, 2, 3, 8, 9, 3, 2, 1]) → 3
    maxMirror([1, 2, 1, 4]) → 3
    maxMirror([7, 1, 2, 9, 7, 2, 1]) → 2
*/

public int maxMirror(int[] nums) {
    int idStartMirror;
    int idEndMirror;
    int maxLenMirror = 0;
    int lenMirror;

    for (int i = 0; i < nums.length; i++) {
        for (int j = nums.length - 1; j >= i; j--) {
            idStartMirror = i;
            idEndMirror = j;
            lenMirror = 0;

            while (nums[idStartMirror] == nums[idEndMirror]) {
                idStartMirror++;
                idEndMirror--;
                lenMirror++;

                if (idStartMirror >= nums.length || idEndMirror < i)
                    break;
            }

            if (lenMirror > maxLenMirror)
                maxLenMirror = lenMirror;
        }
    }

    return maxLenMirror;
}
