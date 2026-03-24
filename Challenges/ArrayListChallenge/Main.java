
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> groceryList = new ArrayList<>();
        doGroceries(sc, groceryList);
    }

    private static int menu(Scanner sc){

        System.out.println("Available actions:");
        System.out.println("0 - to shutdown");
        System.out.println("1 - to add item(s) to list (comma delimited list)");
        System.out.println("2 - to remove any items (comma delimited list)");
        System.out.print("Enter a number for which action you want to do: ");

        if (sc.hasNextInt()) {
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            return switch (choice) {
                case 0 -> 0;
                case 1 -> 1;
                case 2 -> 2;
                default -> -1;
            };
        } else {
            sc.nextLine(); // clear invalid input
            return -1;
        }
    }

    private static void doGroceries(Scanner sc, ArrayList<String> groceryList){

        int action;

        while(true){

            action = menu(sc);

            if(action == 0){
                System.out.println("Your grocery list is updated");
                printGrocery(groceryList);
                break;
            }
            else if(action == 1){
                addGrocery(sc, groceryList);
                printGrocery(groceryList);
            }
            else if(action == 2){
                removeGrocery(sc, groceryList);
                printGrocery(groceryList);
            }
            else {
                System.out.println("ENTER A VALID ACTION!!");
                System.out.println();
            }

        }
    }

    private static void addGrocery(Scanner sc, ArrayList<String> groceryList){

        System.out.println("Enter your list(s) that you want to add: ");

        ArrayList<String> groceryItems = readItems(sc);

        groceryItems.removeIf(item -> groceryList.contains(item)); // remove the
        // items which is already exists in groceryList
        groceryList.addAll(groceryItems);
        System.out.printf("Items %s added successfully %n", groceryItems);

    }

    private static void removeGrocery(Scanner sc, ArrayList<String> groceryList){

        System.out.println("Enter your list(s) that you want to remove: ");

        ArrayList<String> groceryItems = readItems(sc);
        groceryList.removeAll(groceryItems);
        System.out.printf("Items %s removed successfully %n", groceryItems);
    }

    private static ArrayList<String> readItems(Scanner sc){
        String input = sc.nextLine().toLowerCase().trim();
        return new ArrayList<>(Arrays.asList(input.split("\\s*,\\s*")));
    }

    private static void printGrocery(ArrayList<String> groceryList){

        ArrayList<String> copy = new ArrayList<>(groceryList);
        copy.sort(Comparator.naturalOrder());

        System.out.println("Grocery List: " + copy);
    }
}