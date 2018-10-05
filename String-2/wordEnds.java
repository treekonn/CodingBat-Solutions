/*
    Given a string and a non-empty word string, return a string made of each char just before and
    just after every appearance of the word in the string. Ignore cases where there
    is no char before or after the word, and a char may be included twice if it is between two words.

    wordEnds("abcXY123XYijk", "XY") → "c13i"
    wordEnds("XY123XY", "XY") → "13"
    wordEnds("XY1XY", "XY") → "11"
*/

public String wordEnds(String str, String word) {
    String res = "";
    int i = 0;

    while (i + word.length() <= str.length()) {
        if (str.substring(i, i + word.length()).equals(word)) {
            if (i != 0)
                res += str.charAt(i - 1);
            if (i != str.length() - word.length())
                res += str.charAt(i + word.length());
            i += word.length();
        } else
            i++;
    }


    return res;
}
