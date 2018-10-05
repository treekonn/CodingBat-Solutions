/*
    Return the number of times that the string "code" appears anywhere in the given string,
    except we'll accept any letter for the 'd', so "cope" and "cooe" count.

    countCode("aaacodebbb") → 1
    countCode("codexxcode") → 2
    countCode("cozexxcope") → 2
*/

public int countCode(String str) {
    String wordMask = "co*e";

    return countWordMask(str, wordMask);
}

public int countWordMask(String str, String wordMask) {
    int checkIndex;
    int count = 0;

    for (int i = 0; i + wordMask.length() <= str.length(); i++) {
        checkIndex = 0;

        while (checkIndex < wordMask.length()
            && (wordMask.charAt(checkIndex) == '*'
            || wordMask.charAt(checkIndex) == str.charAt(i + checkIndex))) {
            checkIndex++;
        }

        if (checkIndex == wordMask.length())
            count++;
    }

    return count;
}
