/*
    Given an array of non-empty strings, return a Map<String, String> with a key
    for every different first character seen, with the value of all the strings starting
    with that character appended together in the order they appear in the array.

    firstChar(["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t": "teatoast"}
    firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
    firstChar([]) → {}
*/

public Map<String, String> firstChar(String[] strings) {
    Map<String, String> map = new HashMap<String, String>();
    String tempKey;

    for (int i = 0; i < strings.length; i++) {
        if (strings[i].length() > 0) {
            tempKey = strings[i].substring(0, 1);

            if (!map.containsKey(tempKey))
                map.put(tempKey, strings[i]);
            else
                map.put(tempKey, map.get(tempKey).concat(strings[i]));
        }
    }

    return map;
}
