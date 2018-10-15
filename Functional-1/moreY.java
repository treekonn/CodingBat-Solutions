/*
    Given a list of strings, return a list where each string has "y" added at its start and end.

    moreY(["a", "b", "c"]) → ["yay", "yby", "ycy"]
    moreY(["hello", "there"]) → ["yhelloy", "ytherey"]
    moreY(["yay"]) → ["yyayy"]
*/

public List<String> moreY(List<String> strings) {
    return strings.stream()
            .map(s -> 'y' + s + 'y')
            .collect(Collectors.toList());
}
