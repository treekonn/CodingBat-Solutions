/*
    Given a string, does "xyz" appear in the middle of the string? To define middle,
    we'll say that the number of chars to the left and right of the "xyz" must differ by at most one.
    This problem is harder than it looks.

    xyzMiddle("AAxyzBB") → true
    xyzMiddle("AxyzBB") → true
    xyzMiddle("AxyzBBB") → false
*/

public boolean xyzMiddle(String str) {
    // universal solution for any $part
    String part = "xyz";

    for (int i = 0; (i + part.length()) <= str.length(); i++) {
        if (str.substring(i, i + part.length()).equals(part)) {
            int countLeft = i;
            int countRight = str.length() - part.length() - i;

            if (Math.abs(countLeft - countRight) <= 1)
                return true;
        }
    }

    return false;
}

