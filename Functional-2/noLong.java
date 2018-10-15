/*
    Given a list of strings, return a list of the strings, omitting any string length 4 or more.

    noLong(["this", "not", "too", "long"]) → ["not", "too"]
    noLong(["a", "bbb", "cccc"]) → ["a", "bbb"]
    noLong(["cccc", "cccc", "cccc"]) → []
*/

public List<String> noLong(List<String> strings) {
    strings.removeIf(s -> s.length() > 3);

    return strings;
}
