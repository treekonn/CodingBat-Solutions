/*
    Given a list of strings, return a list where each string is converted to lower case
    (Note: String toLowerCase() method).

    lower(["Hello", "Hi"]) → ["hello", "hi"]
    lower(["AAA", "BBB", "ccc"]) → ["aaa", "bbb", "ccc"]
    lower(["KitteN", "ChocolaTE"]) → ["kitten", "chocolate"]
*/

public List<String> lower(List<String> strings) {
    return strings.stream()
                .map(s -> s.toLowerCase())
                .collect(Collectors.toList());
}
