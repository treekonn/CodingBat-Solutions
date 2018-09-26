/*
    Given 2 int values, return true if they are both in the range 30..40 inclusive,
    or they are both in the range 40..50 inclusive.

    in3050(30, 31) → true
    in3050(30, 41) → false
    in3050(40, 50) → true
*/

public boolean in3050(int a, int b) {
    int[][] range = {{30, 40}, {40, 50}};

    for (int i = 0; i < range.length; i++) {
        if (inRange(a, range[i][0], range[i][1])
            && inRange(b, range[i][0], range[i][1]))
            return true;
    }

    return false;
}

public boolean inRange(int num, int low, int high) {
    return num >= low && num <= high;
}
