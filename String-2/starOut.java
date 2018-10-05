/*
    Return a version of the given string, where for every star (*) in the string the star
    and the chars immediately to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".

    starOut("ab*cd") → "ad"
    starOut("ab**cd") → "ad"
    starOut("sm*eilly") → "silly"
*/

public String starOut(String str) {
    String res = "";
    str = " " + str + " ";

    for (int i = 1; i + 1 < str.length(); i++) {
        if (!(str.charAt(i) == '*')) {
            if ((str.charAt(i - 1) != '*')
                && (str.charAt(i + 1) != '*')) {
                res += str.charAt(i);
            }
        }
    }

    return res;
}