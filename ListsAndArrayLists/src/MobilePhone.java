import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> contacts = new ArrayList<>();

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.contacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact is already on file");
            return false;
        }
        contact.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int findPosition = findContact(oldContact);
        if (findPosition < 0) {
            System.out.println(oldContact.getName() + " , was not found.");
            return false;
        }
        this.contacts.set(findPosition, newContact);
        System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
        return true;

    }

    public boolean removeContact(Contact contact) {
        int findPosition = findContact(contact);
        if (findPosition < 0) {
            System.out.println(contact.getName() + " , was not found.");
            return false;
        }
        this.contacts.remove(findPosition);
        System.out.println(contact.getName() + ", was deleted");
        return true;
    }

    private int findContact(String contactName) {
        for (int i = 0; i < this.contacts.size(); i++) {
            Contact contact = this.contacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }

        }
        return -1;
    }

    private int findContact(Contact contact) {
        return this.contacts.indexOf(contact);
    }

    public void storeContact(Contact contact) {
        contacts.add(contact);
    }

    public String queryContact(Contact contact) {
        if (findContact(contact) >= 0) {
            return contact.getName();
        }
        return null;
    }

    /*public void modifyContacts(int position, Contact newItem){
        contacts.set(position,newItem);
        System.out.println("Phone number on " + (position+1) + " has been modified");
    }

    public void  removeContact(int position){
        Contact number = contacts.get(position);
        contacts.remove(position);
        System.out.println("Phone number " + number + " has been removed");
    }

    public Contact findNumber(Contact searchItem){
        //boolean exists = groceryList.contains(searchItem);

        int position = contacts.indexOf(searchItem);
        if(position>=0){
            return contacts.get(position);
        }
        return null;
    }*/
}
