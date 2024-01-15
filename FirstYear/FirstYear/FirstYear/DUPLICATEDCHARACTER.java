package FirstYear;

public class DUPLICATEDCHARACTER {

  public static void main(String[] args) {

    String string1 = "Duplicated character";
    int count;

    // Converts given string into character array
    char string[] = string1.toCharArray();

    System.out.println("Duplecate character is an given string:");

    // Count each character present in the string
    for (int i = 0; i < string.length; i++) {

      count = 1;

      for (int j = i + 1; j < string.length; j++) {
        if (string[i] == string[j] && string[i] != ' ') {

          count++;

          // Set string[j] to 0 to avoid printing visited character
          string[j] = '0';

        }
      }
      // A character is considered as duplicated if greater than 1
      if (count > 1 && string[i] != '0')
        System.out.println(string[i]);
    }

  }

}
