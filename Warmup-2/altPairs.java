/*
    Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".

    altPairs("kitten") → "kien"
    altPairs("Chocolate") → "Chole"
    altPairs("CodingHorror") → "Congrr"
*/

public String altPairs(String str) {
    String result = "";

    for (int i = 0; i < str.length(); i++) {
        result += str.charAt(i);
        if (i % 4 == 1)
            i += 2;
    }

    return result;
}
