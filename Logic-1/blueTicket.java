/*
    You have a blue lottery ticket, with ints a, b, and c on it. This makes three pairs,
    which we'll call ab, bc, and ac. Consider the sum of the numbers in each pair.
    If any pair sums to exactly 10, the result is 10. Otherwise if the ab sum is exactly 10 more than
    either bc or ac sums, the result is 5. Otherwise the result is 0.

    blueTicket(9, 1, 0) → 10
    blueTicket(9, 2, 0) → 0
    blueTicket(6, 1, 4) → 10
*/

public int blueTicket(int a, int b, int c) {
    if (a + b == 10 || a + c == 10 || b + c == 10)
        return 10;

    if (Math.abs(a - c) >= 10
        || Math.abs(a - b) >= 10
        || Math.abs(b - c) >= 10)
        return 5;

    return 0;
}