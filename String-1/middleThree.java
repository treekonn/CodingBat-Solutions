/*
    Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and".
    The string length will be at least 3.

    middleThree("Candy") → "and"
    middleThree("and") → "and"
    middleThree("solving") → "lvi"
*/

public String middleThree(String str) {
    int startIndex;
    int lenMiddle = 3;

    if (str.length() <= lenMiddle)
        return str;
    startIndex = str.length() / 2 - lenMiddle / 2;

    return str.substring(startIndex, startIndex + lenMiddle);
}
