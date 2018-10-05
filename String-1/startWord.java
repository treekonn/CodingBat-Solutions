/*
    Given a string and a second "word" string, we'll say that the word matches the string
    if it appears at the front of the string, except its first char does not need to match exactly.
    On a match, return the front of the string, or otherwise return the empty string.
    So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip".
    The word will be at least length 1.

    startWord("hippo", "hi") → "hi"
    startWord("hippo", "xip") → "hip"
    startWord("hippo", "i") → "h"
*/

public String startWord(String str, String word) {
    String res = "";

    if (str.length() < 1 || word.length() < 1)
        return res;

    if (word.length() <= 1)
        res = str.substring(0, word.length());
    else if (word.length() <= str.length())
        if (str.substring(1, word.length()).equals(word.substring(1)))
            res = str.substring(0, word.length());

    return res;
}
