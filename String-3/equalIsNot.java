/*
    Given a string, return true if the number of appearances of "is" anywhere in the string is
    equal to the number of appearances of "not" anywhere in the string (case sensitive).

    equalIsNot("This is not") → false
    equalIsNot("This is notnot") → true
    equalIsNot("noisxxnotyynotxisi") → true
*/

public boolean equalIsNot(String str) {
    String s1 = "not";
    String s2 = "is";

    return countStrInStr(s1, str) == countStrInStr(s2, str);
}

public int countStrInStr(String part, String str) {
    int count = 0;
    int i = 0;

    while (i + part.length() <= str.length()) {
        if (str.substring(i, part.length() + i).equals(part)) {
            count++;
            i += part.length();
        } else
            i++;
    }

    return count;
}
