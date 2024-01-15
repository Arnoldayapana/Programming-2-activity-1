package OrderingSystem;
import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderingSystem {
	private static Scanner scanner = new Scanner(System.in);
	private static List<User> users = new ArrayList<>();
	private static User loggedInUser;

	public static void main(String[] args) {
		clearScreen();
		showMainMenu();
	}
	private static void clearScreen() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	  }

	private static void showMainMenu() {
		if(loggedInUser != null){
			showFoodMenu();
			return;
		}
		
		System.out.println("\n");
		System.out.println("\t-------------------------------------");
		System.out.println("\t|  WELCOME TO FOOD ORDERING SYSTEM  |");
		System.out.println("\t-------------------------------------");
		System.out.println("\t|	    1.CREATE ACCOUNT   	    |");
		System.out.println("\t|	    2.LOGIN ACCOUNT         |");
		System.out.println("\t-------------------------------------");
		System.out.print("		Choose: ");
		int choice = scanner.nextInt();
		scanner.nextLine();
		clearScreen();
		
		switch (choice){
		case 1:
			createAccount();
			break;
		case 2:
			logInAccount();
			break;
		default:
			System.out.print("		   Invalid choice. Please try again.");
			clearScreen();
			showMainMenu();
			break;
		}	
	}

	private static void createAccount() {
		String a = "|";
		System.out.println("\n");
		System.out.println("\t------------------------------------");
		System.out.println("\t|	  1.CREATE YOUR ACCOUNT    |");
		System.out.println("\t------------------------------------");
		System.out.print("\t| Name: ");
		String name = scanner.nextLine();
		clearScreen();
		
		System.out.println("\n");
		System.out.println("\t------------------------------------");
		System.out.println("\t|	  1.CREATE YOUR ACCOUNT    |");
		System.out.println("\t------------------------------------");
		System.out.printf("\t| Name: %-26s %s \n", name,a);
		System.out.printf("\t| Password: ",a);
		String password = scanner.nextLine();
		User newUser = new User(name, password);
		users.add(newUser);
		clearScreen();
		
		System.out.println("\n");
		System.out.println("\t------------------------------------------");
		System.out.println("\t|	  1.CREATE YOUR ACCOUNT        |");
		System.out.println("\t------------------------------------------");
		System.out.printf("\t| Name: %-30s %s \n",name,a);
		System.out.printf("\t| Password: %-26s %s\n","########",a);
		System.out.println("\t------------------------------------------");
		System.out.println("\t| Account successfully created         "  +a);
		System.out.println("\t| please enter to continue..           "  +a);
		System.out.println("\t-----------------------------------------");
		scanner.nextLine();
		clearScreen();
		showMainMenu();
	}
	private static void logInAccount() {
		String a = "|";
		System.out.println("\n");
		System.out.println("\t------------------------------------");
		System.out.println("\t|        1.LOGIN YOUR ACCOUNT    |");
		System.out.println("\t------------------------------------");
		System.out.print("\t| Name: ");
		String name = scanner.nextLine();
		clearScreen();
		

		System.out.println("\n");
		System.out.println("\t------------------------------------");
		System.out.println("\t|        1.LOGIN YOUR ACCOUNT    |");
		System.out.println("\t------------------------------------");
		System.out.printf("\t| Name: %-26s %s \n", name,a);
		System.out.printf("\t| Password: ");
		String password = scanner.nextLine();
		
		clearScreen();
		
		System.out.println("\n");
		System.out.println("\t------------------------------------");
		System.out.println("\t|        1.LOGIN YOUR ACCOUNT    |");
		System.out.println("\t------------------------------------");
		System.out.printf("\t| Name: %-26s %s \n",name,a);
		System.out.printf("\t| Password: %-22s %s \n","########",a);
		System.out.println("\t------------------------------------");
		
		for(User user:users) {
			if(user.getName().equals(name) && user.getPassword().equals(password)) {
				loggedInUser=user;
				System.out.println("\n	         You are now logged in");
				System.out.println("               Please enter to continue..");
				System.out.println();
				scanner.nextLine();
				clearScreen();
				showMainMenu();
				return;
			}
		}
		System.out.println("\n	Invalid username or password");
		System.out.println("	pleease try again.");
		scanner.nextLine();
		clearScreen();
		showMainMenu();
	}
	
	private static void showFoodMenu(){
		System.out.println("\n");
		System.out.println("---------------------------------");
		System.out.println("|      	   FOOD MENU       |");
		System.out.println("---------------------------------");
		System.out.println("| 0. Log Out.");
		System.out.println("---------------------------------");
		System.out.println("| 1.  Chicken		| 70.00 |");
		System.out.println("| 2.  Sandwich		| 30.00 |");
		System.out.println("| 3.  Pizza     	| 175.00|");
		System.out.println("| 4.  Burger		| 90.00 |");
		System.out.println("| 5.  Fries     	| 70.00 |");
		System.out.println("| 6.  Pancake		| 30.00 |");
		System.out.println("| 7.  Donut	    	| 50.00 |");
		System.out.println("| 8.  Cake	    	| 240.00|");
		System.out.println("| 9.  Waffle		| 25.00 |");
		System.out.println("---------------------------------");
		System.out.print(" Choice: ");
		int choice =scanner.nextInt();
		scanner.nextLine();
		
		switch(choice) {
			case 0:
				loggedInUser = null;
				clearScreen();
				showMainMenu();
				break;
			case 1:
				chickenFlavor("Chicken");
				break;
			case 2:
				sandwichFlavor("Sandwich");
				break;
			case 3:
				pizzaFlavor("Sandwich");
				break;
			case 4:
				burgerFlavor("Burge");
				break;
			case 5:
				friesFlavor("Fries");
				break;
			case 6:
				pancakeFlavor("Pancake");
				break;
			case 7:
				donutFlavor("Donut");
				break;
			case 8:
				cakeFlavor("Cake");
				break;
			case 9:
				waffleFlavor("Waffle");
				break;
			default:
				System.out.println("	Invalid choice. please try again.. ");
				scanner.nextLine();
				clearScreen();
				showFoodMenu();
				break;
		}
	}
	private static void chickenFlavor(String foodName) {
		System.out.println("\n");
		System.out.println("---------------------------");
		System.out.println("|      FOOD FLAVOR  	 |");
		System.out.println("---------------------------");
		System.out.println("| 1.  Extra Spicy         |");
		System.out.println("| 2.  Grilled Gaarlic	  |");
		System.out.println("| 3.  Honey Spice         |");
		System.out.println("| 4.  Barbeque            |");
		System.out.println("| 5.  Original	          |");
		System.out.println("---------------------------");
		System.out.print(" Choice: ");
		int flavorChoice = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print(" Quantity: ");
		int quantity = scanner.nextInt();
		scanner.nextLine();
		
		String flavor = getChickenFlavorName(flavorChoice);
		double price = calculatePrice(foodName,quantity);
		loggedInUser.addOrder(new Order(foodName,flavor,quantity,price));
		
		System.out.println("\n");
		System.out.println(" You order: " + flavor + ""+foodName);
		System.out.println("---------------------------");
		System.out.println("\n");
		System.out.println("------------------");
		System.out.println("  ADD MORE?    |");
		System.out.println("------------------");
		System.out.println("  1. YES       |");
		System.out.println("  2. NO        |");
		System.out.println("------------------");
		System.out.print("  Choice: ");
		int addChoice = scanner.nextInt();
		scanner.nextLine();
		
		if(addChoice == 1) {
			showFoodMenu();
		}else {
			System.out.println("\n");
			System.out.println("------------------------------------");
			System.out.println("   Proceed to the Contact Detail	");
			System.out.println("------------------------------------");
			scanner.nextLine();
			clearScreen();
			showContactDetail();
		}
	}
	private static void pizzaFlavor(String foodName) {
		System.out.println("\n");
		System.out.println("---------------------------");
		System.out.println("|      FOOD FLAVOR	  |");
		System.out.println("---------------------------");
		System.out.println("| 1.  Pepperoni           |");
		System.out.println("| 2.  Hawaiian            |");
		System.out.println("| 3.  Veggie              |");
		System.out.println("| 4.  Neapolitan          |");
		System.out.println("| 5.  Margherita          |");
		System.out.println("---------------------------");
		System.out.print(" Choice: ");
		int flavorChoice = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print(" Quantity: ");
		int quantity = scanner.nextInt();
		scanner.nextLine();
		
		String flavor = getPizzaFlavorName(flavorChoice);
		double price = calculatePrice(foodName,quantity);
		loggedInUser.addOrder(new Order(foodName,flavor,quantity,price));
		
		System.out.println("\n");
		System.out.println(" You order: " + flavor + ""+foodName);
		System.out.println("---------------------------");
		System.out.println("\n");
		System.out.println("------------------");
		System.out.println("  ADD MORE?    |");
		System.out.println("------------------");
		System.out.println("  1. YES       |");
		System.out.println("  2. NO        |");
		System.out.println("------------------");
		System.out.print("  Choice: ");
		int addChoice = scanner.nextInt();
		scanner.nextLine();
		
		if(addChoice == 1) {
			showFoodMenu();
		}else {
			System.out.println("\n");
			System.out.println("------------------------------------");
			System.out.println("   Proceed to the Contact Detail	");
			System.out.println("------------------------------------");
			scanner.nextLine();
			clearScreen();
			showContactDetail();
		}
	}
	private static void sandwichFlavor(String foodName) {
		System.out.println("\n");
		System.out.println("---------------------------");
		System.out.println("|      FOOD FLAVOR        |");
		System.out.println("---------------------------");
		System.out.println("| 1.  Bacon               |");
		System.out.println("| 2.  Egg & Ham	          |");
		System.out.println("| 3.  chocolate	          |");
		System.out.println("| 4.  Viggie	          |");
		System.out.println("| 5.  Classic	          |");
		System.out.println("---------------------------");
		System.out.print(" Choice: ");
		int flavorChoice = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print(" Quantity: ");
		int quantity = scanner.nextInt();
		scanner.nextLine();
		
		String flavor = getSandwichFlavorName(flavorChoice);
		double price = calculatePrice(foodName,quantity);
		loggedInUser.addOrder(new Order(foodName,flavor,quantity,price));
		
		System.out.println("\n");
		System.out.println(" You order: " + flavor + ""+foodName);
		System.out.println("---------------------------");
		System.out.println("\n");
		System.out.println("------------------");
		System.out.println("  ADD MORE?    |");
		System.out.println("------------------");
		System.out.println("  1. YES       |");
		System.out.println("  2. NO        |");
		System.out.println("------------------");
		System.out.print("  Choice: ");
		int addChoice = scanner.nextInt();
		scanner.nextLine();
		
		if(addChoice == 1) {
			showFoodMenu();
		}else {
			System.out.println("\n");
			System.out.println("------------------------------------");
			System.out.println("   Proceed to the Contact Detail	");
			System.out.println("------------------------------------");
			scanner.nextLine();
			clearScreen();
			showContactDetail();
		}
	}
	private static void burgerFlavor(String foodName) {
		System.out.println("\n");
		System.out.println("---------------------------");
		System.out.println("|      FOOD FLAVOR        |");
		System.out.println("---------------------------");
		System.out.println("| 1.  Mashroom	          |");
		System.out.println("| 2.  Grilled meat        |");
		System.out.println("| 3.  Beef                |");
		System.out.println("| 4.  Viggie	    	  |");
		System.out.println("| 5.  Cheese	          |");
		System.out.println("---------------------------");
		System.out.print(" Choice: ");
		int flavorChoice = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print(" Quantity: ");
		int quantity = scanner.nextInt();
		scanner.nextLine();
		
		String flavor = getBurgerFlavorName(flavorChoice);
		double price = calculatePrice(foodName,quantity);
		loggedInUser.addOrder(new Order(foodName,flavor,quantity,price));
		
		System.out.println("\n");
		System.out.println(" You order: " + flavor + ""+foodName);
		System.out.println("---------------------------");
		System.out.println("\n");
		System.out.println("------------------");
		System.out.println("  ADD MORE?    |");
		System.out.println("------------------");
		System.out.println("  1. YES       |");
		System.out.println("  2. NO        |");
		System.out.println("------------------");
		System.out.print("  Choice: ");
		int addChoice = scanner.nextInt();
		scanner.nextLine();
		
		if(addChoice == 1) {
			showFoodMenu();
		}else {
			System.out.println("\n");
			System.out.println("------------------------------------");
			System.out.println("   Proceed to the Contact Detail	");
			System.out.println("------------------------------------");
			scanner.nextLine();
			clearScreen();
			showContactDetail();
		}
	}
	private static void friesFlavor(String foodName) {
		System.out.println("\n");
		System.out.println("---------------------------");
		System.out.println("|      FOOD FLAVOR        |");
		System.out.println("---------------------------");
		System.out.println("| 1.  Garlic Butter       |");
		System.out.println("| 2.  Sweet Potato        |");
		System.out.println("| 3.  Chili Cheese        |");
		System.out.println("| 4.  Sour Cream          |");
		System.out.println("| 5.  Poutine             |");
		System.out.println("---------------------------");
		System.out.print(" Choice: ");
		int flavorChoice = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print(" Quantity: ");
		int quantity = scanner.nextInt();
		scanner.nextLine();
		
		String flavor = getFriesFlavorName(flavorChoice);
		double price = calculatePrice(foodName,quantity);
		loggedInUser.addOrder(new Order(foodName,flavor,quantity,price));
		
		System.out.println("\n");
		System.out.println(" You order: " + flavor + ""+foodName);
		System.out.println("---------------------------");
		System.out.println("\n");
		System.out.println("------------------");
		System.out.println("  ADD MORE?    |");
		System.out.println("------------------");
		System.out.println("  1. YES       |");
		System.out.println("  2. NO        |");
		System.out.println("------------------");
		System.out.print("  Choice: ");
		int addChoice = scanner.nextInt();
		scanner.nextLine();
		
		if(addChoice == 1) {
			showFoodMenu();
		}else {
			System.out.println("\n");
			System.out.println("------------------------------------");
			System.out.println("   Proceed to the Contact Detail	");
			System.out.println("------------------------------------");
			scanner.nextLine();
			clearScreen();
			showContactDetail();
		}
	}
	private static void pancakeFlavor(String foodName) {
		System.out.println("\n");
		System.out.println("---------------------------");
		System.out.println("|      FOOD FLAVOR        |");
		System.out.println("---------------------------");
		System.out.println("| 1.  Straberry           |");
		System.out.println("| 2.  Chocolate           |");
		System.out.println("| 3.  Ham                 |");
		System.out.println("| 4.  Cheese              |");
		System.out.println("| 5.  Sweet Butter        |");
		System.out.println("---------------------------");
		System.out.print(" Choice: ");
		int flavorChoice = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print(" Quantity: ");
		int quantity = scanner.nextInt();
		scanner.nextLine();
		
		String flavor = getPancakeFlavorName(flavorChoice);
		double price = calculatePrice(foodName,quantity);
		loggedInUser.addOrder(new Order(foodName,flavor,quantity,price));
		
		System.out.println("\n");
		System.out.println(" You order: " + flavor + ""+foodName);
		System.out.println("---------------------------");
		System.out.println("\n");
		System.out.println("------------------");
		System.out.println("  ADD MORE?    |");
		System.out.println("------------------");
		System.out.println("  1. YES       |");
		System.out.println("  2. NO        |");
		System.out.println("------------------");
		System.out.print("  Choice: ");
		int addChoice = scanner.nextInt();
		scanner.nextLine();
		
		if(addChoice == 1) {
			showFoodMenu();
		}else {
			System.out.println("\n");
			System.out.println("------------------------------------");
			System.out.println("   Proceed to the Contact Detail	");
			System.out.println("------------------------------------");
			scanner.nextLine();
			clearScreen();
			showContactDetail();
		}
	}
	private static void donutFlavor(String foodName) {
		System.out.println("\n");
		System.out.println("---------------------------");
		System.out.println("|      FOOD FLAVOR        |");
		System.out.println("---------------------------");
		System.out.println("| 1.  Glaze Chocolate	  |");
		System.out.println("| 2.  Bavariane Cream	  |");
		System.out.println("| 3.  Red Velvet          |");
		System.out.println("| 4.  Lemon Berry         |");
		System.out.println("| 5.  Boston Cream        |");
		System.out.println("---------------------------");
		System.out.print(" Choice: ");
		int flavorChoice = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print(" Quantity: ");
		int quantity = scanner.nextInt();
		scanner.nextLine();
		
		String flavor = getDonutFlavorName(flavorChoice);
		double price = calculatePrice(foodName,quantity);
		loggedInUser.addOrder(new Order(foodName,flavor,quantity,price));
		
		System.out.println("\n");
		System.out.println(" You order: " + flavor + ""+foodName);
		System.out.println("---------------------------");
		System.out.println("\n");
		System.out.println("------------------");
		System.out.println("  ADD MORE?    |");
		System.out.println("------------------");
		System.out.println("  1. YES       |");
		System.out.println("  2. NO        |");
		System.out.println("------------------");
		System.out.print("  Choice: ");
		int addChoice = scanner.nextInt();
		scanner.nextLine();
		
		if(addChoice == 1) {
			showFoodMenu();
		}else {
			System.out.println("\n");
			System.out.println("------------------------------------");
			System.out.println("   Proceed to the Contact Detail	");
			System.out.println("------------------------------------");
			scanner.nextLine();
			clearScreen();
			showContactDetail();
		}
	}
	private static void cakeFlavor(String foodName) {
		System.out.println("\n");
		System.out.println("---------------------------");
		System.out.println("|       FOOD FLAVOR       |");
		System.out.println("---------------------------");
		System.out.println("| 1.  strawberry          |");
		System.out.println("| 2.  Vanilla             |");
		System.out.println("| 3.  Coffe               |");
		System.out.println("| 4.  Bananas Froster     |");
		System.out.println("| 5.  Maple Bacon         |");
		System.out.println("---------------------------");
		System.out.print(" Choice: ");
		int flavorChoice = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print(" Quantity: ");
		int quantity = scanner.nextInt();
		scanner.nextLine();
		
		String flavor = getCakeFlavorName(flavorChoice);
		double price = calculatePrice(foodName,quantity);
		loggedInUser.addOrder(new Order(foodName,flavor,quantity,price));
		
		System.out.println("\n");
		System.out.println(" You order: " + flavor + ""+foodName);
		System.out.println("---------------------------");
		System.out.println("\n");
		System.out.println("------------------");
		System.out.println("  ADD MORE?    |");
		System.out.println("------------------");
		System.out.println("  1. YES       |");
		System.out.println("  2. NO        |");
		System.out.println("------------------");
		System.out.print("  Choice: ");
		int addChoice = scanner.nextInt();
		scanner.nextLine();
		
		if(addChoice == 1) {
			showFoodMenu();
		}else {
			System.out.println("\n");
			System.out.println("------------------------------------");
			System.out.println("   Proceed to the Contact Detail	");
			System.out.println("------------------------------------");
			scanner.nextLine();
			clearScreen();
			showContactDetail();
		}
	}
	private static void waffleFlavor(String foodName) {
		System.out.println("\n");
		System.out.println("---------------------------");
		System.out.println("|       FOOD FLAVOR       |");
		System.out.println("---------------------------");
		System.out.println("| 1.  strawberry          |");
		System.out.println("| 2.  Vanilla             |");
		System.out.println("| 3.  Coffe               |");
		System.out.println("| 4.  Bananas Froster     |");
		System.out.println("| 5.  Maple Bacon         |");
		System.out.println("---------------------------");
		System.out.print(" Choice: ");
		int flavorChoice = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print(" Quantity: ");
		int quantity = scanner.nextInt();
		scanner.nextLine();
		
		String flavor = getWaffleFlavorName(flavorChoice);
		double price = calculatePrice(foodName,quantity);
		loggedInUser.addOrder(new Order(foodName,flavor,quantity,price));
		
		System.out.println("\n");
		System.out.println(" You order: " + flavor + ""+foodName);
		System.out.println("---------------------------");
		System.out.println("\n");
		System.out.println("------------------");
		System.out.println("  ADD MORE?    |");
		System.out.println("------------------");
		System.out.println("  1. YES       |");
		System.out.println("  2. NO        |");
		System.out.println("------------------");
		System.out.print("  Choice: ");
		int addChoice = scanner.nextInt();
		scanner.nextLine();
		
		if(addChoice == 1) {
			showFoodMenu();
		}else {
			System.out.println("\n");
			System.out.println("------------------------------------");
			System.out.println("   Proceed to the Contact Detail	");
			System.out.println("------------------------------------");
			scanner.nextLine();
			clearScreen();
			showContactDetail();
		}
	}
	private static String getChickenFlavorName(int flavorChoice){
		switch(flavorChoice){
		case 1:
			return "Extra Spicy";
		case 2:
			return "Grilled Garlic";
		case 3:
			return "Honey Spice";
		case 4:
			return "Barbeque";
		case 5:
			return "Original";
		default:
			return "Invalid";
		}
	}
	private static String getSandwichFlavorName(int flavorChoice){
		switch(flavorChoice){
		case 1:
			return "Bacon";
		case 2:
			return "Egg & Ham";
		case 3:
			return "Chocolate";
		case 4:
			return "Viggie";
		case 5:
			return "Classic";
		default:
			return "Invalid";
		}
	}
	
	private static String getFriesFlavorName(int flavorChoice){
		switch(flavorChoice){
		case 1:
			return "Garlic Butter";
		case 2:
			return "Sweet Potato";
		case 3:
			return "Chili Cheese";
		case 4:
			return "Sour Cream";
		case 5:
			return "Poutine";
		default:
			return "Invalid";
		}
	}
	private static String getPizzaFlavorName(int flavorChoice){
		switch(flavorChoice){
		case 1:
			return "Pepperoni";
		case 2:
			return "Hawaiian";
		case 3:
			return "Veggie";
		case 4:
			return "Neapolitan";
		case 5:
			return "Margherita";
		default:
			return "Invalid";
		}
	}
	private static String getBurgerFlavorName(int flavorChoice){
		switch(flavorChoice){
		case 1:
			return "Mashroom";
		case 2:
			return "Grilled meat";
		case 3:
			return "Beef";
		case 4:
			return "Viggie";
		case 5:
			return "Cheese";
		default:
			return "Invalid";
		}
	}
	
	
	private static String getPancakeFlavorName(int flavorChoice){
		switch(flavorChoice){
		case 1:
			return "Straberry";
		case 2:
			return "Chocolate";
		case 3:
			return "Ham";
		case 4:
			return "Cheese";
		case 5:
			return "Sweet Butter";
		default:
			return "Invalid";
		}
	}
	private static String getDonutFlavorName(int flavorChoice){
		switch(flavorChoice){
		case 1:
			return "Glaze Chocolate";
		case 2:
			return "Bavariane Cream";
		case 3:
			return "Red Velvet";
		case 4:
			return "Lemon Berry";
		case 5:
			return "Boston Cream";
		default:
			return "Invalid";
		}
	}
	private static String getCakeFlavorName(int flavorChoice){
		switch(flavorChoice){
		case 1:
			return "strawberry";
		case 2:
			return "Vanilla";
		case 3:
			return "Coffe";
		case 4:
			return "Bananas Froster";
		case 5:
			return "Maple Bacon";
		default:
			return "Invalid";
		}
	}
	private static String getWaffleFlavorName(int flavorChoice){
		switch(flavorChoice){
		case 1:
			return "strawberry";
		case 2:
			return "Vanilla";
		case 3:
			return "Coffe";
		case 4:
			return "Bananas Froster";
		case 5:
			return "Maple Bacon";
		default:
			return "Invalid";
		}
	}
	
	public static void showContactDetail() {
		String country,fname,lname,no,address;
		String a ="	|";
		
		System.out.println("\n");
		System.out.println("---------------------------");
		System.out.println("|      ENTER YOUR DETAIL  |");
		System.out.println("---------------------------");
		System.out.print("| Country: ");
		country = scanner.nextLine();
		clearScreen();
		
		System.out.println("\n");
		System.out.println("---------------------------");
		System.out.println("|      ENTER YOUR DETAIL  |");
		System.out.println("---------------------------");
		System.out.printf(" | Country: %-7s %s\n",country,a);
		System.out.print(" | First Name: ");
		fname = scanner.nextLine();
		clearScreen();
		
		System.out.println("\n");
		System.out.println("---------------------------");
		System.out.println("|      ENTER YOUR DETAIL  |");
		System.out.println("---------------------------");
		System.out.printf(" | Country: %-7s %s\n",country,a);
		System.out.printf(" | First Name: %-7s %s\n",fname,a);
		System.out.print(" | Last Name: ");
		lname = scanner.nextLine();
		clearScreen();
		
		System.out.println("\n");
		System.out.println("---------------------------");
		System.out.println("|      ENTER YOUR DETAIL  |");
		System.out.println("---------------------------");
		System.out.printf(" | Country: %-7s %s\n",country,a);
		System.out.printf(" | First Name: %-7s %s\n",fname,a);
		System.out.printf(" | Last Name: %-7s %s\n",lname,a);
		System.out.print(" | N0 #: ");
		no = scanner.nextLine();
		clearScreen();
		
		System.out.println("\n");
		System.out.println("---------------------------");
		System.out.println("|      ENTER YOUR DETAIL  |");
		System.out.println("---------------------------");
		System.out.printf(" | Country: %-7s %s\n",country,a);
		System.out.printf(" | First Name: %-7s %s\n",fname,a);
		System.out.printf(" | Last Name: %-7s %s\n",lname,a);
		System.out.printf(" | No #: %-10s %s\n",no,a);
		System.out.print(" | Address: ");
		address = scanner.nextLine();
		clearScreen();
		
		System.out.println("\n");
		System.out.println("---------------------------");
		System.out.println("|    CONFIRM YOUR DETAIL  |");
		System.out.println("---------------------------");
		System.out.printf(" | Country: %-7s %s\n",country,a);
		System.out.printf(" | First Name: %-7s %s\n",fname,a);
		System.out.printf(" | Last Name: %-7s %s\n",lname,a);
		System.out.printf(" | No #: %-10s %s\n",no,a);
		System.out.printf(" | Address: %-10s %s\n",address,a);;
		System.out.println("----------------------------");
		System.out.println("  CONFIRMED YOUR DETAILES" );
		System.out.println("  PRESS ENTER TO CONTINUE" );
		System.out.println("----------------------------");
		scanner.nextLine();
		clearScreen();
		
		System.out.println("\n");
		System.out.println("---------------------------");
		System.out.println("	   YOUR DETAIL.        ");
		System.out.println("---------------------------");
		System.out.printf(" | Country: %-7s %s\n",country,a);
		System.out.printf(" | First Name: %-7s %s\n",fname,a);
		System.out.printf(" | Last Name: %-7s %s\n",lname,a);
		System.out.printf(" | No #: %-10s %s\n",no,a);
		System.out.printf(" | Address: %-10s %s\n",address,a);;
		System.out.println("----------------------------");
		System.out.println("  CONFIRMED YOUR DETAILES" );
		System.out.println("  PRESS ENTER TO CONTINUE" );
		System.out.println("----------------------------");
		System.out.println("\n");
		System.out.println("--------------------------");
		System.out.println("  LIST OF YOUR DETAIL.	");
		System.out.println("--------------------------");
		double total = 0;
		for(Order order : loggedInUser.getOrders()) {
			System.out.println("  Food name: " + order.getFoodName());
			System.out.println("  Flavor: " + order.getFlavor());
			System.out.println("  Quantity: " + order.getQuantity());
			System.out.println("  Price: " + order.getPrice());
			System.out.println("  Subtotal: " + order.getSubtotal());
			System.out.println("----------------------------");
			total += order.getSubtotal();
		}
		System.out.println("  Total: " + total);
		System.out.println("----------------------------");
		loggedInUser.clearOrders();
		
		
		System.out.println("\n");
		System.out.println("--------------------------------------------");
		System.out.println("   Please enter to go back to the menu.     ");
		System.out.println("--------------------------------------------");
		showFoodMenu();
		
		}
		private static double calculatePrice(String foodName,int quantity) {
			double price = 0;
			switch(foodName) {
			case"Chicken":
				price = 70.00;
				break;
			case"Sandwich":
				price = 30.00;
				break;
			case"Pizza":
				price = 175.00;
				break;
			case"Burger":
				price = 90.00;
				break;
			case"Fries":
				price = 70.00;
				break;
			case"Pancake":
				price = 30.00;
				break;
			case"Donut":
				price = 50.00;
				break;
			case"Cake":
				price = 240.00;
				break;
			case"Waffle":
				price = 25.00;
				break;
			}
			return price * quantity;
		}
		private static class User{
			private String name;
			private String password;
			private List<Order>orders;
			
			public User(String name, String password){
				this.name = name;
				this.password = password;
				this.orders = new ArrayList<>();
			}
			public String getName() {
				return name;
			}
			public String getPassword() {
				return password;
			}
			public void addOrder(Order order) {
				orders.add(order);
			}
			public List<Order>getOrders(){
				return orders;
			}
			public void clearOrders() {
				orders.clear();
			}
		}
		private static class Order {
			private String foodName;
			private String flavor;
			private int quantity;
			private double price;
			
			public Order(String foodName, String flavor, int quantity,double price) {
				this.foodName = foodName;
				this.flavor = flavor;
				this.quantity = quantity;
				this.price = price;
			} 
			public String getFoodName(){
				return foodName;
			}
			public String getFlavor(){
				return flavor;
			}
			public int getQuantity(){
				return quantity;
			}
			public double getPrice(){
				return price;
			}
			public double getSubtotal(){
				return quantity * price;
			}
		}
}
