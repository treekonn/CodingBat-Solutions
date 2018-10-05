/*
    Return true if the string "cat" and "dog" appear the same number of times in the given string.

    catDog("catdog") → true
    catDog("catcat") → false
    catDog("1cat1cadodog") → true
*/

public boolean catDog(String str) {
    String word1 = "cat";
    String word2 = "dog";

    return (countWord(str, word1) == countWord(str, word2));
}

public int countWord(String str, String word) {
    int count = 0;

    for (int i = 0; i + word.length() <= str.length(); i++) {
        if (str.substring(i, i + word.length()).equals(word))
            count++;
    }

    return count;
}