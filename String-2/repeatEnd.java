/*
    Given a string and an int n, return a string made of n repetitions of the last n characters of the string.
    You may assume that n is between 0 and the length of the string, inclusive.

    repeatEnd("Hello", 3) → "llollollo"
    repeatEnd("Hello", 2) → "lolo"
    repeatEnd("Hello", 1) → "o"
*/

public String repeatEnd(String str, int n) {
    int countCopy = n;
    String result = "";
    String part;

    if (str.length() < n)
        n = str.length();

    part = str.substring(str.length() - n);

    for (int i = 0; i < countCopy; i++) {
        result += part;
    }

    return result;
}