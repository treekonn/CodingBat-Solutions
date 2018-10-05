/*
    Given a string, if the string begins with "red" or "blue" return that color string,
    otherwise return the empty string.

    seeColor("redxx") → "red"
    seeColor("xxred") → ""
    seeColor("blueTimes") → "blue"
*/

public String seeColor(String str) {
    // universal solution
    String[] colors = new String[2];
    colors[0] = "red";
    colors[1] = "blue";
    int checkPos = 0;

    return copyWordsInPosition(str, colors, checkPos);
}

public String copyWordsInPosition(String str, String[] words, int position) {
    String res = "";

    for (int i = 0; i < words.length; i++) {
        if (position + words[i].length() <= str.length())
            if (str.substring(position, position + words[i].length()).equals(words[i]))
                res += words[i];
    }

    return res;
}
