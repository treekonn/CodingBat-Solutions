/*
    Given a string of any length, return a new string where the last 2 chars, if present,
    are swapped, so "coding" yields "codign".

    lastTwo("coding") → "codign"
    lastTwo("cat") → "cta"
    lastTwo("ab") → "ba"
*/

public String lastTwo(String str) {
    String res = "";

    if (str.length() >= 2) {
        res = str.substring(0, str.length() - 2);
        res += str.charAt(str.length() - 1);
        res += str.charAt(str.length() - 2);
    } else
        res = str;

    return res;
}
