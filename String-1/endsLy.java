/*
    Given a string, return true if it ends in "ly".

    endsLy("oddly") → true
    endsLy("y") → false
    endsLy("oddy") → false
*/

public boolean endsLy(String str) {
    // universal solution, any value $temp
    String temp = "ly";

    if (str.length() < temp.length())
        return false;

    return str.substring(str.length() - temp.length()).equals(temp);
}
