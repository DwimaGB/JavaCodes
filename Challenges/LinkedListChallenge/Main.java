import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Place> placesList = createPlacesList(sc);
        System.out.println(placesList);

        LinkedList<Place> placesToVisit = createPlacesLinkedList(placesList); // create sorted Linkedlist
        // based on distance
        System.out.println(placesToVisit);

        navigatePlaces(sc, placesToVisit);
    }

    private static void navigatePlaces(Scanner sc, LinkedList<Place> placesToVisit){

        String action;
        ListIterator<Place> iterator = placesToVisit.listIterator();
        boolean goingForward = true;

        while(true){

            action = menu(sc);

            switch(action){
                case "F":
                    if(!goingForward){ // previous operations had backward
                        if(iterator.hasNext()) {
                            iterator.next();
                        }
                        goingForward = true;
                    }
                    if(!iterator.hasNext()){
                        System.out.println("Reached the end of the list.");
                        break;
                    }
                    Place nextPlace = iterator.next();
                    System.out.println("Now visiting: " + nextPlace);
                    System.out.println();
                    break;

                case "B":
                    if(goingForward){ // previous operations had forward
                        if(iterator.hasPrevious()){
                            iterator.previous();
                        }
                        goingForward = false;
                    }

                    if(!iterator.hasPrevious()){
                        System.out.println("You are at the start of the list.");
                        break;
                    }
                    Place prevPlace = iterator.previous();
                    System.out.println("Now visiting: " + prevPlace);
                    System.out.println();
                    break;

                case "L":
                    printPlaces(placesToVisit);
                    break;

                case "M":
                    menu(sc);
                    break;

                case "Q":
                    return;

                default:
                    System.out.println("Invalid input!");
            }
        }
    }

    private static void printPlaces(LinkedList<Place> placesToVisit){

        if(placesToVisit.isEmpty()){
            System.out.println("No places to visit.");
            return;
        }

        ListIterator<Place> iterator = placesToVisit.listIterator(1);
        Place previousPlace = placesToVisit.get(0);

        while(iterator.hasNext()){
            var place = iterator.next();
            System.out.println("--> From: " + previousPlace.getName() + " to "
                                + place.getName());
            previousPlace = place;
        }
    }

    private static ArrayList<Place> createPlacesList(Scanner sc){

        System.out.print("Enter how many places you want to add: ");
        int noPlaces = sc.nextInt();
        sc.nextLine();

        ArrayList<Place> placesList = new ArrayList<>();
        String town;
        int distance;

        for(int i = 0; i < noPlaces; i++){

            System.out.print("Enter town name: ");
            town = sc.nextLine();

            boolean exists = false;

            for(Place place : placesList){
                if(place.getName().equalsIgnoreCase(town)){
                    exists = true;
                    break;
                }
            }

            if(exists){
                System.out.println("Place already exists!");
                i--; // retry same iteration
                continue;
            }

            System.out.print("Enter the distance from your starting place: ");
            distance = sc.nextInt();
            sc.nextLine();

            placesList.add(new Place(town, distance));
        }

        return placesList;
    }

    private static LinkedList<Place> createPlacesLinkedList(ArrayList<Place> placesList){

        ArrayList<Place> copy = new ArrayList<>(placesList);

        copy.sort(Comparator.comparing(Place::getDistance));

        return new LinkedList<>(copy);
    }

    private static String menu(Scanner sc){

        String textBlock = """
                Available actions (select word or letter):
                (F)orward
                (B)ackward
                (L)ist places
                (M)enu
                (Q)Quit
                """;

        System.out.println(textBlock);

        String input = sc.nextLine().trim().toUpperCase();

        if(input.isEmpty()) return "";

        return input.substring(0, 1);
    }
}