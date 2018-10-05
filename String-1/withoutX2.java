/*
    Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars,
    and otherwise return the string unchanged. This is a little harder than it looks.

    withoutX2("xHi") → "Hi"
    withoutX2("Hxi") → "Hi"
    withoutX2("Hi") → "Hi"
*/

public String withoutX2(String str) {
    // universal solution
    int countPos = 2;
    char[] badSymbols = {'x'};

    return withoutSymbolsInPosition(str, countPos, badSymbols);
}

private String withoutSymbolsInPosition(String str, int countPos, char[] symbols) {
    int i = 0;
    String res = "";

    while (i < str.length() && i < countPos) {
        if (!haveInSymbolPool(str.charAt(i), symbols))
            res += str.charAt(i);
        i++;
    }

    return res + str.substring(i);
}

private boolean haveInSymbolPool(char original, char[] symbolPool) {
    return (indexInSymbolPool(original, symbolPool) != -1);
}

private int indexInSymbolPool(char original, char[] symbolPool) {
    for (int i = 0; i < symbolPool.length; i++) {
        if (original == symbolPool[i])
            return i;
    }

    return -1;
}
