/*
    Given two strings, base and remove, return a version of the base string where
    all instances of the remove string have been removed (not case sensitive).
    You may assume that the remove string is length 1 or more. Remove only non-overlapping instances,
    so with "xxx" removing "xx" leaves "x".

    withoutString("Hello there", "llo") → "He there"
    withoutString("Hello there", "e") → "Hllo thr"
    withoutString("Hello there", "x") → "Hello there"
*/

public String withoutString(String base, String remove) {
    String res = "";
    int i = 0;

    while (i < base.length()) {
        if (((i + remove.length()) <= base.length())
            && base.substring(i, i + remove.length()).equalsIgnoreCase(remove)) {
            i += remove.length();
        } else {
            res += base.charAt(i);
            i++;
        }
    }

    return res;
}
