/*
    Given 2 ints, a and b, return their sum. However, "teen" values in the range 13..19 inclusive,
    are extra lucky. So if either value is a teen, just return 19.

    teenSum(3, 4) → 7
    teenSum(10, 13) → 19
    teenSum(13, 2) → 19
*/

public int teenSum(int a, int b) {
    return (isTeen(a) || isTeen(b)) ? 19 : a + b;
}

private boolean isTeen(int num) {
    return (num >= 13 && num <= 19);
}
