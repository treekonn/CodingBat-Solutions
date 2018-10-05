/*
    Given a string, return a new string made of 3 copies of the first 2 chars of the original string.
    The string may be any length. If there are fewer than 2 chars, use whatever is there.

    extraFront("Hello") → "HeHeHe"
    extraFront("ab") → "ababab"
    extraFront("H") → "HHH"
*/

public String extraFront(String str) {
    // universal solution
    int countCopies = 3;
    int countChar = 2;

    return subAndCopyFront(str, countCopies, countChar);
}

public String subAndCopyFront(String str, int countCopies, int countChar) {
    String front;
    String res = "";

    if (str.length() < countChar)
        countChar = str.length();

    front = str.substring(0, countChar);

    for (int i = 0; i < countCopies; i++)
        res += front;

    return res;
}