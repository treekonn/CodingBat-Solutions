/*
    Given a string, return a string length 2 made of its first 2 chars.
    If the string length is less than 2, use '@' for the missing chars.

    atFirst("hello") → "he"
    atFirst("hi") → "hi"
    atFirst("h") → "h@"
*/

public String atFirst(String str) {
    // universal solution
    int count = 2;
    char symbol = '@';

    return atFirst(str, count, symbol);
}

private String atFirst(String str, int count, char symbol) {
    String res;

    res = (count > str.length()) ? str : str.substring(0, count);

    for (int i = res.length(); i < count; i++) {
        res += symbol;
    }

    return res;
}
