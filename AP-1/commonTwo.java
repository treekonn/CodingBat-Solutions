/*
    Start with two arrays of strings, a and b, each in alphabetical order, possibly with duplicates.
    Return the count of the number of strings which appear in both arrays. The best "linear" solution
    makes a single pass over both arrays, taking advantage of the fact that they are in alphabetical order.

    commonTwo(["a", "c", "x"], ["b", "c", "d", "x"]) → 2
    commonTwo(["a", "c", "x"], ["a", "b", "c", "x", "z"]) → 3
    commonTwo(["a", "b", "c"], ["a", "b", "c"]) → 3
*/

public int commonTwo(String[] a, String[] b) {
    int count = 0;
    int resCompare;
    int i = 0, j = 0;

    while (i < a.length && j < b.length) {
        resCompare = a[i].compareTo(b[j]);
        if (resCompare == 0) {
            count++;

            //skip duplicates
            do {
                i++;
            } while (i < a.length && a[i].equals(a[i - 1]));

            do {
                j++;
            } while (j < b.length && b[j].equals(b[j - 1]));
        }
        else
            if (resCompare > 0)
                j++;
            else
                i++;
    }

    return count;
}
