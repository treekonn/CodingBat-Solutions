/*
    Given a string, return a version where all the "x" have been removed.
    Except an "x" at the very start or end should not be removed.

    stringX("xxHxix") → "xHix"
    stringX("abxxxcd") → "abcd"
    stringX("xabxxxcdx") → "xabcdx"
*/

public String stringX(String str) {
    String result = "";

    if (str.length() < 3)
        return str;

    result += str.charAt(0);
    for (int i = 1; i < str.length() - 1; i++) {
        if (str.charAt(i) != 'x')
            result += str.charAt(i);
    }
    result += str.charAt(str.length() - 1);

    return result;
}
