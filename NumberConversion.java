package NumberConversion;
import NumberConversion.NumberConversion;
import java.util.Scanner;

public class NumberConversion {

  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  int choice;
  
  do{
    System.out.println("====================================");
    System.out.println("=========Number Conversion==========");
    System.out.println("");
    System.out.println("  [1]BINARY TO DECIMAL");
    System.out.println("  [2]DECIMAL TO OCTAL");
    System.out.println("  [3]OCTAL TO HEXADECIMAL");
    System.out.println("  [4]HEXADECIMAL TO BINARY");
    System.out.println("  [5]EXIT.");
    System.out.println("");
    System.out.println("====================================");
    System.out.print(" Please enter your choice: ");
    choice = scanner.nextInt();
    scanner.nextLine();
    System.out.println("====================================");
    System.out.println("");
  
    switch (choice) {
      case 1:
      System.out.println("====================================");
      System.out.println("======== BINARY TO DECIMAL =========");
      System.out.println("");
      System.out.print(" Please enter Binary Number: ");
      String binaryString = scanner.nextLine();
      int decimal = Integer.parseInt(binaryString,2);
      System.out.println(" The Decimal number of "+ binaryString+" is "+decimal);
      System.out.print("");
      System.out.println("====================================");
      System.out.println("");
      break;
    
      case 2:
      System.out.println("====================================");
      System.out.println("======== DECIMAL TO OCTAL ==========");
      System.out.println("");
      System.out.print(" Please Enter decimal Number: ");
      int decimalNumber = scanner.nextInt();
      scanner.nextLine();
      String octalNumber = Integer.toOctalString(decimalNumber);
      System.out.println(" The Oct number of "+ decimalNumber + " is "+  octalNumber);
      System.out.println("====================================");
      break;
    
      case 3:
      System.out.println("====================================");
      System.out.println("======= OCTAL TO HEXADECIMAL =======");
      System.out.println("");
      System.out.print(" Please Enter Octal Number: ");
      String octnum = scanner.nextLine();
      int decnum = Integer.parseInt(octnum,8);
      String hexnum = Integer.toHexString(decnum).toUpperCase();
      System.out.println(" The Octal number of "+ octnum + " is " + hexnum);
      System.out.println("====================================");
      break;
    
      case 4:
      System.out.println("====================================");
      System.out.println("======== HEXAGONAL TO BINARY =======");
      System.out.println("");
      System.out.print(" Please Enter Hexbinary Number: ");
      int num = Integer.parseInt(scanner.nextLine(),16);
    
      String binary = Integer.toBinaryString(num);
      System.out.println(binary);
      System.out.println("====================================");
      break;
    
      case 5:
      System.out.println(" [INFO] EXITING THE APPLICATION..");
      System.out.println("  Thank you, Good bye!!");
      break;
    
      default :
      System.out.println(" You Enter an invalid Key!!");
      
     }
    }while(choice!=5);
    scanner.close();
   }
  }
  

