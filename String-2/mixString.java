/*
    Given two strings, a and b, create a bigger string made of the first char of a,
    the first char of b, the second char of a, the second char of b, and so on.
    Any leftover chars go at the end of the result.

    mixString("abc", "xyz") → "axbycz"
    mixString("Hi", "There") → "HTihere"
    mixString("xxxx", "There") → "xTxhxexre"
*/

public String mixString(String a, String b) {
    char[] result = new char[a.length() + b.length()];

    int countA = 0;
    int countB = 0;

    while (countA + countB < a.length() + b.length()) {
        if (countA < a.length()) {
            result[countA + countB] = a.charAt(countA);
            countA++;
        }
        if (countB < b.length()) {
            result[countA + countB] = b.charAt(countB);
            countB++;
        }
    }

    return new String(result);
}
