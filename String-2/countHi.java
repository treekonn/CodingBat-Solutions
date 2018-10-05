/*
    Return the number of times that the string "hi" appears anywhere in the given string.

    countHi("abc hi ho") → 1
    countHi("ABChi hi") → 2
    countHi("hihi") → 2
*/

public int countHi(String str) {
    // universal solution, any value of string
    String ref = "hi";

    return countWord(str, ref);
}

public int countWord(String str, String word) {
    int count = 0;

    for (int i = 0; i + word.length() <= str.length(); i++) {
        if (str.substring(i, i + word.length()).equals(word))
            count++;
    }

    return count;
}