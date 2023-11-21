package FirstYear;

import java.util.Arrays;

public class Anagram {

  public static void main(String[] args) {

    String str1 = "Own";
    String str2 = "Now";

    str1 = str1.toLowerCase();
    str2 = str2.toLowerCase();

    // check if length is same
    if (str1.length() == str2.length()) {

      // convert string to char array
      char[] charArray1 = str1.toCharArray();
      char[] charArray2 = str2.toCharArray();

      // sort the char Array
      Arrays.sort(charArray1);
      Arrays.sort(charArray2);

      // if sorted charArrays are same
      // then the string is anagram
      boolean result = Arrays.equals(charArray1, charArray2);

      if (result) {
        System.out.println(str1 + " and " + str2 + " are Anagram. ");
      } else {
        System.out.println(str1 + " and " + str2 + " are not anagram. ");
      }

    } else {
      System.out.println(str1 + " and " + str2 + " are not anagram. ");
    }

  }

}
