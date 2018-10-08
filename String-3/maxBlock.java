/*
    Given a string, return the length of the largest "block" in the string.
    A block is a run of adjacent chars that are the same.

    maxBlock("hoopla") → 2
    maxBlock("abbCCCddBBBxx") → 3
    maxBlock("") → 0
*/

public int maxBlock(String str) {
    int maxLength = 0;
    int i = 0;
    int maxTemp;

    while (i < str.length()) {
        maxTemp = 1;

        while (i + maxTemp < str.length()
            && str.charAt(i + maxTemp) == str.charAt(i + maxTemp - 1)) {
            maxTemp++;
        }

        if (maxTemp > maxLength)
            maxLength = maxTemp;

        i += maxTemp;
    }

    return maxLength;
}
