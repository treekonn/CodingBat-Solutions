/*
    Given a string, return true if "bad" appears starting at index 0 or 1 in the string,
    such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0.
    Note: use .equals() to compare 2 strings.

    hasBad("badxx") → true
    hasBad("xbadxx") → true
    hasBad("xxbadxx") → false
*/

public boolean hasBad(String str) {
    // universal solution
    int countPos = 2;  // count position for starting $word
    String word = "bad"; // word for searching

    return haveWord(str, countPos, word);
}

public boolean haveWord(String str, int countPos, String word) {
    if (str.length() >= word.length()) {
        for (int i = 0; i < countPos && (i + word.length() <= str.length()); i++) {
            if (str.substring(i, i + word.length()).equals(word))
                return true;
        }
    }

    return false;
}

