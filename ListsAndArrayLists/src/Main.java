import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("00359 895 41 61 54");

    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printActions();

        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice: (6 to show available actions");
           int action = scanner.nextInt();
            scanner.nextLine();
            switch (action {
                case 0:
                    System.out.println("\nShuting down..");
                    break;
                case 1:
                    printInstructions();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    private static void printActions() {
        System.out.println("\nAvailable actions:\npress ");
        System.out.println("\t 0 - To shutdown");
        System.out.println("\t 1- to print contacts");
        System.out.println("\t 2 - to add an new contatc");
        System.out.println("\t 3 - to modify a contact");
        System.out.println("\t 4 - to remove a contact");
        System.out.println("\t 5 - to search for an excisting contact");
        System.out.println("\t 6 - to quit");

        System.out.println("Choose your action: ");
    }

    private static void startPhone() {
        System.out.println("Starting phone...");
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options");
        System.out.println("\t 1- to print the list of grocery items");
        System.out.println("\t 2 - to add an item");
        System.out.println("\t 3 - to modify an item");
        System.out.println("\t 4 - to remoce an item");
        System.out.println("\t 5 - to search for an item");
        System.out.println("\t 6 - to quit");

    }

    public static void addItem() {
        System.out.println("Please enter the grocery item: ");
        mobilePhone.storeContact(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.println("Enter item number: ");
        int itemNo = scanner.nextInt();
        System.out.println("Enter replacement Item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo - 1, newItem);

    }

    public static void removeItem() {
        System.out.println("Enter item number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        groceryList.removeGroceryItem(itemNo);
    }

    public static void searchForItem() {
        System.out.println("Enter item to search for: ");
        String searchItem = scanner.nextLine();
        if (groceryList.findItem(searchItem) != null) {
            System.out.println("Found " + searchItem + "in groceryList");
        } else {
            System.out.println(searchItem + " not found in the grocery list");
        }
    }
}
