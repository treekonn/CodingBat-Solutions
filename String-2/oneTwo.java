/*
    Given a string, compute a new string by moving the first char to come after the next two chars,
    so "abc" yields "bca". Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd".
    Ignore any group of fewer than 3 chars at the end.

    oneTwo("abc") → "bca"
    oneTwo("tca") → "cat"
    oneTwo("tcagdo") → "catdog"
*/

public String oneTwo(String str) {
    char[] res = new char[str.length() / 3 * 3];

    for (int i = 0; i < str.length() - 2; i += 3) {
        res[i] = str.charAt(i + 1);
        res[i + 1] = str.charAt(i + 2);
        res[i + 2] = str.charAt(i);
    }

    return new String(res);
}
