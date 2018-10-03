/*
    Given three ints, a b c, one of them is small, one is medium and one is large.
    Return true if the three values are evenly spaced, so the difference
    between small and medium is the same as the difference between medium and large.

    evenlySpaced(2, 4, 6) → true
    evenlySpaced(4, 6, 2) → true
    evenlySpaced(4, 6, 3) → false
*/

public boolean evenlySpaced(int a, int b, int c) {
    int[] seq = {a, b, c};
    int min, max;
    int mid;

    min = seq[indexMin(seq)];
    max = seq[indexMax(seq)];

    if ((min + max) % 2 == 0)
        mid = (min + max) / 2;
    else
        return false;

    return a == mid
        || b == mid
        || c == mid;
}

// not null $arr
private int indexMax(int[] arr) {
    int indexMax = 0;

    for (int i = 1; i < arr.length; i++) {
        if (arr[i] > arr[indexMax])
            indexMax = i;
    }

    return indexMax;
}

// not null $arr
private int indexMin(int[] arr) {
    int indexMin = 0;

    for (int i = 1; i < arr.length; i++) {
        if (arr[i] < arr[indexMin])
            indexMin = i;
    }

    return indexMin;
}
