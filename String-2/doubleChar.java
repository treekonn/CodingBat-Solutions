/*
    Given a string, return a string where for every char in the original, there are two chars.

    doubleChar("The") → "TThhee"
    doubleChar("AAbb") → "AAAAbbbb"
    doubleChar("Hi-There") → "HHii--TThheerree"
*/

public String doubleChar(String str) {
    char[] res = new char[str.length() * 2];

    for (int i = 0; i < str.length(); i++) {
        res[2 * i] = str.charAt(i);
        res[2 * i + 1] = str.charAt(i);
    }

    return new String(res);
}
