/*
    Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array.
    Return the array which has the largest sum. In event of a tie, return a.

    biggerTwo([1, 2], [3, 4]) → [3, 4]
    biggerTwo([3, 4], [1, 2]) → [3, 4]
    biggerTwo([1, 1], [1, 2]) → [1, 2]
*/

public int[] biggerTwo(int[] a, int[] b) {
    return (sumArray(a) >= sumArray(b)) ? a : b;
}

public int sumArray(int[] a) {
    int sum = 0;

    for (int i = 0; i < a.length; i++) {
        sum += a[i];
    }

    return sum;
}