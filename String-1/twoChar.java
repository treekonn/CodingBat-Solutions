/*
    Given a string and an index, return a string length 2 starting at the given index.
    If the index is too big or too small to define a string length 2, use the first 2 chars.
    The string length will be at least 2.

    twoChar("java", 0) → "ja"
    twoChar("java", 2) → "va"
    twoChar("java", 3) → "ja"
*/

public String twoChar(String str, int index) {
    // universal solution for any length of result string
    int lengthRes = 2;

    if (str.length() <= lengthRes)
        return str;

    if ((str.length() < index + lengthRes) || index < 0)
        index = 0;

    return str.substring(index, index + lengthRes);
}
