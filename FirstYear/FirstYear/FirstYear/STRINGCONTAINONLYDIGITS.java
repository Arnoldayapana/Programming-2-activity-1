
public class STRINGCONTAINONLYDIGITS {

  public static void main(String[] args) {
    String str = "04102002";
    boolean results = str.matches("[0-9]+");
    System.out.println("Original string : " + str);
    System.out.println("Does string contain only digits? : " + results);

  }

}
