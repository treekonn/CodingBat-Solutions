/*
    We'll say that a "triple" in a string is a char appearing three times in a row.
    Return the number of triples in the given string. The triples may overlap.

    countTriple("abcXXXabc") → 1
    countTriple("xxxabyyyycd") → 3
    countTriple("a") → 0
*/

public int countTriple(String str) {
    // universal solution
    return countReiterationChar(str, 3);
}

private int countReiterationChar(String str, int countRow) {
    int count = 0;
    int countRepeat;

    for (int i = 0; i + countRow <= str.length(); i++) {
        countRepeat = 1;

        while (countRepeat < countRow
            && str.charAt(i + countRepeat - 1) == str.charAt(i + countRepeat)) {
            countRepeat++;
        }

        if (countRepeat == countRow)
            count++;
    }

    return count;
}