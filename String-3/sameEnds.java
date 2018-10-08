/*
    Given a string, return the longest substring that appears at both the beginning and
    end of the string without overlapping. For example, sameEnds("abXab") is "ab".

    sameEnds("abXYab") → "ab"
    sameEnds("xx") → "x"
    sameEnds("xxx") → "x"
*/

public String sameEnds(String string) {
    int max = 0;
    String first;
    String end;

    for (int i = string.length() / 2; i >= 0; i--) {
        first = string.substring(0, i);
        end = string.substring(string.length() - i);

        if (first.equals(end)) {
            max = i;
            break;
        }
    }

    return string.substring(0, max);
}
