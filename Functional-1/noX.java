/*
    Given a list of strings, return a list where each string has all its "x" removed.

    noX(["ax", "bb", "cx"]) → ["a", "bb", "c"]
    noX(["xxax", "xbxbx", "xxcx"]) → ["a", "bb", "c"]
    noX(["x"]) → [""]
*/

public List<String> noX(List<String> strings) {
    strings.replaceAll(s -> removeSymbol(s, 'x'));

    return strings;
}

private String removeSymbol(String str, char symbol) {
    String res = "";

    for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) != symbol) {
            res += str.charAt(i);
        }
    }

    return res;
}
