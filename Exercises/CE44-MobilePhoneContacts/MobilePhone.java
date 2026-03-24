
import java.util.*;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber){
        this.myNumber = myNumber;
        myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact){
        if(findContact(contact) >= 0) return false;

        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact){

        int index = findContact(oldContact);
        if(index < 0) return false;

        myContacts.set(index, newContact);
        return true;
    }

    public boolean removeContact(Contact contact){

        int index = findContact(contact);
        if(index < 0) return false;

        myContacts.remove(index);
        return true;
    }

    private int findContact(Contact contact){
        return findContact(contact.getName());
    }

    private int findContact(String name){
        for(int i = 0; i < myContacts.size(); i++){
            Contact contact = myContacts.get(i);

            if(contact.getName().equalsIgnoreCase(name)){
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String name){
        int index = findContact(name);
        return index >= 0 ? myContacts.get(index) : null;
    }

    public void printContacts(){

        System.out.println("Contact List:");
        for(int i = 0; i < myContacts.size(); i++){
            Contact contact = myContacts.get(i);
            System.out.printf("%d. %s -> %s%n", i+1, contact.getName(), contact.getPhoneNumber());
        }

    }
}
