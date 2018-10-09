/*
    Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.

    plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
    plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
    plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]
*/

public int[] plusTwo(int[] a, int[] b) {
    int[] res = new int[a.length + b.length];
    int i, j;

    for (i = 0; i < a.length; i++) {
        res[i] = a[i];
    }

    for (j = 0; j < b.length; i++, j++) {
        res[i] = b[j];
    }

    return res;
}
