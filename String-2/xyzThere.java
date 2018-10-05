/*
    Return true if the given string contains an appearance of "xyz" where
    the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.

    xyzThere("abcxyz") → true
    xyzThere("abc.xyz") → false
    xyzThere("xyz.abc") → true
*/

public boolean xyzThere(String str) {
    String word = "xyz";
    str = " " + str;

    for (int i = 1; i + word.length() <= str.length(); i++) {
        if (str.substring(i, i + word.length()).equals(word))
            if (str.charAt(i - 1) != '.')
                return true;
    }

    return false;
}
