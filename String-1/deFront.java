/*
    Given a string, return a version without the first 2 chars. Except keep the first char
    if it is 'a' and keep the second char if it is 'b'. The string may be any length. Harder than it looks.

    deFront("Hello") → "llo"
    deFront("java") → "va"
    deFront("away") → "aay"
*/

public String deFront(String str) {
    String res = "";

    if (str.length() > 0) {
        if (str.charAt(0) == 'a')
            res += str.charAt(0);
        if (str.length() > 1) {
            if (str.charAt(1) == 'b')
                res += str.charAt(1);
            res += str.substring(2);
        }
    }

    return res;
}
