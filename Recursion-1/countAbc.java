/*
    Count recursively the total number of "abc" and "aba" substrings that appear in the given string.

    countAbc("abc") → 1
    countAbc("abcxxabc") → 2
    countAbc("abaxxaba") → 2
*/

public int countAbc(String str) {
    if (str.length() < 3)
        return 0;

    if (str.substring(0, 2).equals("ab") && (str.charAt(2) == 'c' || str.charAt(2) == 'a'))
        return 1 + countAbc(str.substring(1));

    return countAbc(str.substring(1));
}
