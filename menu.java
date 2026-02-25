import java.util.*;
public class Menu {
    static double totalAmount = 0;
    static List<String> orderedItems = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n+-----------------------+");
            System.out.println("|         MENU          |");
            System.out.println("+-----------------------+");
            System.out.println("| 1. Tiffin             |");
            System.out.println("| 2. Lunch              |");
            System.out.println("| 3. Snacks             |");
            System.out.println("| 4. View Total Bill    |");
            System.out.println("| 5. Exit               |");
            System.out.println("+-----------------------+");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    tiffin(sc);
                    break;
                case 2:
                    lunches(sc);
                    break;
                case 3:
                    snacks(sc);
                    break;
                case 4:
                    showBill();
                    break;
                case 5:
                    System.out.println("Thank you for visiting!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
        public static void tiffin(Scanner sc) {
        System.out.println("\n+--------------------------------------+");
        System.out.println("|             TIFFIN MENU              |");
        System.out.println("+----+------------------+--------------+");
        System.out.println("| No | Item Name        | Price        |");
        System.out.println("+----+------------------+--------------+");
        System.out.println("| 1  | Vada             | ₹10          |");
        System.out.println("| 2  | Dosa             | ₹20          |");
        System.out.println("| 3  | Idli             | ₹30          |");
        System.out.println("| 4  | Puri             | ₹40          |");
        System.out.println("| 5  | Back             |              |");
        System.out.println("+----+------------------+--------------+");

        int choice = sc.nextInt();
        switch (choice) {
            case 1: addItem("Vada", 10); break;
            case 2: addItem("Dosa", 20); break;
            case 3: addItem("Idli", 30); break;
            case 4: addItem("Puri", 40); break;
            case 5: return;
            default: System.out.println("Invalid choice!");
        }
    }
    public static void lunches(Scanner sc) {
        System.out.println("\n+--------------------------------------+");
        System.out.println("|              LUNCH MENU              |");
        System.out.println("+----+------------------+--------------+");
        System.out.println("| No | Item Name        | Price        |");
        System.out.println("+----+------------------+--------------+");
        System.out.println("| 1  | Veg Biryani      | ₹100         |");
        System.out.println("| 2  | Egg Fried Rice   | ₹120          |");
        System.out.println("| 3  | Paneer Biryani   | ₹150         |");
        System.out.println("| 4  | Chicken Biryani  | ₹170         |");
        System.out.println("| 5  | Back             |              |");
        System.out.println("+----+------------------+--------------+");

        int choice = sc.nextInt();
        switch (choice) {
            case 1: addItem("Veg Biryani", 100); break;
            case 2: addItem("Egg Fried Rice", 50); break;
            case 3: addItem("Paneer Biryani", 150); break;
            case 4: addItem("Chicken Biryani", 170); break;
            case 5: return;
            default: System.out.println("Invalid choice!");
        }
    }
    public static void snacks(Scanner sc) {
        System.out.println("\n+--------------------------------------+");
        System.out.println("|              SNACKS MENU             |");
        System.out.println("+----+------------------+--------------+");
        System.out.println("| No | Item Name        | Price        |");
        System.out.println("+----+------------------+--------------+");
        System.out.println("| 1  | Chips            | ₹30          |");
        System.out.println("| 2  | Chocolates       | ₹50          |");
        System.out.println("| 3  | Biscuits         | ₹20          |");
        System.out.println("| 4  | Cookies          | ₹40          |");
        System.out.println("| 5  | Back             |              |");
        System.out.println("+----+------------------+--------------+");

        int choice = sc.nextInt();
        switch (choice) {
            case 1: addItem("Chips", 30); break;
            case 2: addItem("Chocolates", 50); break;
            case 3: addItem("Biscuits", 20); break;
            case 4: addItem("Cookies", 40); break;
            case 5: return;
            default: System.out.println("Invalid choice!");
        }
    }
    public static void addItem(String name, double price) {
        orderedItems.add(name + " - ₹" + price);
        totalAmount += price;
        System.out.println(name + " added successfully!");
    }
    public static void showBill() {
        System.out.println("\n+--------------------------------------+");
        System.out.println("|           ORDERED ITEMS              |");
        System.out.println("+--------------------------------------+");

        if (orderedItems.isEmpty()) {
            System.out.println("| No items ordered yet.               |");
        } else {
            for (String item : orderedItems) {
                System.out.printf("| %-36s |\n", item);
            }
        }
        System.out.println("+--------------------------------------+");
        System.out.printf("| TOTAL AMOUNT : ₹%-21.2f |\n", totalAmount);
        System.out.println("+--------------------------------------+");
    }
}