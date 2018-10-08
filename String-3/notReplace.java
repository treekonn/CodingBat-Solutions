/*
    Given a string, return a string where every appearance of the lowercase word "is" has been replaced with "is not".
    The word "is" should not be immediately preceeded or followed by a letter -- so for example
    the "is" in "this" does not count. (Note: Character.isLetter(char) tests if a char is a letter.)

    notReplace("is test") → "is not test"
    notReplace("is-is") → "is not-is not"
    notReplace("This is right") → "This is not right"
*/

public String notReplace(String str) {
    // universal solution (any $replace and any $word)
    String res = "";
    String replace = "is not";
    String word = "is";
    int i = 1;
    str = " " + str + " ";

    while (i < str.length() - 1) {
        if (i + word.length() <= str.length()
            && (!Character.isLetter(str.charAt(i - 1)))
            && (!Character.isLetter(str.charAt(i + word.length())))) {
            if (str.substring(i, i + word.length()).equals(word)) {
                res += replace;
                i += word.length();
            } else {
                res += str.charAt(i);
                i++;
            }
        } else {
            res += str.charAt(i);
            i++;
        }
    }

    return res;
}
