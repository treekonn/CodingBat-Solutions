/*
    Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.

    bobThere("abcbob") → true
    bobThere("b9b") → true
    bobThere("bac") → false
*/

public boolean bobThere(String str) {
    String wordMask = "b*b";

    return haveWordMask(str, wordMask);
}

public boolean haveWordMask(String str, String wordMask) {
    int checkIndex;

    for (int i = 0; i + wordMask.length() <= str.length(); i++) {
        checkIndex = 0;

        while (checkIndex < wordMask.length()
            && (wordMask.charAt(checkIndex) == '*'
            || wordMask.charAt(checkIndex) == str.charAt(i + checkIndex))) {
            checkIndex++;
        }

        if (checkIndex == wordMask.length())
            return true;
    }

    return false;
}
