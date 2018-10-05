/*
    A sandwich is two pieces of bread with something in between. Return the string that
    is between the first and last appearance of "bread" in the given string,
    or return the empty string "" if there are not two pieces of bread.

    getSandwich("breadjambread") → "jam"
    getSandwich("xxbreadjambreadyy") → "jam"
    getSandwich("xxbreadyy") → ""
*/

public String getSandwich(String str) {
    // universal solution
    String word1 = "bread";
    String word2 = "bread";

    return getSandwich(str, word1, word2);
}

private String getSandwich(String str, String bottom, String top) {
    String res = "";
    int firstWordId = -1;
    int lastWordId = -1;

    for (int i = 0; (i + bottom.length() + top.length()) <= str.length(); i++) {
        if (str.substring(i, i + bottom.length()).equals(bottom)) {
            firstWordId = i;
            break;
        }
    }
    if (firstWordId == -1)
        return res;

    for (int i = str.length() - top.length(); i > firstWordId; i--) {
        if (str.substring(i, i + top.length()).equals(top)) {
            lastWordId = i;
            break;
        }
    }
    if (lastWordId == -1)
        return res;

    return str.substring(firstWordId + bottom.length(), lastWordId);
}
