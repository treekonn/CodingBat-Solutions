/*
    Given two strings, return true if either of the strings appears at the very end of the other string,
    ignoring upper/lower case differences (in other words, the computation should not be "case sensitive").
    Note: str.toLowerCase() returns the lowercase version of a string.

    endOther("Hiabc", "abc") → true
    endOther("AbC", "HiaBc") → true
    endOther("abc", "abXabc") → true
*/

public boolean endOther(String a, String b) {
    String max;
    String min;

    if (a.length() < b.length()) {
        min = a;
        max = b;
    } else {
        min = b;
        max = a;
    }

    return (max.substring(max.length() - min.length())
               .toLowerCase()
               .equals(min.toLowerCase()));
}
