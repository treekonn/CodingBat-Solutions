/*
    Given a string, consider the prefix string made of the first N chars of the string.
    Does that prefix string appear somewhere else in the string? Assume that
    the string is not empty and that N is in the range 1..str.length().

    prefixAgain("abXYabc", 1) → true
    prefixAgain("abXYabc", 2) → true
    prefixAgain("abXYabc", 3) → false
*/

public boolean prefixAgain(String str, int n) {
    String prefix;

    if (n > str.length())
        n = str.length();

    prefix = str.substring(0, n);

    for (int i = 1; (i + prefix.length()) <= str.length(); i++) {
        if (str.substring(i, i + prefix.length()).equals(prefix))
            return true;
    }

    return false;
}
