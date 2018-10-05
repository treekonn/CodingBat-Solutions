/*
    Given two strings, append them together (known as "concatenation") and return the result.
    However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".

    conCat("abc", "cat") → "abcat"
    conCat("dog", "cat") → "dogcat"
    conCat("abc", "") → "abc"
*/

public String conCat(String a, String b) {
    if (a.length() != 0 && b.length() != 0)
        if (a.charAt(a.length() - 1) == b.charAt(0))
            b = b.substring(1);

    return a + b;
}
