/*
    Given a string, return the sum of the numbers appearing in the string, ignoring all other characters.
    A number is a series of 1 or more digit chars in a row.
    (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'.
    Integer.parseInt(string) converts a string to an int.)

    sumNumbers("abc123xyz") → 123
    sumNumbers("aa11b33") → 44
    sumNumbers("7 11") → 18
*/

public int sumNumbers(String str) {
    int sum = 0;
    int num = 0;
    boolean isDigit = false;

    for (int i = 0; i < str.length(); i++) {
        if (Character.isDigit(str.charAt(i))) {
            if (isDigit) {
                num = num * 10 + str.charAt(i) - '0';
            } else {
                isDigit = true;
                num = str.charAt(i) - '0';
            }
        } else if (isDigit) {
            sum += num;
            num = 0;
            isDigit = false;
        }
    }

    sum += num;

    return sum;
}
