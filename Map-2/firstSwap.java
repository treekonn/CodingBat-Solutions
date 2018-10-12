/*
    We'll say that 2 strings "match" if they are non-empty and their first chars are the same.
    Loop over and then return the given array of non-empty strings as follows:
    if a string matches an earlier string in the array, swap the 2 strings in the array.
    A particular first char can only cause 1 swap, so once a char has caused a swap,
    its later swaps are disabled. Using a map, this can be solved making just one pass over the array.
    More difficult than it looks.

    firstSwap(["ab", "ac"]) → ["ac", "ab"]
    firstSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"])
            → ["ay", "by", "cy", "cx", "bx", "ax", "aaa", "azz"]
    firstSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"])
            → ["ay", "by", "ax", "bx", "ai", "aj", "bx", "by"]
*/

public String[] firstSwap(String[] strings) {
    Map<Character, Integer> map = new HashMap<Character, Integer>();
    Character tempKey;
    String tempStr;
    Integer tempIndex;

    for (int i = 0; i < strings.length; i++) {
        tempKey = strings[i].charAt(0);

        if (!map.containsKey(tempKey)) {
            map.put(tempKey, i);
        } else {
            tempIndex = map.get(tempKey);

            if (tempIndex != null) {
                tempStr = strings[i];
                strings[i] = strings[tempIndex];
                strings[tempIndex] = tempStr;

                map.put(tempKey, null);
            }
        }
    }

    return strings;
}
