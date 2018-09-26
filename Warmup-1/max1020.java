/*
    Given 2 positive int values, return the larger value that
    is in the range 10..20 inclusive, or return 0 if neither is in that range.

    max1020(11, 19) → 19
    max1020(19, 11) → 19
    max1020(11, 9) → 11
*/

public int max1020(int a, int b) {
    int low = 10;
    int high = 20;

    if (b > a) {
        int temp = a;
        a = b;
        b = temp;
    }

    if (isRange(a, low, high))
        return a;
    if (isRange(b, low, high))
        return b;

    return 0;
}

public boolean isRange(int num, int low, int high) {
    return ((num >= low) && (num <= high));
}

